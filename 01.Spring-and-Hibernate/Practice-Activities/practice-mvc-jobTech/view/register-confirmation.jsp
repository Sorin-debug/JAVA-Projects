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
<p class="blacky">Your registration is confirmed:</p>

<hr>
First Name: ${register.firstName } 
<br>
Last Name: ${register.lastName }
<br>
Email Address: ${register.emailAddress }
<br>
<br><br>
<h5>Jobs Finder @2021</h5>

</body>
</html>