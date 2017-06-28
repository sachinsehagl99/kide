var mongoose = require('mongoose');
var models = require("./models/all-models");

exports.register = function(server, options, next) {
  server.route({
    method: 'GET',
    path: '/course/{id*}',
    handler: function(request, reply) {
     
    if(!request.params.id){   
        models.Course.find({}, function(err, items) {
          reply(items);   
        });
    } else {
       models.Course.find({"_id": mongoose.Types.ObjectId(request.params.id)}, function(err , items ){
	  reply(items);
	});
      }
    }
  });

  server.route({
    method: 'GET',
    path: '/coursefile/{course_id}',
    handler: function(request, reply) {
        models.CourseFile.find({"course_id": mongoose.Types.ObjectId(request.params.course_id)},function(err , data){
	   reply(data);
	});
    }
  });	
  server.route({
    method: 'GET',
    path: '/files/{course_name}/{template_name}',
    handler: function(request , reply){
	var file = 
	var files = [{ 
		type : "file",
		filename : request.params.course_name + ".java",
		contents : fs.readFileSync('../run/runner/request.params.course_name/src/filename', 'utf8'),
		active   : true

	}]
	console.log(files);
	//reply();


	}	

   });
  return next();
};

exports.register.attributes = {
    pkg: require('./package.json')
};
