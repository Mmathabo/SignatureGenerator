(function () {
    'use strict';

    angular
        .module('app')
        .factory('MainService', MainService);

    MainService.$inject = ['$http'];
    function MainService($http) {

        return {
            sendData: function (userDetails) {
                return $http({
                    url: '/generateSignature',
                    method: "POST",
                    data: {'userDetails': userDetails}
                }).then(function (response) {

                    },
                    function (response) {
                    });
            }


        }


    }

})();