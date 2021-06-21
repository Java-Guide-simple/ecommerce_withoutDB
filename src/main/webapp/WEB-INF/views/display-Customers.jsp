<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Customer Details</h2>
	<table border="1">
	
	<tr><th>Customer ID</th><th>Customer Name</th><th>Customer Mobile</th><th>Customer Email</th></tr>
	<c:forEach var="customer" items="${customers}">
		<tr><td>${customer.id}</td>
			<td>${customer.firstName} ${customer.lastName}</td>
			<td>${customer.mobile}</td>
			<td>${customer.email}</td>
		</tr>
		
		
	</c:forEach>
	
	</table>
	<a href="http://localhost:8080/eStore">Return to Home Page</a>
</body>
</html>