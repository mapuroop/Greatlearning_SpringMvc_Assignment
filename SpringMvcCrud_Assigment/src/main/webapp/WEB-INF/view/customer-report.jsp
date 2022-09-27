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

		<h1>                                 
		
		                          Customer Relation Management             </h1>
		<a href="addCustomer" class="btn btn-primary"> Add Customer </a>
		<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">FirstName</th>
						<th scope="col">LastName</th>
						<th scope="col">Email</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="cst" items="${customer}">
						<tr>
							<td class="table-plus">${cst.id}</td>
							<td>${cst.firstName}</td>
							<td>${cst.lastName}</td>
							<td>${cst.email}</td>
							<td><a href="editCustomer/${cst.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteCustomer/${cst.id}"
								class="btn btn-danger"> Delete </a></td>
								
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>