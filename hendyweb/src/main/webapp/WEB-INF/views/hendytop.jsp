<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns="http://www.w3.org/1999/xhtml"
          xmlns:jsp="http://java.sun.com/JSP/Page" 
          xmlns:c="http://java.sun.com/jsp/jstl/core"
          version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />

<!-- The default Hendy page top -->
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/favicon.ico" />
	<header>
		<h1>Hendy</h1>
		<p class="description">The website of Dave and Sandra Hendy</p>
	</header>
	<nav>
		
		<ul id="${menuObject.menuName}">
		<c:forEach items="${menuObject.menuItemArray}" var="menuItem">
            <li><a href="${menuItem.menuItemLink}">${menuItem.menuItemName}</a></li>
        </c:forEach>
        </ul>
	</nav>
	


</jsp:root>