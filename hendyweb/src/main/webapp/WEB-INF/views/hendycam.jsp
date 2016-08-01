<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" 
		  xmlns="http://www.w3.org/1999/xhtml"
	      xmlns:c="http://java.sun.com/jsp/jstl/core"
          version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />

<html>
<head>
	<title>Hendy Cam</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/hendy.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script>//nothing</script>
	<script type="text/javascript" src="js/hendyCam.js"></script>
	<script>//nothing</script>
	
	<script>
		$(document).ready(function() {
			//alert("start Hendycam");
			
			hendyCam.setImages(${hendyCamJson});
		});
    </script>
	
	
</head>
<body>


	<div id="container">
	
		<jsp:directive.include file="hendytop.jsp" />
		
		<div id="wrapper">
			<section id="leftblock">
				<h2>Click on on image to open a closer look.</h2>
			</section>
			 
			<section id="hendycamContent">
				<h2>The latest images from HendyCam.</h2>
				<div id="hendycamImagesDiv">
				</div>
				
			</section>
		</div>
		
		<jsp:directive.include file="hendybottom.jsp" />
		
	</div>
</body>
</html>
</jsp:root>