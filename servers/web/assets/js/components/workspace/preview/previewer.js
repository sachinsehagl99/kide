require("../../settings");
require("../../commander");
require("../../oplog");
var _ = require("lodash");

module.exports = angular.module("plunker.directive.previewer", [
"plunker.service.settings",
"plunker.service.commander",
"plunker.oplog"
])

.directive("plunkerPreviewer", ["$rootScope", "$timeout", "$interval", "$http", "commander", "project", "settings", "oplog", "config", function ($rootScope, $timeout, $interval, $http, commander, project, settings, oplog, config) {

  commander.addCommand({
    name: "preview.refresh",
    hotkeys: "Mod-Enter",
    handler: refreshPreviews
  });

  function refreshPreviews () {
    var previewUrl = config.url.run;

    if (_.isEmpty(project.entries)) return;
    var json = {
	files: _.map(project.entries, function (entry) {

	  if (entry.isFile()) {
	    return {
	      path: entry.getPath(),
	      contents: entry.contents,
	      active: entry.active
	    };
	  }
	})
      };


    return $http.post(previewUrl, json).then(function (resp) {
      $rootScope.description = resp.data.description;
    });
  }

  $rootScope.$on("project.setTree.success", function (){
    refreshPreviews();
  });

  var directive = {
    restrict: "E",
    replace: true,
    templateUrl: 'components/workspace/preview/previewer.html',
    link: function($scope, $element, $attrs) {}
  };

  return directive;
}]);
