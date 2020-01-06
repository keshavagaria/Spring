<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Employees</title>
</head>
<body>
<h1>List of Employees</h1>
     <table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Hobbies</th>
			<th>City</th>
			<th>Address</th>
			
		</tr>
		
		<c:forEach items="${employees }" var="employee">
			<tr>
				<td>${employee.name}</td>
				<td>${employee.email}</td>
				<td>${employee.gender}</td>
				<td>${employee.hobbies}</td>
				<td>${employee.city}</td>
			    <td>${employee.address}</td>
		
			</tr>
		</c:forEach>
     </table>
</body>
</html>