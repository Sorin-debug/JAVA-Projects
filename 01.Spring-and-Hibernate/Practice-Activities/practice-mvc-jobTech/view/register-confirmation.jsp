<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- reference JSTL tag library -->

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/fileTech.css">
<title>New Registration</title>
</head>

<body class="confirmed">

<h1>Jobs Finder</h1>
<img src="${pageContext.request.contextPath}/resources/images/okAdd.png"/>

<p class="blacky">Your registration is confirmed </p>
<hr>
First Name: <b> ${register.firstName } </b>
<br>
Last Name: <b> ${register.lastName } </b> 
<br>
Email Address: ${register.emailAddress }
<br>
Phone number: ${register.phoneNumber }
<br>
IT Field: ${register.itOptionField }
<br>
Job Level: ${register.jobLevel }
<br>
Time percentage of travel: ${register.timeTravel }
<br>

<!--  we create a  bullet list -->
#Programming:
<ul>
<c:forEach var="temp" items="${register.programmingLanguage }">
<li> ${temp} </li>
</c:forEach>
</ul>
<br>
Salary wanted: ${register.salaryDesire }
<br>
Source information: ${register.sourceNews }
<br>



<br><br>
<h5>Jobs Finder @2021</h5>

</body>
</html>