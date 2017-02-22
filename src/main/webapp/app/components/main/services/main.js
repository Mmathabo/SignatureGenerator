(function() {
	'use strict';

	angular
		.module('app')
		.service('MainService', MainService);

	MainService.$inject = ['$http'];
	function MainService($http) {

		var service = {};
			service.sendData = function($scope) {
                    $http({
                        url: '/generateSignature',
                        method: "POST",
                        data: { 'message' : message }
                    })
                    .then(function(response) {

                    },
                    function(response) {
                    });
                }
        		re

		return service;
	}
	
})();