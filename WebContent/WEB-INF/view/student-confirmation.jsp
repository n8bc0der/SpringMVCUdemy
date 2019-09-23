<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
		<title>Student Confirmation Form</title>
</head>

<body>

The student name is : ${student.firstName} ${student.lastName}

<br>
<br>

${student.firstName } ${student.lastName } is from ${student.country }

<br>

<%-- ${student.firstName } ${student.lastName }'s favorite language is ${student.favoriteLanguage } --%>

<br>

${student.firstName } ${student.lastName }'s favorite language is ${student.favoriteLanguage }

<br>

${student.firstName } ${student.lastName }'s have operated
<ul>

	<c:forEach var = "temp" items="${student.operatingSystems }">
		
		<li>${temp}</li>
	
	</c:forEach>

</ul>
 

</body>

</html>