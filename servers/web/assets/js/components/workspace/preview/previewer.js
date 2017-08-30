require("../../settings");
require("../../commander");
require("../../oplog");
require("../../notifier");
var _ = require("lodash");

module.exports = angular.module("plunker.directive.previewer", [
  "plunker.service.settings",
  "plunker.service.commander",
  "plunker.service.notifier",
  "plunker.oplog"
])


.directive("plunkerPreviewer", function($rootScope, $timeout, $interval, $http, $location, commander, project, settings, oplog, notifier, config) {

  commander.addCommand({
    name: "preview.refresh",
    hotkeys: "Mod-Enter",
    handler: refreshPreviews
  });


  $rootScope.hintVar = "hidden";
  $rootScope.isCollapsed = function () {
     $rootScope.hintVar= ($rootScope.hintVar == "") ?  "hidden" : "";     

    /*if($rootScope.hintVar == "hidden"){
      $rootScope.hintVar = "";
    } else {
      $rootScope.hintVar = "hidden";
   	}*/
  }


  $rootScope.$on("project.setTree.success", function() {
    commander.execute("preview.refresh");
  });

  $rootScope.testMethod = 1;

  function getSrcTemplate(testMethod) {
    var testName = ($location.path()).split("/")[2];
    var sessionId = ($location.path()).split("/")[4];

    $http.get("/getFiles/"+ testName + "/" + testMethod + "/" + sessionId).then(function(resp) {
	$rootScope.definition = resp.data[0].definition;
      commander.execute("project.reset").then(function() {
        commander.execute("project.openTree", {
          tree: resp.data
        });
      });
    });
  }

  getSrcTemplate("t" + $rootScope.testMethod);
$rootScope.loader = "hidden";
  function refreshPreviews() {

       $rootScope.submitButtonText = "Next";
    	$rootScope.test = "true";
        $rootScope.enable = "false";
        $rootScope.test = "true";
	$rootScope.submitButtonText = "Loading";
        // Do your searching here
        
        $timeout(function(){
            $rootScope.enable = "true";
            $rootScope.submitButtonText = "Next";
        }, 3000);
        

    var testName = ($location.path()).split("/")[2];
    var pathId = ($location.path()).split("/")[4];

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
    return $http.post("/java/" + testName + "/" + pathId, json).then(function(resp) {
      $rootScope.hintVar = "hidden";
      $rootScope.instruction = resp.data.instruction;
      $rootScope.status = resp.data.status;
      $rootScope.description = resp.data.description;
      $rootScope.hint = resp.data.hint;

      if ($rootScope.status == "passed") {
        var testNo = ($location.path()).split("/")[3];

        if($rootScope.testMethod < testNo){
          $rootScope.testMethod = $rootScope.testMethod + 1;
          getSrcTemplate("t" + $rootScope.testMethod);
        } else {
          notifier.success("yay!! thats all you need to do");
        }
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
