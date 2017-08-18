var mongoose = require('mongoose');
var models = require("./models/all-models");
var fs = require('fs');
var filter_file = require("./filter_file");
var Request = require("request");
var bodyParser =  require('hapi-bodyparser');
var randToken = require('rand-token');


exports.register = function(server, options, next) {
  var context = {config: options.config};
  
  server.bind(context);
  server.register(bodyParser);

  server.route({
    method: 'GET',
    path: '/handshake',
    handler: function(request, reply) {
      var token = randToken.generate(16);
      reply(token);
    }
  });

 server.route({
   method: 'GET',
   path: '/users/exists/{username}',
   handler: function(request, reply){
     var username = request.params.username;

     reply(username);
   } 
  }); 

  server.route({
    method: 'GET',
    path: '/course/{id*}',
    handler: function(request, reply) {

      if (!request.params.id) {
        models.Course.find({}, function(err, items) {
          reply(items);
        });
      } else {
        models.Course.find({
          "_id": mongoose.Types.ObjectId(request.params.id)
        }, function(err, items) {
          reply(items);
        });
      }
    }
  });

  server.route({
    method: 'GET',
    path: '/getFiles/{course_name}/{template_name}/{sessionId}',
    handler: function(request, reply) {
      var requestParam = request.params;
      var coursefile = requestParam.course_name;
      var templatename = requestParam.template_name;
      var sessionId = requestParam.sessionId;

      var program = coursefile + ".java";
      var file_content = fs.readFileSync(__dirname + '/../run/runner/' + coursefile + '/SrcTemplate/' + templatename + '/' + program, 'utf8');
      file_content = filter_file.geCodeTemplate(file_content, sessionId);
      var files = [{
        type: "file",
        filename: request.params.course_name + ".java",
        contents: file_content,
        active: true
      }]
      reply(files);
    }
  });

  server.route({
    method: 'POST',
    path: '/java/{testName}/{sessionId}',
    handler: function(request, reply) {
      var server = this.config.server;
      var params = request.params;
      var testName = encodeURIComponent(params.testName);
      var sessionId = encodeURIComponent(params.sessionId);
      var payload = request.payload;
      var url = "http://" + server.run.host + ":" + server.run.port + "/java/" + testName + "/" + sessionId;

      for (var key in payload.files) {
        var file_content = payload.files[key].contents;
        request.payload.files[key].contents = filter_file.insertToCodeTemplate(file_content, sessionId);
      }
 
      Request.post({url:url, form: payload}, function(err, httpResponse, body){
	reply(body); 
      });      
    }
  });
  return next();
};

exports.register.attributes = {
  pkg: require('./package.json')
};
