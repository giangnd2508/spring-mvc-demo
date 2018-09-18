<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>

<html>
<body>
	<h1>This is Customer Detail</h1>

	<h2>Your name is: ${customer.firstName} ${customer.lastName}</h2>
	<div>Free passes: ${customer.freePasses}</div>
	<div>Postal Code: ${customer.postalCode}</div>
	<div>Course Code: ${customer.courseCode}</div>

</body>
</html>