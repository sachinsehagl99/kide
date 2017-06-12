var shelljs = require('shelljs');

module.exports = function(name,build_dir, src_file, test_build_dir, test_file, callback) {
  var junit_path = __dirname + '/lib/junit4-4.11.jar';
  var hamcrest_path =  __dirname + '/lib/hamcrest-core-1.3.jar';
  //var json_class_path = __dirname + '/build/classes' ; 
  var json_runner =  __dirname + '/dist/jsonrunner.jar';
  var json_simple = __dirname + '/lib/json-simple-1.1.1.jar';
  console.log('javac -d ' + build_dir + ' ' + src_file);
  console.log("----------");
  shelljs.exec('javac -d ' + build_dir + ' ' + src_file, function(code, output) {

      if (!code) {
         var class_path  =  junit_path +':' + build_dir +':' + json_runner;
         console.log('javac -d ' + test_build_dir + ' -cp ' + class_path + ' ' + test_file);
         console.log("-----------");
         shelljs.exec('javac -d ' + test_build_dir + ' -cp ' + class_path + ' ' + test_file, function(code, output) {
           if (!code) {
		class_path = hamcrest_path + ':' + junit_path + ':' + test_build_dir +':' + json_runner +':' + json_simple  + ":" + build_dir;
           console.log('java -cp ' + class_path + ' org.junit.runner.JsonRunner ' + name);
            shelljs.exec('java -cp ' + class_path + ' org.junit.runner.JsonRunner ' + name, {silent: true}, function(code, arr) {
console.log(arr);
console.log("------");
             arr = JSON.parse(arr);

	      for (var key in arr) {


		var obj = arr[key];
		var desc = obj.description;
		var stats = obj.status;
		if (stats == "failed") {
                  console.log(obj);
                  console.log("===========");
		  callback(obj);
		  return;
		}
	       }
              });
          }
        });
      }
  });
}
