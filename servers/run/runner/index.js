var shelljs = require('shelljs');

module.exports = function(name, testMethod, build_dir, src_file, test_build_dir, test_file, callback) {
  var junit_path = __dirname + '/lib/junit4-4.11.jar';
  var hamcrest_path =  __dirname + '/lib/hamcrest-core-1.3.jar';
  var junit_json_runner =  __dirname + '/lib/junit-json-runner.jar';
  var json_simple = __dirname + '/lib/json-simple-1.1.1.jar';
  var class_path = junit_json_runner;

  shelljs.exec('javac -d ' + build_dir + ' -cp ' + class_path + ' ' + src_file, function(code, output) {
      if (!code) {
         class_path  =  junit_path +':' + build_dir +':' + junit_json_runner;
         shelljs.exec('javac -d ' + test_build_dir + ' -cp ' + class_path + ' ' + test_file, function(code, output) {
           if (!code) {
		class_path = hamcrest_path + ':' + junit_path + ':' + test_build_dir +':' + junit_json_runner +':' + json_simple  + ":" + build_dir;
            shelljs.exec('java -cp ' + class_path + ' org.junit.runner.JsonRunner ' + name + "#" + testMethod, {silent: true}, function(code, arr) {
             arr = JSON.parse(arr);

	      for (var key in arr) {
		var obj = arr[key];
		callback(obj);
	       }
              });
          }
        });
      }
  });
}
