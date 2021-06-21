<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>
	<div class="container-fluid">
		
		<h2>${customer.firstName} ${customer.lastName}</h2>
	</div>
	<a href="http://localhost:8080/eStore">Return to Home Page</a>
</body>
</html>