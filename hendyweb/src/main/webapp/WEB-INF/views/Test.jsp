<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:c="http://java.sun.com/jsp/jstl/core">
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  From server  ${header["host"]} 
</h1>

<P>  The time on the server is ${serverTime}. </P>
<br /><br />
<jsp:expression>request.getAttribute("serverTime")</jsp:expression>
<p />
<p />
The Java version is ${javaVersion}
<p />
Menu is ${hendymenu}
<!-- 
	<c:forEach var="entry" items="${requestScope}">
        <br />
            <c:out value="${entry.key}" />=
            <pre><c:out value="${entry.value}" /></pre>
        
    </c:forEach>
 -->
</body>
</html>
</jsp:root>