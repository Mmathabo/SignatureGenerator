(function() {
	'use strict';


	angular
		.module('app', ['ngAnimate', 'ngRoute', 'ngSanitize', 'mgcrea.ngStrap']);

	angular
		.module('app')
		.controller('ApplicationCtrl', ApplicationCtrl);

	ApplicationCtrl.$inject = ['$window'];
	function ApplicationCtrl($window) {

		var vm = this;

		return vm;
	}
})();