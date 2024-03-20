<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="save" ModelAttribute="user">

<label for fname> First Name:</label><br>
<input type="text" id="fName" name="fName"><br>
<label for lname> Last Name:</label><br>
<input type="text" id="lName" name="lName"><br>
<label for fname> Age:<br>
<input type="text" id="age" name="age"><br>
<input type="radio" id="male" name="gender" value="MALE">
<label for="male">Male</label><br>
<input type="radio" id="female" name="gender" value="FEMALE">
<label for="female">Female</label><br>
 <label for="state">Choose your state:</label>
  <select name="state" id="state">
    <option value="Odisha">Odisha</option>
    <option value="Maharashtra">maharashtra</option>
    <option value="Gujarat">Gujarat</option>
    <option value="Karnataka">Karnataka</option>
  </select>
  <button type="submit">SUBMIT</button>
 </form> 
</body>
</html>