<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<style>
	body{
		background-image:url("login.jpeg");
		background-repeat:no-repeat;
		background-position:center;
		background-attchment:fixed;
	}
	table{
		 margin-left: 37%;
		 align:center;
		 background-color:black;
		 border-top-right-radius: 5px;
	}
</style>
</head>
<body>
<form action="loginController">
<table>
	<tr>
		<td><font color="white" size="10px">Login </font></td>
	</tr>
	<br><br>
	<tr>
		<td><font color="white" size="5px">UserName</font> </td>
		<td>: <input type="email" name="email"> </td>
	</tr>
	<br><br><br><br>
	<tr>
		<td><font color="white" size="5px">Password </font></td>
		<td>: <input type="password" name="password"> </td>
	</tr>
	<br><br><br><br>
	<tr>
		<td> </td>
		<td><input type="submit" value="login"></td>
	</tr>
</table>
</form>
</body>
</html>