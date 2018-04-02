var mongoose = require('mongoose');
var Schema = mongoose.Schema;
if (mongoose.connection.readyState === 0) {
  mongoose.connect(require('./connection-string'));
}


var newSchema = new Schema({ 
  'facebook_id' : {type : String},
  'github_id' : {type : String},
  'google_id' : {type: String},
  'name': { type: String },
  'email': { type: String },
  'password': {type: String },
  'pro_pic' : { type: String },
  'java' : { type: Boolean }
},{collection : 'Users'});

newSchema.pre('save', function(next){
  this.updatedAt = Date.now();
  next();
});

newSchema.pre('update', function() {
  this.update({}, { $set: { updatedAt: Date.now() } });
});

newSchema.pre('findOneAndUpdate', function() {
  this.update({}, { $set: { updatedAt: Date.now() } });
});



module.exports = mongoose.model('Users', newSchema);
