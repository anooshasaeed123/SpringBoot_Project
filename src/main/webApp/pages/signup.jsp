<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/newsignup" method = "post">
Enter your full Name: <input type="text" name ="name"><br>
Email: <input type="email" name ="email"><br>
password: <input type="password" name = "password1"><br>
Re Enter password <input type="password" name ="password2"> <br>
 <p>Please select your gender:</p>
  <input type="radio" id="male" name="gender" value="male">
  <label for="male">Male</label><br>
  <input type="radio" id="female" name="gender" value="female">
  <label for="female">Female</label><br>
  <input type="radio" id="other" name="gender" value="other">
  <label for="other">Other</label> <br>
 <input type = "submit" value="Create Account">
 </form>
</body>
</html>