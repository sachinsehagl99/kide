var angular = window.angular;

var genid = require("genid");
var _ = require("lodash");

require("../../../../vendor/qrcode/qrcode");

module.exports = angular.module("plunker.directive.previewer", [
  require("../../settings").name,
  require("../../commander").name,
  require("../../oplog").name,
])

.directive("plunkerPreviewer", ["$rootScope", "$timeout", "$interval", "$http", "commander", "project", "settings", "oplog", "config", function ($rootScope, $timeout, $interval, $http, commander, project, settings, oplog, config) {
  var previewUrl = config.url.run;
  var previewWindow = null;
  var checkPreviewWindowInterval = null;
  var debouncedUpdateStream = null;
  var active = false;
  var started = false;

  commander.addCommand({
    name: "preview.refresh",
    hotkeys: "Mod-Enter",
    handler: refreshPreviews
  });

  var directive = {
    restrict: "E",
    replace: true,
    templateUrl: 'components/workspace/preview/previewer.html',
    link: function($scope, $element, $attrs) { 
      $scope.$on("project.setTree.success", function (){
        refreshPreviews();
      });
    }
  };

  return directive;


  function refreshPreviews () {

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

}])


.directive("qrcode", function () {
  return {
    restrict: "E",
    replace: true,
    template: '<a ng-href="{{url}}" target="_blank"><span class="qrcode"></span></a>',
    scope: {
      url: "@",
      width: "@",
      height: "@"
    },
    link: function ($scope, $element, $attrs) {
      var qrcodeEl = $element.children()[0]
        , qrcode = new QRCode(qrcodeEl, {
          text: $scope.url,
          width: $scope.width,
          height: $scope.height
        });

      $scope.$watch("url", function (url) {
        qrcode.makeCode(url);
      });
    }
  };
});
