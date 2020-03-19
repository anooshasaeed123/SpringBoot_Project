<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Corona Symptoms Analyzer</h3>

<form action="details" method = "post">
Enter patient ID: <input type ="text" name = "cid"><br>
Enter patient Name : <input type = "text" name = "cname"> <br>
Enter patient EmailAdress: <input type = "email" name = "cemail"><br>
Do you feel any of the symptoms mentioned below: <br>
 <input type="checkbox" id="fever" name="Symtom1" value="fever">
  <label for="vehicle1"> Fever</label><br>
  <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
  <label for="vehicle2"> flu-like symptoms such as coughing, sore throat and fatigue</label><br>
  <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
  <label for="vehicle3"> Shortness of breath</label><br><br>
<input type = "submit" value = "Submit">
</form>

</body>
</html>