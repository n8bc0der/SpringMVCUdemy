<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
		<title>Student Form</title>
</head>

<body>

		<form:form action = "processStudentForm" modelAttribute = "student">
		
		First Name : <form:input path="firstName"/>
		
		<br>
		
		Last Name : <form:input path="lastName"/>
		
		<br>
		
		<!--|| Mapping countryList from Student class fetching values stored in constructor ||-->
		
		<%-- Country : <form:select path="country">
		
			<form:options items="${student.countryList }" />
		
		</form:select> --%>
		
		Country : <form:select path="country"> 
     					<form:options items="${theCountryList}" />
    			  </form:select>
		
		<!--|| Using spring form select field to get country values in drop-down list ||-->
		
		<%-- Country : <form:select path="country">
		
			<form:option value="Australia" label = "AUS" />
			<form:option value="Brazil" label = "BR" />
			<form:option value="Canada" label = "CAN" />
			<form:option value="Denmark" label = "DEN" />
			<form:option value="Egypt" label = "EGY" />
			<form:option value="France" label = "FRA" />
			<form:option value="Germany" label = "GER" />
			<form:option value="Hong Kong" label = "HKD" />
			<form:option value="India" label = "IND" />
			<form:option value="Denmark" label = "JA" />
			<form:option value="Kenya" label = "KY" />
			<form:option value="Lithuania" label = "LT" />
			<form:option value="Mexico" label = "MEX" />
			<form:option value="Netherlands" label = "NL" />
			<form:option value="Oman" label = "OMR" />
			<form:option value="Portugal" label = "POR" />
			<form:option value="Qatar" label = "QA" />
			<form:option value="Russia" label = "RU" />
			<form:option value="Spain" label = "ESP" />
			<form:option value="Turkey" label = "TR" />
			<form:option value="United Kingdom" label = "UK" />
			<form:option value="Venezuela" label = "VZA" />
			<form:option value="Wales" label = "WAL" />
			<form:option value="emen" label = "YE" />
			<form:option value="Zimbabwe" label = "ZIM" />
		
		</form:select> --%>
		
		<br>
		
		<%-- Favorite Language : 
		
		Java<form:radiobutton path="favoriteLanguage" value="Java"/>
		C#<form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
		
		<%= getSpaces(20)%>
		
		Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />
		Javascript<form:radiobutton path="favoriteLanguage" value="Javascript"/>
		Angular<form:radiobutton path="favoriteLanguage" value="Angular"/> --%>
		
		
		
		Favorite Language : <form:radiobuttons path="favoriteLanguage" items = "${student.languageList }"/>
		
		<br>
		
		Operating System : 
		
		Windows<form:checkbox path="operatingSystems" value = "Windows"/>
		Mac OS<form:checkbox path="operatingSystems" value = "Mac OS"/>
		Linux<form:checkbox path="operatingSystems" value = "Linux"/>
		Ubuntu<form:checkbox path="operatingSystems" value = "Ubuntu"/>
		
		<br>
		
		<input type = "submit" value = "Submit">
		
		
<!-- Tried to add multiple spaces and line break for Buttons but not successful currently -->		
		
<%-- 		<%!
			public String getSpaces(int numSpaces)
				{
  					StringBuffer buffer = new StringBuffer(numSpaces);
  					for(int i = 0; i < numSpaces; i++)
    					buffer.append(" ");
  					return buffer.toString();
				}
		%> --%>
		
		</form:form>

</body>

</html>