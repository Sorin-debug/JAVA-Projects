<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/fileTech.css">
<title>Joob Seeker Registration Form</title>
</head>


<body background="${pageContext.request.contextPath}/resources/images/Tech.jpg">

<h1>Jobs Finder - Formular register</h1>
<form:form action="processForm" modelAttribute="register">

<p class="form">First name:</p><form:input path="firstName" />
<br><br>

<p class="form">Last name:</p> <form:input path="lastName" />
<br><br>

<p class="form">E-mail address:</p> <form:input path="emailAddress" />

<br><br>
<input type="submit" value="Submit" />
</form:form>



<br><br>

<a href="/practice-mvc-jobTech">Go Back</a>
<br><br>
<h5>Jobs Finder @2021</h5>
</body>
</html>
