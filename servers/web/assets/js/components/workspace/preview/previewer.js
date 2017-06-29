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

    var testMethod = 1;

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

      if ($rootScope.status == "passed") {
        $rootScope.$broadcast("project.test.success");
        testMethod = testMethod + 1;
      }
      json.testMethod = testMethod;


      return $http.post(previewUrl, json).then(function(resp) {
        $rootScope.status = resp.data.status;
        $rootScope.description = resp.data.description;
      });
    }

    var directive = {
      restrict: "E",
      replace: true,
      templateUrl: 'components/workspace/preview/previewer.html',
      link: function($scope, $element, $attrs) {
        $scope.getNextTemplate = function() {
          $http.get("/getFiles/Swap/t2").then(function(resp) {
            commander.execute("project.reset").then(function() {
              commander.execute("project.openTree", {
                tree: resp.data
              });
            });
          });
        }
      }
    };

    return directive;
  });
