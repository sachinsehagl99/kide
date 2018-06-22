module.exports = function($scope, $rootScope, $http, commander, workspace, project) {
  this.layout = workspace.layout;
  this.isActive = workspace.isActive.bind(workspace);
  this.activate = workspace.activate.bind(workspace);
  this.split = workspace.split.bind(workspace);
  this.close = workspace.close.bind(workspace);
  $rootScope.submitButtonText = "Save";

  function getPaneDef() {
    return workspace.panes[workspace.nextPaneNum - 1];
  }

  function getFiles() {
    $http.get('/getFiles').then(function(res) {
      console.log(res.data);
      commander.execute("project.reset").then(function() {
        commander.execute("project.openTree", {
          tree: res.data
        });
      });
    });
  }

  getFiles();

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
