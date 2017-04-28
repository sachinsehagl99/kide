var Fs = require('fs');
require("./codeEditor");

module.exports = angular.module("plunker.pane.code", [
  "ui.bootstrap",
  "plunker.directive.codeEditor"
])

.run(["$modal", "panes", "project", function ($modal, panes, project) {
  panes.registerHandler("code", {
    template: Fs.readFileSync(__dirname + "/codePane.html", "utf8"),
    preLink: function ($scope, $element) {
      $scope.entry = project.entries[$scope.$id];
    },
  });
}]);
