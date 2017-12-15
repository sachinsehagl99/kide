var Hoek = require("hoek");
var Boom = require("boom");
var Iron = require("iron");
var Path = require("path");
var Url = require("url");
var Fs = require("fs");
var Genid = require("genid");
var LRU = require("lru-cache");
var When = require("when");
var Request = require("request");
var _ = require("lodash");
var handlebars = require('handlebars');
var Profiles = require("./lib/profiles");
var Vision = require("vision");
var Inert = require('inert');

handlebars.registerHelper('json', function(context) {
    return JSON.stringify(context);
});

var optionforcookie = {
    storeBlank: false,
    cookieOptions: {
        password: 'passwordmhcgkhxscdvyfbugnbtyvrcfegtfrtbgjgvdcrgdcthybgvnfbcvfxzdfcdrvthyjmbgtvhnfcserse3wxrfevtrghyr',
        isSecure: true
    }
};
exports.register = function(plugin, options, next) {
    var context = {
        config: options.config,
        local: options.config.expose,
    };

    plugin.register([{
        register: require('yar'),
        options: optionforcookie
    }, require('bell')], function(err) {
        plugin.auth.strategy('facebook', 'bell', {
            provider: 'facebook',
            password: 'cookie_encryption_password_secure',
            isSecure: false,
            clientId: '200249893877832',
            clientSecret: 'b1dd681d743b0f6bc3acc33b16d7748e',
        });

        plugin.route({
            method: ['GET', 'POST'],
            path: '/auth/{service}',
            config: {
                auth: {
                    strategy: 'facebook',
                    mode: 'try'
                },
                handler: function(request, reply) {
                    if (!request.auth.isAuthenticated) {
                        return reply('Authentication failed due to: ' + request.auth.error.message);
                    }
                    console.log(request.params.service);
                    var cred = request.auth.credentials;
                    var ser_id = cred.provider + "_id";
                    var credentials = {
                        ser_id: ser_id,
                        [ser_id]: cred.profile.id,
                        name: cred.profile.displayName,
                        email: cred.profile.email,
                        pro_pic: "null at the moment"
                    };
                    console.log(credentials);
                    process.nextTick(function() {
                        var url = "http://" + options.config.server.api.host + ":" + options.config.server.api.port + "/users";
                        Request.post({
                            url: url,
                            form: credentials
                        }, function(err, httpResponse, body) {
                            console.log(body);
                        });
                    });
                    request.yar.set('credentials', credentials);
		    console.log(request.yar);
		    reply.view("auth/complete.html", {
                        payload: "auth." + Buffer(JSON.stringify({
                            status: "success"
                        })).toString("base64")
                    });

                }
            }
        });
    });
    plugin.register(Inert);

    plugin.register(Vision, function(err) {
        if (err) {
            console.log('Cannot register vision')
        }

        plugin.views({
            engines: {
                html: handlebars
            },
            relativeTo: __dirname,
            path: 'views',
            partialsPath: "views/partials",
            helpersPath: "views/helpers",
        });
    });

    plugin.bind(context);

    plugin.route({
        method: 'POST',
        path: '/users',
        config: {
            handler: function(request, reply) {
                //console.log(request.payload);
                var server = this.config.server;
                var url = "http://" + server.api.host + ":" + server.api.port + "/users";
                var payload = request.payload;
                Request.post({
                    url: url,
                    form: payload
                }, function(err, httpResponse, body) {
                    reply(body);
                    //console.log(body);
                });

            }
        }
    });
    plugin.route({
        method: 'GET',
        path: '/',
        config: {
            handler: function(request, reply) {
                var context = {
                    config: this.local
                };
                var server = this.config.server;
                Request("http://" + server.api.host + ":" + server.api.port + "/course", function(err, res, data) {
                    var data = JSON.parse(data);
                    //console.log(data);
                    var promisify = function(key) {
                        return new Promise(function(resolve, reject) {
                            Request.get("http://" + server.api.host + ":" + server.api.port + "/handshake", function(err, res, token) {
                                data[key].plunkId = token;
                                resolve();
                            });
                        });
                    };
                    var promises = [];
                    for (var key in data) {
                        promises.push(promisify(key));
                    }
                    Promise.all(promises).then(function() {
                        context.body = {
                            plunk: data
                        };
                        reply.view("home", context, {
                            layout: "landing"
                        });
                    }).catch(function(err) {
                        console.log(err);
                    });
                });
            }
        }
    });

    plugin.route({
        method: 'GET',
        path: '/edit/{courseName}/{testNo}/{plunkId}',
        config: {
            handler: function(request, reply) {
                var server = this.config.server;
                var param = request.params;
                var courseName = request.params.courseName;
                var context = {
                    "url": {
                        "run": ""
                    }
                };

                reply.view("editor", context);

            }
        }
    });

    plugin.route({
        method: 'GET',
        path: '/getFiles/{courseName}/{templateName}/{sessionId}',
        config: {
            handler: function(request, reply) {
                var server = this.config.server;
                var requestParams = request.params;
                var courseName = requestParams.courseName;
                var templateName = requestParams.templateName;
                var sessionId = requestParams.sessionId;

                Request("http://" + server.api.host + ":" + server.api.port + "/getFiles/" + courseName + "/" + templateName + "/" + sessionId, function(err, res, body) {
                    reply(body);
                    //console.log(body);
                });
            }
        }
    });

    plugin.route({
        method: 'POST',
        path: '/java/{testName}/{pathId}',
        handler: function(request, reply) {
            var server = this.config.server;
            var params = request.params;
            var testName = encodeURIComponent(params.testName);
            var pathId = encodeURIComponent(params.pathId);
            var payload = request.payload;
            var url = "http://" + server.api.host + ":" + server.api.port + "/java/" + testName + "/" + pathId;

            Request.post({
                url: url,
                form: payload
            }, function(err, httpResponse, body) {
                reply(body);
                //console.log(body);
            });
        }
    });

    plugin.route({
        method: 'GET',
        path: '/login',
        config: {
            handler: function(request, reply) {
                var context = {};
                reply.view("login", context, {
                    layout: "landing"
                });
            }
        }
    });

    plugin.route({
        method: 'GET',
        path: '/users/exists/{username}',
        config: {
            handler: function(request, reply) {
                var server = this.config.server;
                var username = request.params.username;

                Request("http://" + server.api.host + ":" + server.api.port + '/users/exists/' + username, function(err, res, body) {
                    console.log("==========");
                    console.log(body);
                });
            }
        }
    });

    plugin.route({
        method: 'GET',
        path: '/users/{username}',
        config: {
            handler: function(request, reply) {
                var context = {
                    config: this.local
                };
                var fetchUser = function(username) {
                    return When.promise(function(resolve, reject) {
                        request.server.methods.fetchUser(username, function(err, result) {
                            if (err) return reject(err);
                            resolve(result);
                        });
                    });
                };
                var fetchPlunks = function(q) {
                    return When.promise(function(resolve, reject) {
                        request.server.methods.fetchPlunks(q, function(err, result) {
                            if (err) return reject(err);
                            resolve(result);
                        });
                    });
                };
                var q = ["@" + request.params.username];
                var identity = request.state["plunker.tok"];

                if (!identity || request.params.username !== identity.user_name) {
                    q.push("in:plunker/public");
                }

                When.join(
                    fetchUser(request.params.username),
                    fetchPlunks(q.join(" "))
                ).then(function(results) {
                    context.user = results[0];
                    context.plunks = results[1];

                    reply.view("user", context, {
                        layout: "landing"
                    });
                });
            }
        }
    });

    // All other static assets
    plugin.route({
        method: 'GET',
        path: '/{path*}',
        config: {
            handler: {
                directory: {
                    path: Path.join(__dirname, "public")
                }
            }
        }
    });

    plugin.route({
        method: "*",
        path: "/{p*}",
        config: {
            handler: function(request, reply) {
                reply.view("notfound", {}, {
                    layout: "landing"
                }).code(404);
            }
        }
    });

    return next();
};

exports.register.attributes = {
    pkg: require('./package.json')
};
