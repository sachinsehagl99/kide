var codemirror = require("codemirror");

module.exports = angular.module("plunker.directive.codeEditor", [])

.directive("codeEditor", ["$rootScope", "$q", function($rootScope, $q){

  return {
    restrict: "E",
    replace: true,
    template: "<div></div>",
    link: function($scope, $element, $attrs){

		window.onload = function() {
      codemirror($element[0], {
				theme: "zenburn",
				lineWrapping: true,
				lineNumbers: true,
				styleActiveLine: true,
				matchBrackets: true,
  value: "function myScript(){return 100;}\n",
  mode:  "javascript"
});
}
      
      //editor.setSession($scope.editSession);
    }
  };
}]);
