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

  return next();
};

exports.register.attributes = {
    pkg: require('./package.json')
};
