(function() {
	'use strict';


	angular
		.module('app', ['ngAnimate', 'ngRoute', 'ngSanitize', 'mgcrea.ngStrap']);

	angular
		.module('app')
		.controller('ApplicationCtrl', ApplicationCtrl);

	ApplicationCtrl.$inject = ['$window'];
	function ApplicationCtrl($window) {
	var tests;

		var vm = this;

		vm.submit = function(userDetails){
			console.log('User clicked register', vm.userDetails );
		}

		return vm;
	}
})();