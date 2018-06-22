var handlebars = require('handlebars');
var Path = require("path");

handlebars.registerHelper('json', function(context) {
  var con = JSON.stringify(context);
  return con;
});

module.exports = function(options) {

  var routes = [{
    method: 'GET',
    path: '/',
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

  }, {
    method: 'GET',
    path: '/{path*}',
    config: {
      handler: {
        directory: {
          path: Path.join(__dirname, "../public")
        }
      }
    }
  }];

  return routes;
}
