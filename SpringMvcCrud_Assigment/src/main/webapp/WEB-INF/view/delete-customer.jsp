<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Are you sure you want to Delete?</h1>
		<form action="deleteCustomer/${Customer.id}" method="Get">

			
			<a href="${pageContext.request.contextPath }/"
				class="alert"> Back </a>
			<button type="submit" class="btn btn-primary">Delete</button>
		</form>

	</div>

</body>
</html>