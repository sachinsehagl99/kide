var mongobackup = require('mongobackup');
var Gulp = require("gulp");
Gulp.task('mongodump', function() {
  mongobackup.dump({
    db: 'cuboid',
    host : 'localhost',
    out : './dumps/'
  });
});

///////////////////
Gulp.task('mongorestore', function() {
  mongobackup.restore({
    db : 'cuboid',
    host : 'localhost',
    drop : true,
    path : './dumps/cuboid'
  });
});

