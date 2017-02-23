(function () {
    'use strict';


    angular
        .module('app', ['ngAnimate', 'ngRoute', 'ngSanitize', 'mgcrea.ngStrap']);

    angular
        .module('app')
        .controller('ApplicationCtrl', ApplicationCtrl);
    ApplicationCtrl.$inject = ['$scope', '$http'];
    function ApplicationCtrl($scope, $http) {
        var vm = this;
        vm.response = null;
        vm.submit = function () {

            $http({
                method: 'post',
                url: '/generateSignature',
                data: vm.userDetails
            });


        };


        return vm;
    }


})();