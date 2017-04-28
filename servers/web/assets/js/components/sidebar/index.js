var angular = window.angular;

var Fs = require("fs");


require("../../../vendor/angular-timeago/angular-timeago");


module.exports =
angular.module("plunker.component.sidebar", [
  "yaru22.angular-timeago",
  "ui.bootstrap",
  
  require("../project").name,
  require("../commander").name,
  
  require("./tree/fileTree").name
])

.filter("slice", function () {
  return function (text, n) { return String(text).substring(0, n); };
})


.directive("plunkerSidebar", [ function () {
  return {
    restrict: "E",
    replace: true,
    templateUrl: "components/sidebar/sidebar.html",
    controller: require("./sidebarController"),
    controllerAs: "sidebar"
  };
}]);
