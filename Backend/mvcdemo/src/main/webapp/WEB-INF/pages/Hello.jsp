<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="save" ModelAttribute="user">
 
<label for firstName> First Name:
</label><input type="text" id="firstName" name="firstName">

<label for lastName> Last Name:
</label><input type="text" id="lastName" name="lastName">
<label for lastName> Address:
</label><input type="text" id="address" name="address">


<button type="submit">Save</button>
</form>
</body>
</html>