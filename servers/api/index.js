var mongoose = require('mongoose');
var models = require("./models/all-models");
var fs = require('fs');
var filter_file = require("./filter_file");
var Request = require("request");
var bodyParser =  require('hapi-bodyparser');
var randToken = require('rand-token');
var JSONObject = require('json-object');
var parse = require('parse-json'); 

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
//========================================================//
      models.Course.find({
          "name": request.params.course_name
        }, function(err, items) {
	           
//=========================================================//

      var program = coursefile + ".java";
      var file_content = fs.readFileSync(__dirname + '/../run/runner/' + coursefile + '/SrcTemplate/' + templatename + '/' + program, 'utf8');
      file_content = filter_file.geCodeTemplate(file_content, sessionId);
      var files = [{
        type: "file",
        filename: request.params.course_name + ".java",
        contents: file_content,
	definition: items[0].definition, 
        active: true
      }]
    
      reply(files);
      //console.log(files);
    });
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

 server.route({
   method: 'GET',
   path: '/users/exists/{username}',
   handler: function(request, reply){
     var username = request.params.username;

     reply(username);
   } 
  }); 

  server.route({
  	method: 'POST',
	path :'/users',
	handler : function (request , reply ){
		var ser_id = request.payload.ser_id;
		var id = request.payload
                models.Users.find({'email': email}, function (err, user) {
		  if(err) return reply(err);
                  if(user.length!=0) return reply("user email allready exists");

                   var User = new models.Users({
		     'name' : name,
		     'email' : email,
		     'password' : password
		   });

		   User.save(function (err,success){
                       if(err) return reply(err);
		       else return reply("success"); 
		   });
                });*/
	}
  });
  return next();
};

exports.register.attributes = {
  pkg: require('./package.json')
}
