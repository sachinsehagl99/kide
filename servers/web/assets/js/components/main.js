module.exports = angular.module("plunker.component.courses", [])

    .directive("coursesTab", ["$http", "$window", function($http, $window) {
        return {
            restrict: "E",
            replace: true,
            templateUrl: '/components/courses/courses.html',
            controller: ["$scope", function($scope) {
                $scope.openCourse = function() {
                    console.log("hello hola");
                    $http.get('/user/auth').then(function(response) {
                        console.log(response.data);
                        if (response.data.java !== true) alert("You need to buy the course first!\nYou will be redirected to your profile page where you can add more courses.");
                        $window.location.href = '/landing/java';
                    });
                }
            }]
        }
    }]);
