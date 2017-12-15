var Request = require("request");
var handlebars = require('handlebars');
var When = require("when");

handlebars.registerHelper('json', function(context) {
    return JSON.stringify(context);
});

module.exports = [{
    method: 'POST',
    path: '/users',
    config: {
        handler: function(request, reply) {
            var server = this.config.server;
            var url = "http://" + server.api.host + ":" + server.api.port + "/users";
            var payload = request.payload;
            Request.post({
                url: url,
                form: payload
            }, function(err, httpResponse, body) {
                reply(body);
            });

        }
    }
}, {
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
}, {
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
}, {
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
            });
        }
    }
}, {
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
        });
    }
}, {
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
}, {
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
}, {
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
}];
