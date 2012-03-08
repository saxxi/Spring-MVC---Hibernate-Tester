<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>New product</h1>
	<p>Create a product</p>
	
	
	<form action="/TestMVC/products/new" method="post">
		<div>
			
			Title<br />
			<input type="text" name="title" value="Very interesting article" />
			
			<br />
			
			Qty<br />
			<input type="text" name="qty" value="346" />
			
			<br />
			<br />
			
			<input type="submit" value="Create" />
		</div>
	</form>
	
	
	
	
	
</body>
</html>
