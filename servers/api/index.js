var mongo = require('mongoskin');
var db = mongo.db("mongodb://localhost:27017/connect_db", {native_parser:true});
var ObjectID = mongo.ObjectID;
exports.register = function (server , options , next){
	server.route({
		method: 'GET',
		path: '/retrieve',
		handler : function(request, reply) {
		    if(!request.query.id){		
                           
			db.collection("course_collection").find({}).toArray(function(err, items){
		 		
		 		reply(items);
				db.close();
			});
			
		     }
		    else{
			 var params = request.query.id;
   			 db.collection("hello_collection").find({"_id":ObjectID(params)}).toArray(function(err, items) {
            
            		  reply(items[0]);

                    db.close();
       });
	
		    }	
         
		}
	
	});
	server.route({
		method:'GET',
		path: '/get_files/{course_id}',
		handler : function( request, reply){
			var param = request.params;
			db.collection("course_files_collection").find({"course_id":param.course_id}).toArray(function(err , items){
				reply(items);
				db.close();

			});
		}
	});
return next();
};
exports.register.attributes = { name : 'api'};
