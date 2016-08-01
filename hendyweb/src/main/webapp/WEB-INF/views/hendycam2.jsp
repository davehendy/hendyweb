<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hendycam 2</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/hendy.css" />
	
	
	<script type="text/javascript" src="js/hendyCam.js"></script>
	
	<script>
	window.onload = function() {
		alert("start Hendycam");
		var divtest = document.getElementById('container');
		divtest.innerHTML = divtest.innerHTML + "davedata";
	}
		
		//	hendyCam.setImages(${hendyCamJson});
    </script>
</head>
<body>
	<div id="container">
	
		
		
		<div id="wrapper">
			<div id="leftblock">
				<h2>Left Margin</h2>
			</div>
			 
			<div id="content">
				<h2>Hendy Cam Content Goes Here</h2>
				<div id="hendycamImagesDiv">
					<br>test
				</div>
				
			</div>
		</div>
		
		<div id="extra">
			<h2>Extra Stuff Goes Here</h2>
			<p>Sometimes this would be called a <em>sidebar</em>, but it doesn't always have to be on the side to be called a <em>sidebar</em>. Sidebars can be on tops of things, below things, but they are usually beside things &#8211; hence it being a called a sidebar.</p>
			<p><small>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</small></p>
		</div>
		
	</div>
</body>
</html>