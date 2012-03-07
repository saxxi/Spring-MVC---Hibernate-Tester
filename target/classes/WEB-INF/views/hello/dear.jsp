<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello dear!</h1>
	<p>Custom Tag.</p>
	
	<%@ taglib prefix="mystuff" tagdir="/WEB-INF/tags" %>

	<mystuff:mytable cell1="hello" cell2="world" />
	
</body>
</html>
