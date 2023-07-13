<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<form:form action="saveStudent" modelAttribute="student" method="POST">

		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			
			<tr>
				<td>Address</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="pwd" /></td>
			</tr>
			
			<tr>
				<td>Age</td>
				<td><form:input path="age" /></td>
			</tr>
			
			<tr>
				<td>Gender</td>
				<td><form:radiobuttons path="gender" items="${genders}" /></td>
			</tr>
			<tr>
				<td>Course Name</td>
				<td><form:select path="course" items="${courses}" /></td>
			</tr>
			<tr>
				<td>Timings</td>
				<td><form:checkboxes path="timings" items="${timings}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>

		</table>
	</form:form>
</body>
</html>