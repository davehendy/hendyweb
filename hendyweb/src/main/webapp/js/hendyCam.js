/**
 * hendy cam javascript using Module pattern
 */
var hendyCam = (function() {
	// private stuff
	var hendyCamImages = {};
	
	// this is the public object
	retObj = {
	    setImages: function(images) {
	    	this.hendyCamImages = JSON.parse(JSON.stringify(images));
	    }
	};
	
	//expose the public object
	return retObj;
	
	
	
})();
