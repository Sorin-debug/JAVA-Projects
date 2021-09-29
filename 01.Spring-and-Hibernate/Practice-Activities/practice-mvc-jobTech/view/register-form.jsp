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

<p class="formTitle">Entry Data</p>
<i>Fill out the form. Asterisk(*) means required field.</i>
<form:form action="processForm" modelAttribute="register">

<p class="form">First name:</p><form:input path="firstName" />
<br>

<p class="form">Last name: </p><form:input path="lastName" />
<br>

<p class="form">(*) E-mail address:</p><form:input path="emailAddress" />
<i><form:errors path="emailAddress" cssClass="error"/></i>
<br>
<p class="form">(*) Phone number:</p> <form:input path="phoneNumber" />
<i><form:errors path="phoneNumber" cssClass="error"/></i>
<br>

<p class="form">Choose It Field from list </p> 
<form:select path="itOptionField">
<form:options items="${register.itOption}" />
</form:select>
<br>

<p class="form">Select your level</p> 
<form:select path="jobLevel">
<form:option value="Junior" label="Junior"/>
<form:option value="Mid" label="Mid"/>
<form:option value="Senior" label="Senior"/>
<form:option value="Executive" label="Executive"/>
</form:select>

<br>
<p class="form">Willingness to travel:</p>

<p class="form">
10% <form:radiobutton path="timeTravel" value="10%"/>
30% <form:radiobutton path="timeTravel" value="30%"/>
50% <form:radiobutton path="timeTravel" value="50"/>
I can't <form:radiobutton path="timeTravel" value="Not possible!"/>
</p>

<p class="form">Mark used language:</p> 

<p class="form">
Java <form:checkbox path="programmingLanguage" value="Java"/>
C++ <form:checkbox path="programmingLanguage" value="C++"/>
C# <form:checkbox path="programmingLanguage" value="C#"/>
Other <form:checkbox path="programmingLanguage" value="Other"/>
None <form:checkbox path="programmingLanguage" value="None "/>
</p>


<br><br>
<input type="submit" value="Submit" />
</form:form>



<br><br>

<a href="/practice-mvc-jobTech">Go Back</a>
<br>
<h5>Jobs Finder @2021</h5>
</body>
</html>
