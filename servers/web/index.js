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
//var Passport = require("passport");
//var FacebookStrategy = require("passport-facebook").Strategy;
//var GithubStrategy = require("passport-github").Strategy;
//var DropboxStrategy = require("passport-dropbox-oauth2").Strategy;
//var GoogleStrategy = require("passport-google-oauth").OAuth2Strategy;
//var TwitterStrategy = require("passport-twitter").Strategy;
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

var internals = {
    profileBuilders: {}
};

/*
internals.createOAuth2Delegate = function (service, options) {
  return function (accessToken, refreshToken, profile, done) {
    //profile = Profiles[service](profile._json);
    var ser_id = service+"_id";
     var credentials = {
      ser_id: ser_id,
      [ser_id]: profile.id,
      name: profile.displayName,
      email: profile.emails[0].value,
      pro_pic : profile.photos[0].value
    };
    // Since we may not be using SSL, seal the OAuth information of users that
    // will be passed over an open channel
       process.nextTick(function(){
       var url =  "http://localhost:8080/users";
      console.log(url);
       Request.post({url:url, form: credentials}, function(err, httpResponse, body){
       console.log(err);	       
	done(null, body); 
      }); 
       });
  
  };
};

internals.profileBuilders.github = function (json) {
};
*/

exports.register = function(plugin, options, next) {
    var context = {
        config: options.config,
        local: options.config.expose,
    };

    internals.macPrefix = options.config.auth.macPrefix;
    plugin.register([{register: require('yar'), options: optionforcookie},require('bell')], function(err) {
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

                    //reply('<pre>' + JSON.stringify(request.auth.credentials, null, 4) + '</pre>');
                    reply.redirect('/');
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

    //plugin.ext('onPreResponse', internals.onPreResponse);
    /*
  Passport.framework({
    initialize: internals.initialize.bind(context),
    authenticate: internals.authenticate.bind(context)
  });
 Passport.use('facebook', new FacebookStrategy(options.config.auth.providers.facebook, internals.createOAuth2Delegate('facebook', options)));
  Passport.use('github', new GithubStrategy(options.config.auth.providers.github, internals.createOAuth2Delegate('github', options)));
  Passport.use('dropbox', new DropboxStrategy(options.config.auth.providers.dropbox, internals.createOAuth2Delegate('dropbox', options)));
  Passport.use('google', new GoogleStrategy(options.config.auth.providers.google, internals.createOAuth2Delegate('google', options)));
  Passport.use('twitter', new TwitterStrategy(options.config.auth.providers.twitter, internals.createOAuth2Delegate('twitter', options)));
  
  Passport.serializeUser(function(user, done) {
    done(null, user);
  });
  
  Passport.deserializeUser(function(obj, done) {
    done(null, obj);
  });
*/
    plugin.method("fetchPlunk", internals.fetchPlunk, {
        cache: {
            expiresIn: 1000 * 60,
            staleIn: 1000 * 30,
            staleTimeout: 1000 * 10,
            generateTimeout: 100
        }
    });

    plugin.method("fetchComments", internals.fetchComments, {
        cache: {
            expiresIn: 1000 * 60,
            staleIn: 1000 * 30,
            staleTimeout: 1000 * 10,
            generateTimeout: 100
        }
    });

    plugin.method("fetchPlunks", internals.fetchPlunks, {
        cache: {
            expiresIn: 1000 * 60,
            staleIn: 1000 * 30,
            staleTimeout: 1000 * 10,
            generateTimeout: 100
        }
    });

    plugin.method("fetchUser", internals.fetchUser, {
        cache: {
            expiresIn: 1000 * 60,
            staleIn: 1000 * 30,
            staleTimeout: 1000 * 10,
            generateTimeout: 100
        }
    });


    plugin.state('plunker.tok', {
        ttl: 24 * 60 * 60 * 1000, // One day
        isSecure: false,
        path: '/',
        encoding: 'iron',
        password: options.config.auth.secret
    });
    /*
                    plugin.route({
                        method: 'GET',
                        path: '/auth/{service}',
                        config: {
                            auth: false,
                            handler: function(request, reply) {

                                Passport.authenticate(request.params.service, {
                                    scope: ['email']
                                })(request, reply);
                            }
                        }
                    });

                    plugin.route({
                        method: 'GET',
                        path: '/auth/{service}/callback',
                        config: {
                            auth: false,
                            handler: function(request, reply) {
                                console.log("Data mil gaya");
                                Passport.authenticate(request.params.service)(request, reply, function() {
                                    reply.view("auth/complete.html", {
                                        payload: "auth." + Buffer(JSON.stringify({
                                            status: "success"
                                        })).toString("base64")
                                    });
                                });
                            }
                        }
                    });
		    */
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

internals.onPreResponse = function(request, reply) {
    var response = request.response;

    if (response.isBoom) {
        var context = {
            error: response,
        };

        return reply.view("error", context, {
            layout: "landing"
        });
    }

    return reply();
};

internals.initialize = function() {

};

internals.fetchComments = function(plunkId, next) {
    Request.get({
        url: this.local.url.api + "/plunks/" + plunkId + "/comments",
        json: true
    }, function(err, resp, body) {
        if (err) return next(err);
        if (resp.statusCode >= 400) return next(Boom.create(resp.statusCode, resp.body.error));

        next(null, resp.body);
    });
};


internals.fetchPlunk = function(plunkId, next) {
    Request.get({
        url: this.local.url.api + "/plunks/" + plunkId,
        json: true
    }, function(err, resp, body) {
        if (err) return next(err);
        if (resp.statusCode >= 400) return next(Boom.create(resp.statusCode, resp.body.error));

        next(null, resp.body);
    });
};

internals.fetchPlunks = function(q, next) {
    Request.get({
        url: this.local.url.api + "/plunks",
        json: true,
        qs: {
            q: q
        }
    }, function(err, resp, body) {
        if (err) return next(err);
        if (resp.statusCode >= 400) return next(Boom.create(resp.statusCode, resp.body.error));
        next(null, resp.body.results);
    });
};

internals.fetchUser = function(username, next) {
    Request.get({
        url: this.local.url.api + "/users/" + username,
        json: true
    }, function(err, resp, body) {
        if (err) return next(err);
        if (resp.statusCode >= 400) return next(Boom.create(resp.statusCode, resp.body.error));

        next(null, resp.body);
    });
};

internals.sendAuthResponse = function(reply, payload) {
    reply.view("auth/complete.html", {
        payload: "auth." + Buffer(JSON.stringify(payload)).toString("base64")
    });
};

internals.authenticate = function(passport, name, options, callback) {
    var config = this.config;
    var strategy = passport._strategy(name);

    if (!strategy) {
        return function(request, reply, next) {

            return internals.sendAuthResponse(reply, {
                status: "error",
                payload: "Social service not available."
            });
        };
    }

    // Monkey patch passport services to use node-request and its proxy support
    if (strategy && config.proxy && strategy._oauth2) {
        strategy._oauth2._executeRequest = function(lib, options, post_body, callback) {
            var parts = options.path.split("?");

            options = {
                url: Url.format({
                    protocol: options.port === 443 ? "https" : "http",
                    hostname: options.host,
                    pathname: parts[0],
                    search: parts[1] || ""
                }),
                method: options.method,
                headers: options.headers
            };

            if (config.proxy) options.proxy = config.proxy;
            if (post_body) options.body = post_body;

            Request(options, function(err, response, body) {
                callback(err, body, response);
            });
        };
    }

    if (config.proxy && strategy._oauth) {
        var oauth = strategy._oauth;

        strategy._oauth._performSecureRequest = function(oauth_token, oauth_token_secret, method, url, extra_params, post_body, post_content_type, callback) {
            var options = {
                url: url,
                qs: extra_params,
                method: method,
                oauth: {
                    consumer_key: oauth._consumerKey,
                    consumer_secret: oauth._decodeData(oauth._consumerSecret),
                    token: oauth_token,
                    token_secret: oauth_token_secret
                }
            };

            if (config.proxy) options.proxy = config.proxy;
            if (post_body) {
                options.headers = {
                    'content-type': post_content_type
                };

                options.body = post_body;
            }

            Request(options, function(err, response, body) {
                callback(err, body, response);
            });
        };
    }

    if (!strategy._secrets) {
        strategy._secrets = LRU({
            max: 500,
            maxAge: 1000 * 60 * 60
        });
    }

    return function authenticate(request, reply, next) {
        var req = {};
        req.headers = request.headers;
        req.query = request.url.query;
        req.body = request.payload;
        req._passport = request._passport;
        req.session = request.session || {};
        request._synth = req;

        if (req.query && req.query.oauth_token) {
            req.session.oauth = strategy._secrets.get(req.query.oauth_token);
        }

        // Accommodate passport-google in Sythentic Request

        req.url = request.url;
        req.url.method = request.method.toUpperCase();
        req.url.url = request.url.href;

        strategy._key = "oauth";

        strategy.success = function(profile, credentials) {
            var payload = {
                service: name,
                profile: profile,
                credentials: credentials
            };

            internals.encodeAndSign(config.auth.secret, config.auth.macPrefix, payload, function(err, envelope) {
                if (err) return internals.sendAuthResponse(reply, {
                    status: "error",
                    payload: err.message
                });

                internals.sendAuthResponse(reply, {
                    status: "success",
                    payload: envelope
                });
            });
        };

        strategy.error = function(err) {
            internals.sendAuthResponse(reply, {
                status: "error",
                payload: err.message
            });
        };

        strategy.fail = function(challenge, status) {
            internals.sendAuthResponse(reply, {
                status: "fail",
                payload: status
            });
        };

        strategy.redirect = function(url, status) {
            if (req.session && req.session.oauth) {
                strategy._secrets.set(req.session.oauth.oauth_token, req.session.oauth);
            }

            reply('You are being redirected...').redirect(url);
        };

        strategy.authenticate(req, options);
    };
};


internals.createSession = function(request, next) {
    process.nextTick(function() {
        next(null, {
            sid: Genid(),
            user: null
        });
    });
};

/**
 * Create a signed json envelope for the provided payload
 **/
internals.encodeAndSign = function(password, macPrefix, json, callback) {
    var stringified = null;

    try {
        stringified = JSON.stringify(json);
    } catch (e) {
        return callback(e);
    }

    Iron.hmacWithPassword(password, Iron.defaults.integrity, [macPrefix, stringified].join("\n"), function(err, mac) {
        if (err) return callback(err);

        var envelope = {
            payload: json,
            signature: mac.salt + "+" + mac.digest
        };

        callback(null, envelope);
    });
};
