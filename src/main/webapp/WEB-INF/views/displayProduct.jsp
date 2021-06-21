<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value='/resources/css/bootstrap.min.css' />"
	rel="stylesheet" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-3.6.0.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</head><%@page isELIgnored="false"%>
<body>
	<c:forEach var="product" items="${products}">
		<div class="card" style="width: 18rem;">
			<img class="card-img-top"
				src="/eStore/src/main/webapp/resources/image/img1.jpg"
				alt="Product image">
			<div class="card-body">
				<h5 class="card-title">Branding Products</h5>
				<p class="card-text">${product.name}  RS. ${product.price}</p>
				<a href="#" class="btn btn-primary">add to cart</a>
			</div>
		</div>


	</c:forEach>
	<a href="http://localhost:8080/eStore">Return to Home Page</a>
</body>
</html>