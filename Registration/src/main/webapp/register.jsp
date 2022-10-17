<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<form action ="register" method ="post">
<table> 
<tr><td> First Name:</td><td><input type= "text" name="first_name"></td></tr>
<tr><td> Last Name</td><td><input type= "text" name="last_name"></td></tr>
<tr><td> Username:</td><td><input type= "text" name="uname"></td></tr>
<tr><td> Password:</td><td><input type= "password" name="password"></td></tr>
<tr><td> email:</td><td><input type= "text" name="email"></td></tr>
<tr><td> Type:</td><td><input type= "text" name="type"></td></tr>

<tr><td></td><td><input type= "submit" value="register"></td></tr>

</table></form>
</body>
</html>