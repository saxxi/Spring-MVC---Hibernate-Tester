<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<p>The time on the server is ${serverTime}.</p>
	
	<h2>Model "Post" - Spring Beans tester</h2>
	
	<p>Titolo: ${post.getTitle()}</p>
	<p>N Views: ${post.getnViews()}</p>
	
	<p>Titolo (singlevar): ${thePostTitle}</p>
	<p>theNViews (singlevar): ${theNViews}</p>
	
</body>
</html>
