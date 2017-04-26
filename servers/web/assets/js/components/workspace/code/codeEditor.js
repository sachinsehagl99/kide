require("ui-codemirror");

module.exports = angular.module("plunker.directive.codeEditor", ['ui.codemirror'])


 .controller('CodemirrorCtrl', ['$scope', function($scope) {

  $scope.piecesOfCode = [
    {
      code: '// Javascript code in here.\n' +
            'function foo(msg) {\n\tvar r = Math.random();\n\treturn "" + r + " : " + msg;\n}',
      options: {theme:"zenburn",  mode: "javascript", lineNumbers: true}
    }
    ];

}])

//.directive("codeEditor", ["$rootScope", function($rootScope){

  //return {
    //restrict: "E",
    //replace: true,
    //template: "<div></div>",
    //link: function($scope, $element, $attrs){
		//window.onload = function() {
      //new CodeMirror($element[0], {
				//theme: "zenburn",
				//lineWrapping: true,
				//lineNumbers: true,
				//styleActiveLine: true,
				//matchBrackets: true,
  //value: "function myScript(){return 100;}\n",
  //mode:  "javascript"
//});
//}
  ////$scope.piecesOfCode = [
    ////{
      ////code: '// Javascript code in here.\n' +
	    ////'function foo(msg) {\n\tvar r = Math.random();\n\treturn "" + r + " : " + msg;\n}',
      ////options: {lineNumbers: true}
    ////}
    //[>];<]
    //}
  //};
//}]);
