<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<form action="addpro" method="post">
		Product ID:<input type="text" name="pid"> 
		Product Name:<input type="text" name="name"> 
		Product Price:<input type="text" name="price"> 
		Product category:<input type="text" name="category"> 
		<input type="submit" value="Add Product">
	</form>
	
	<a href="http://localhost:8080/eStore">Return to Home Page</a>
</body>
</html>