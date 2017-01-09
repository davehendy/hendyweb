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
	<title>HendyWeb Home </title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/hendy.css" />
	
	<script type="text/javascript" src="js/hendywebGlobal.js"></script>
	<script>//nothing here</script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script>//nothing here</script>
</head>
<body>
	<div id="container">
	
		<jsp:directive.include file="hendytop.jsp" />
		
		<div id="wrapper">
			<section id="leftblock">
				<h2>Hendycam</h2>
				<a href="hendycam">
					<img src="/hendycam/image00001.jpg"></img>
				</a>
				<h3>Click on image</h3>
				
			</section>
			 
			<section id="content">
				<h2>Hendy Home Page</h2>
				<p>The 2016 version of the Hendy website is here.</p>
				<p>It is still under construction and once I think of something to put here I will do so. </p>
				<p>Most importantly HendyCam is available.</p>
			</section>
		</div>
		
		<section id="extra">
			<h2>Other bits and bobs</h2>
			<p>The plan is to fill this area with other useful information.</p>
		</section>
		
		<jsp:directive.include file="hendybottom.jsp" />
	</div>
</body>
</html>
</jsp:root>