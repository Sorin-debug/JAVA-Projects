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

</body>

</html>