(function() {
    'use strict';
    
	angular
		.module('app')
		.config(Routes);
	
	Routes.$inject = ['$routeProvider'];
    function Routes($routeProvider) {

    	$routeProvider.
	    	 when('/', {
	    	   templateUrl: 'templates/main/index.html',
	    	   controller:	'ApplicationCtrl',
	           controllerAs: 'main'
	       	 }).
	         otherwise({
	           redirectTo: ' /'
	         });
    }
    
})();