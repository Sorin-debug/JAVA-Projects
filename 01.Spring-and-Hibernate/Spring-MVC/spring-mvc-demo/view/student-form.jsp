<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>


<body>

<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName" />

<br><br>

Last name: <form:input path="lastName" />

<br><br>

Country:
<form:select path="country">

<form:option value="Romania" label="Romania"/>
<form:option value="Germany" label="Germany"/>
<form:option value="England" label="England"/>
<form:option value="Spain" label="Spain"/>

</form:select>
<br><br>


Country option from a list:
<form:select path="countryHash">

<form:options items="${student.countryOptions}" />

</form:select>

<br><br>

Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>


<br><br>

Favorite language from LinkedHashMap:
<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />



<br><br>
<input type="submit" value="Submit" />


</form:form>


</body>

</html>