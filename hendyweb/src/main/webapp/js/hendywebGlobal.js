/**
 * hendyweb global javascript using Module pattern
 */
var hendywebGlobal = (function() {
	// private stuff
	var hendyWebMenu = "davetest";
	
	// this is the public object
	retObj = {
	    setMenu: function(m) {
	    	hendyWebMenu = m;
	    }
	};
	
	//expose the public object
	return retObj;
	
	
	
})();
