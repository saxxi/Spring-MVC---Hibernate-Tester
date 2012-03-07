<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	
</body>
</html>
