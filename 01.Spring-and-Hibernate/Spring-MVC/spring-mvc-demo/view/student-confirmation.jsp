<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- reference JSTL tag library -->

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>


<body>


The student is confirmed: ${student.firstName } ${student.lastName }

<br><br>

Country: ${student.country}  <!-- Spring will call student.GetCountry() --> 


<br><br>

Country Hash: ${student.countryHash}  <!-- Spring will call getCountryOptions()  --> 


<br><br>

Favorite Language: ${student.favoriteLanguage }


<br><br>

Operating Systems:
<!--  we create a  bullet list -->
<ul>
<c:forEach var="temp" items="${student.operatingSystems }">
<li> ${temp} </li>
</c:forEach>
</ul>






</body>

</html>