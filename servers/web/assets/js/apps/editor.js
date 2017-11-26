var Fs = require("fs");
var _ = require("lodash");
var globalData = [];
var globalIndex = 0;

require("../components/commander");
require("../components/notifier");
require("../components/project");
require("../components/toolbar");
require("../components/sidebar");
require("../components/overlayer");
require("../components/workspace");
require("../components/urlState");
require("../components/userPane");
require("../components/commentsPane");

module.exports = angular.module('plunker', [
  "ui.bootstrap",
  "fa.directive.borderLayout",
  "plunker.service.commander",
  "plunker.service.notifier",
  "plunker.project",
  "plunker.component.toolbar",
  "plunker.component.sidebar",
  "plunker.component.overlayer",
  "plunker.component.workspace",
  "plunker.urlState",
  "plunker.component.userPane",
  "plunker.commentsPane"
])

.config(["$locationProvider", function($locationProvider){
  $locationProvider.html5Mode(true).hashPrefix("!");
}])

.config(["$tooltipProvider", function($tooltipProvider){
  $tooltipProvider.options({
    appendToBody: true,
    popupDelay: 200,
  });
}])


.controller("EditorController", function ($rootScope, $scope, $location, urlState, commander, project, notifier,config) {

  urlState.addState({
    name: "plunkId",
    queue: "project",
    scope: $scope,
    decode: function () {
      return $location.path().slice(6);
    },
    encode: function (plunkId) {
      return $location.path("/edit/" + (plunkId || ""));
    },
    read: function () {
      return project.isSaved() ? project.plunk.id : void 0;
    },
    write: function (plunkId) {
      //return commander.execute("editor.reset");
    }
  });
  
});
