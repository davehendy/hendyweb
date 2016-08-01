/**
 * hendy cam javascript using Module pattern
 */
var hendyCam = (function() {
	// private stuff
	var hendyCamImages = {};
	
	// this is the public object
	retObj = {
	    setImages: function(images) {
	    	//this.hendyCamImages = JSON.parse(JSON.stringify(images));
	    	
	    	var i=images.length-1;
	    	var all_img_html="";
	    	while(i >= 0){
	    		var image = images[i];
	    		var img_html='<img ' +
	    		         'src="/hendycam/' + image.name + '"' +
	    		         'onclick=hendyCam.openPic("/hendycam/' + image.name + '")>' +
	    		         '</img>';
	    		all_img_html = all_img_html + img_html;
	    		i--;
	    	}
	    	//document.getElementById("hendycamImages").innerHTML += all_img_html;
	    	$('#hendycamImagesDiv').append(all_img_html);
	    },
	    openPic: function(link) {
	    	link1=window.open(link,'HendyCamLink', 'centerscreen,height=500,width=670,location=0,menubar=0,toolbars=no,scrollbars=yes,resizable=yes');
	    	link1.moveTo(0, 0);
	    	link1.focus();
	    }
	};
	
	//expose the public object
	return retObj;
	
	
	
})();
