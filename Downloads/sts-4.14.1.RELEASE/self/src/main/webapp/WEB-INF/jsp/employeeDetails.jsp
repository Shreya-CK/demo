<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Data</title>
</head>
<body>
	<div align='center'>
		<h3>Employee Details</h3>
		<br> <br>
		<table align="center" border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Location</th>
				<th>Department</th>
				<th>Role</th>
			</tr>

			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.employeeId}</td>
					<td>${employee.employeeName}</td>
					<td>${employee.location}</td>
					<td>${employee.department}</td>
					<td>${employee.role}</td>
				</tr>
			</c:forEach>
		</table>
		<br> <br>
		<div align="center">
			<a href="/">

				<button>Home</button>

			</a>
		</div>
	</div>

</body>
</html>
