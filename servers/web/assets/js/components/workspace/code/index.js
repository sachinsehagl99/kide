var Fs = require('fs');

module.exports = angular.module("plunker.pane.code", [
  "ui.bootstrap",
  require("../../project").name,
  require("../../markdown").name, 
  require("../panes").name, 
  require("./codeEditor").name,
])

.run(["$modal", "panes", "project", function ($modal, panes, project) {
  panes.registerHandler("code", {
    template: Fs.readFileSync(__dirname + "/codePane.html", "utf8"),
    preLink: function ($scope, $element) {
      $scope.entry = project.entries[$scope.$id];
    },
  });
}]);
