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
	<script>
	//<![CDATA[
	    //$(document).ready(function(){
	    	var a="ddd";
			hendywebGlobal.setMenu('fred');
        //});
		
	//]]>
	</script>
	
	
</head>
<body>
<!-- 
	<div id="pageData">
	
	<![CDATA[${menuJson}]]>
	</div>
	 -->
	<div id="container">
	
		<jsp:directive.include file="hendytop.jsp" />
		
		<div id="wrapper">
			<section id="leftblock">
				<h2>Left Margin</h2>
			</section>
			 
			<section id="content">
				<h2>Content Goes Here</h2>
				<p>Cue the obligatory <em>Lorem Ipsum</em> riff-raff type text, <a href="">Followed by an example of a link.</a> There are many uses for <em>Lorem Ipsum</em>, using it as filled text isn't recommended. Make sure to always use actual content when building your websites! It just makes more sense. Now for the lipsum.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
			</section>
		</div>
		
		<section id="extra">
			<h2>Extra Stuff Goes Here</h2>
			<p>Sometimes this would be called a <em>sidebar</em>, but it doesn't always have to be on the side to be called a <em>sidebar</em>. Sidebars can be on tops of things, below things, but they are usually beside things &#8211; hence it being a called a sidebar.</p>
			<p><small>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</small></p>
		</section>
		<footer>
			<ul>
				<li><a href="">Navigation 1</a></li>
				<li><a href="">Navigation 2</a></li>
				<li><a href="">Navigation 3</a></li>
				<li><a href="">Navigation 4</a></li>
				<li><a href="">Navigation 5</a></li>
				<li><a href="">Navigation 6</a></li>
			</ul>
			<p>Footer stuff goes here. Copyright, disclaimers &#8211; stuff like that.</p>
		</footer>
	</div>
</body>
</html>
</jsp:root>