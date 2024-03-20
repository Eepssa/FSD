<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="save" ModelAttribute="userservice">
 
<label for fName> First Name:
</label><input type="text" id="fName" name="fName">

<label for lName> Last Name:
</label><input type="text" id="lName" name="lName">

<input type="radio" id="male" name="gender" value="Male">
  <label for="male">Male</label><br>
  <input type="radio" id="female" name="gender" value="Female">
  <label for="female">Female</label><br>

  <input type="checkbox" id="vehicle1" name="vehicle" value="Bike">
<label for="vehicle1"> I have a bike</label><br>
<input type="checkbox" id="vehicle2" name="vehicle" value="Car">
<label for="vehicle2"> I have a car</label><br>

<button type="submit">Click Me!!!!</button>
</form>
</body>
</html>