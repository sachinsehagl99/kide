var Fs = require("fs");
var _ = require("lodash");
require("../../services/users");
require("../../services/flash");
require("../oauth");

module.exports = angular.module("plunker.component.register", [
  "ui.bootstrap",  
  "plunker.service.config", 
  "plunker.service.users",
  "plunker.service.flash",
  "plunker.service.oauth"
])

.factory("register", function ($rootScope, $modal, oauth, visitor, UserService, FlashService) {
  var register = {};

  register.open = function () {
    var modalInstance = $modal.open({
      template: Fs.readFileSync(__dirname + "/register.html", "utf8"),
      controller: function ($scope, $modalInstance, $elements) {

        $scope.user = {
	    name: "",
	    email: "",
	    password: ""
	};

        $scope.resolve = $modalInstance.close.bind($modalInstance);
        $scope.reject = $modalInstance.dismiss.bind($modalInstance);
        $scope.identities = oauth.identities;
        $scope.providers = oauth.providers;
        $scope.state = {};
 
        $scope.steps = [
          {
            id: 'identities',
            title: "Link social identities",
            next: "Next",
            prev: "",
            validate: function () { return !_.isEmpty(oauth.identities); }
          }, {
            id: 'profile',
            title: "Create profile",
            next: "Register",
            prev: "Back",
            onEnter: function () {
              if (!$scope.profile) {
                $scope.profile = oauth.buildProfile();
              }
              
              $scope.profileData = oauth.buildProfileData();
            },
            validate: function () { return !_.isEmpty(oauth.identities) && $scope.profile.username; },
            advance: function () {
              visitor.register($scope.profile, oauth.identities).then(function () {
                $modalInstance.close();
              }, function (err) {
                $scope.state.error = err.data.message;
              });
            }
          }
        ];
        
        $scope.step = $scope.steps[0];
        
        $scope.advance = function () {
            UserService.Create($scope.user)
                .then(function (response) {
                      if(response != "success"){
                        $scope.state.error = response;
                      }
                });
        };
        
        $scope.toggle = function (service) {
          if (oauth.hasIdentity(service)) {
            oauth.clearIdentity(service);
          } else {
            $scope.state.authInProgress = oauth.identify(service).then(function (identities) {
              
            }, function (err) {
              $scope.state.error = err;
            }).finally(function () {
              $scope.state.authInProgress = null;
            });
            
            return $scope.state.authInProgress;
          }
        };
        
        $scope.back = function () {
          var idx = $scope.steps.indexOf($scope.step);
          $scope.step = $scope.steps[idx - 1];
        };
        
        $scope.validate = function () {
          if ($scope.state.step === 'identities') {
            return !_.isEmpty(oauth.identities);
          } else {
            return !_.isEmpty(oauth.identities);
          }
        };
      }
    });

    return modalInstance.result;  
  };
  
  return register;
})

.directive("plunkerUserExists", ["$http", "config", function ($http, config) {
  return {
    require: "ngModel",
    link: function ($scope, $element, $attrs, model) {
      function checkExistence (value) {
        if (value) {
          model.$setValidity("checking", false);
          
          $http.get("/users/exists", {params: {username: value}}).then(function (response) {
            console.log(response.data);
            model.$setValidity("exists", response.data !== 'true');
          }).finally(function () {
            model.$setValidity("checking", true);
          });
        }
      }
      
      checkExistence($scope.$eval($attrs.ngModel));
      
      model.$viewChangeListeners.push(function () {
        console.log("View changed", model.$viewValue);
        checkExistence(model.$viewValue);
      });
    }
  };
}]);
