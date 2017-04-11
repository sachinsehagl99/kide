var shelljs = require('shelljs');

module.exports = function (testRun, src){
shelljs.exec('javac -d '+__dirname+'/'+testRun+'/build/classes/ ' + src, function(code, output) {
	
  if (!code) {
    shelljs.exec('javac -d '+__dirname+'/'+testRun+'/build/test/classes/ -cp '+__dirname+'/lib/junit4-4.11.jar:'+__dirname+'/'+testRun+'/build/classes:'+__dirname+'/build/classes/ '+__dirname+'/'+testRun+'/test/'+ testRun +'Test.java', function(code, output) {
      if (!code) {
        shelljs.exec('java -cp '+__dirname+'/lib/hamcrest-core-1.3.jar:'+__dirname+'/lib/junit4-4.11.jar:'+__dirname+'/'+testRun+'/build/classes/:'+__dirname+'/'+testRun+'/build/test/classes/:'+__dirname+'/dist/jsonrunner.jar:'+__dirname+'/lib/json-simple-1.1.1.jar org.junit.runner.JsonRunner '+testRun+'Test',
	{silent : true},
         function(code, arr) {
arr = JSON.parse(arr); 
for(var key in arr) {
  var obj = arr[key];
  var desc = obj.description;
  var stats = obj.status;
  if(stats == "failed"){
    console.log(desc);
    break;
  }
}
        })
      }
    


})
  }

});
}
