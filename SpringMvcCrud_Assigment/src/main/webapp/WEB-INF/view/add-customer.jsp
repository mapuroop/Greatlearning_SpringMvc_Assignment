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

		<h1>Add Customer Form</h1>
		<form action="insertCustomer" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="FirstName"> First Name </label> <input type="text"
							class="form-control" id="FirstName" name="FirstName"
							placeholder="Enter FirstName">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="LastName">Last Name </label> <input type="text"
							class="form-control" id="LastName" name="LastName"
							placeholder="Enter LastName"> 
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="Email"> Email </label> <input type="text"
							class="form-control" id="Email" name="Email"
							placeholder="Enter Email "> 

					</div>
				</div>
				</div>

			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>