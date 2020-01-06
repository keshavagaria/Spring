<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Provide Employee Information</h1>
<hr/>
       <f:form modelAttribute="emp" action="saveEmployee">
			<table border="1">
			 	<f:hidden path="id"/>
			 	   <tr>
						<td>Name</td>
						<td><f:input path="name"/></td>
			
			       </tr>
			<tr>
						<td>Email</td>
						<td><f:input path="name" /></td>
			
			</tr>
			<tr>
						<td>Gender</td>
						<td>
						    <f:radiobutton path="gender" value="Male"/>Male
						    <f:radiobutton path="gender" value="Female"/>Female
						</td>
			
			</tr>
			<tr>
						<td>Hobbies</td>
						<td>
						    <f:checkbox path="hobbies" value="Cricket"/>Cricket<br/>
							<f:checkbox path="hobbies" value="Hockey"/>Hockey<br/>
						    <f:checkbox path="hobbies" value="Football"/>Football<br/>
							<f:checkbox path="hobbies" value="Swimming"/>Swimming<br/>
						    <f:checkbox path="hobbies" value="Badminton"/>Badminton<br/>
						</td>
			
			</tr>
			<tr>
						<td>City</td>
						<td>
								<f:select path="city">
									<f:option value="Delhi">Delhi</f:option>
								    <f:option value="Punjab">Punjab</f:option>
								    <f:option value="Pune">Pune</f:option>
								    <f:option value="Mumbai">Mumbai</f:option>
								    <f:option value="Chennai">Chennai</f:option>
							    </f:select>
						
						
						</td>
			
			</tr>
			<tr>
						<td>Address</td>
						<td>
							<f:textarea path="address"/>
						</td>
			
			</tr>
			
			<tr>
						<td></td>
						<td>
						    <input type="submit" value="Submit">
						    <input type="reset" value="Reset">
					   </td>
					
			
			</tr>
			</table>

       </f:form>

</body>
</html>