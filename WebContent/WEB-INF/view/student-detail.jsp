<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>

<html>
<body>
	<h1>This is Student Detail</h1>

	<h2>Your name is: ${student.firstName} ${student.lastName}</h2>

	<p>Country: ${student.country}</p>

	<p>Favorite Language: ${student.favoriteLanguage}</p>

	Operating systems: 
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>