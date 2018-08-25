<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<h1>This is Student form</h1>

	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
		<br>
		<br>
	Last name: <form:input path="lastName" />
		<br>
		<br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>