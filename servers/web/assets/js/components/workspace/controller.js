module.exports = function($scope, $rootScope, commander, workspace, project) {
  this.layout = workspace.layout;
  this.isActive = workspace.isActive.bind(workspace);
  this.activate = workspace.activate.bind(workspace);
  this.split = workspace.split.bind(workspace);
  this.close = workspace.close.bind(workspace);
  $rootScope.submitButtonText = "Save";

  function getPaneDef() {
    return workspace.panes[workspace.nextPaneNum - 1];
  }
  var _console = [{
    active: true,
    contents: "something",
    defination: "",
    filename: "console",
    type: "file"

  }];

  $scope.click = function(index) {
    if (index == 0)
      commander.execute("project.openTree", {
        tree: $rootScope.selected
      });
    else
      commander.execute("project.openTree", {
        tree: _console
      });
  }
  $rootScope.selected = [{
    active: true,
    contents: "something about node",
    defination: "",
    filename: "index.js",
    type: "file"

  }];
  setTimeout(function() {
    commander.execute("project.reset").then(function() {
      commander.execute("project.openTree", {
        tree: $rootScope.selected
      });
    });
  }, 0);

  $scope.$watch(getPaneDef, function(paneDef) {
    var entries = project.entries[paneDef.id];
    $scope.paneDefId = paneDef.id;

    if (entries) {
      $scope.entries = {
        code: entries.contents,
        options: {
          theme: "zenburn",
          lineWrapping: true,
          mode: "javascript",
          lineNumbers: true,
          onSet: function(cm) {
            for (var i = 0; i <= cm.lineCount(); i++) {
              cm.indentLine(i, "smart");
            }
          },
          onLoad: function(cm) {
            cm.on('change', function(cMirror) {
              project.entries[$scope.paneDefId].contents = cMirror.getValue();
            });
          }
        }
      };
    }
  })
};
