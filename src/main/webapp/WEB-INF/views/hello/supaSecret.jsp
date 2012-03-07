<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Supa secret page!</h1>
	<p>authUsername ${authUsername}.</p>
	<p>userUsername ${userUsername}.</p>
	<p>principalUsername ${principalUsername}.</p>
	<p>The time on the server is good.</p>
	
	<a href="/TestMVC/">Back</a>
	|
	<a href="/TestMVC/auth/logout">Logout</a>
	<a href="<c:url value="/j_spring_security_logout" />">Logout</a>
	
</body>
</html>
