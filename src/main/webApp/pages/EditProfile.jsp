<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit profile</title>
</head>
<body>
<h2>Edit Profile</h2>
<H3>Work</H3>
<form action="submitwork" method = "post">
Title: <input type="text" name ="title"><br>
Company: <input type = "text" name="company"><br>
StartDate:<input type ="date" name ="sDate"><br>
EndDate: <input type ="date" name="eDate"><br>
<input type="submit" value="Add Work">
</form>
<h3>Education</h3>
<form action="">
Degree: <input type="text" name ="degree"><br>
School: <input type = "text" name="school"><br>
StartDate:<input type ="date" name ="sDate"><br>
EndDate: <input type ="date" name="eDate"><br>
<input type="submit" value="Add Education">
</form>

</body>
</html>