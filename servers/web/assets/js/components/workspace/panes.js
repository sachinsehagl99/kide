var _ = require("lodash");

module.exports = angular.module("plunker.component.workspace.panes", [])

.factory("panes", [function () {
  var panes = {
    handlers: {},
    registerHandler: function (type, paneHandler) {
      panes.handlers[type] = _.defaults(paneHandler, {
        preLink: angular.noop,
        link: angular.noop,
        loadComplete: function ($elm) {
          if(type=="code"){
            //var div = document.getElementById('helloDiv');
            //div.innerHTML = div.innerHTML + 'Extra stuff';
            //$elm.append("<div>hello there</div>");
          }
          //console.log("==========");
          //console.log(type);
          //console.log("==========");
        }
      });
    },
    getHandler: function (type) {
      return panes.handlers[type];
    }
  };
  
  return panes;
}]);
