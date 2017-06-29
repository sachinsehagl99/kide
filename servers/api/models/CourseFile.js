var mongoose = require('mongoose');
var Schema = mongoose.Schema;
if (mongoose.connection.readyState === 0) {
  mongoose.connect(require('./connection-string'));
}


var newSchema = new Schema({  
  'course_id': { type: Schema.Types.ObjectId, ref: 'Course' },
  'filename': { type: String },
  'contents': { type: String },
  'type': { type: String },
  'active': { type: Boolean },
},{collection: 'CourseFile'});

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



module.exports = mongoose.model('CourseFile', newSchema);
