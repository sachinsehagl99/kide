require("../../settings");
require("../../commander");
require("../../oplog");
var _ = require("lodash");

module.exports = angular.module("plunker.directive.previewer", [
  "plunker.service.settings",
  "plunker.service.commander",
  "plunker.oplog"
])

.directive("plunkerPreviewer", function($rootScope, $timeout, $interval, $http, commander, project, settings, oplog, config) {

  commander.addCommand({
    name: "preview.refresh",
    hotkeys: "Mod-Enter",
    handler: refreshPreviews
  });


  $rootScope.$on("project.setTree.success", function() {
    commander.execute("preview.refresh");
  });

  $rootScope.testMethod = 1;

  function getSrcTemplate(testMethod) {
    $http.get("/getFiles/Swap/" + testMethod).then(function(resp) {
      commander.execute("project.reset").then(function() {
        commander.execute("project.openTree", {
          tree: resp.data
        });
      });
    });
  }

  getSrcTemplate("t" + $rootScope.testMethod);

  function refreshPreviews() {
    var previewUrl = config.url.run;

    if (_.isEmpty(project.entries)) return;
    var json = {
      files: _.map(project.entries, function(entry) {

        if (entry.isFile()) {
          return {
            path: entry.getPath(),
            contents: entry.contents,
            active: entry.active
          };
        }
      })
    };

    json.testMethod = "t" + $rootScope.testMethod;

    return $http.post(previewUrl, json).then(function(resp) {
      $rootScope.status = resp.data.status;
      $rootScope.description = resp.data.description;
      $rootScope.hint = resp.data.hint;

      if ($rootScope.status == "passed") {
        $rootScope.testMethod = $rootScope.testMethod + 1;
        getSrcTemplate("t" + $rootScope.testMethod);
      }
    });
  }

  var directive = {
    restrict: "E",
    replace: true,
    templateUrl: 'components/workspace/preview/previewer.html',
    link: function($scope, $element, $attrs) { }
  };

  return directive;
});
