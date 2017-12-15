var Hoek = require("hoek");
var Path = require("path");
var Url = require("url");
var Fs = require("fs");
var Genid = require("genid");
var LRU = require("lru-cache");
var handlebars = require('handlebars');
var _ = require("lodash");
var Profiles = require("./lib/profiles");
var Vision = require("vision");
var Inert = require('inert');
var Routes = require('./routes.js');
var Request = require('request');

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

    plugin.route(Routes);

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
