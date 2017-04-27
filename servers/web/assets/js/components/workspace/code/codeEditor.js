require("ui-codemirror");

module.exports = angular.module("plunker.directive.codeEditor", ['ui.codemirror'])

.controller('CodemirrorCtrl', ['$scope',
  function($scope) {
    $scope.piecesOfCode = [{
      code: '// Javascript code in here.\n function foo(msg) {\n\tvar r = Math.random();\n\treturn "" + r + " : " + msg;\n}',
      options: {
        theme: "zenburn",
        mode: "javascript",
        lineNumbers: true
      }
    }];
  }
])

.directive("codeEditor", ["$rootScope",
  function($rootScope) {
    return {
      restrict: "E",
      replace: true,
      link: function($scope, $element, $attrs) {
        $scope.piecesOfCode = [{
          code: '// Javascript code in here.\n function foo(msg) {\n\tvar r = Math.random();\n\treturn "" + r + " : " + msg;\n}',
          options: {
            theme: "zenburn",
            mode: "javascript",
            lineNumbers: true
          }
        }];
      }
    };
  }
]);
