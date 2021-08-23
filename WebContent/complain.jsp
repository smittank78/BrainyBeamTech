<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ComplainPage</title>
<style type="text/css">
	img{
	width: 60%;
	height:400px;
	size: inherit;
	}
	table{
	padding : 10px;
	border-radius:5px;
	}	
	.td{
	padding: 10px;
	}
	button {
	size : auto;
}
</style>
</head>
<body bgcolor="red">
<%@ include file="home.jsp" %>

<table bgcolor="red">
<tr>
	<td class="td"> <img  src="C:\Users\NEW\eclipse-workspace\BrainyBeamTech\WebContent\pic\c_image.jpg"> </td>
	
	<td>
	<form action="complainController">
	<table bgcolor="orange" >	
	<tr>
	<td><h1> COMPLAIN </h1> </td>
	</tr>
	<tr>
	<td> Title  </td>
	<td> : <input type="text" placeholder="enter complain title" name="title"> </td>
	</tr>
	
	<tr>
	<td> Detail </td>
  	<td> <textarea rows="5" cols="18" placeholder="Complain details" name="detail"> </textarea></td>
	</tr>

	<tr>
	<td> Adress </td>
	<td> <textarea rows="3" cols="18" placeholder="enter adress" name="adress"> </textarea></td>
	</tr>
	
	<tr>
	<td> Mobile Number</td>
	<td> : <input type="text" placeholder="enter mobile number" name="mNumber"> </td>
	</tr>
	
	<tr>
	<td> Problem Date </td>
	<td> : <input type="text" placeholder="from how many days you face this problem?" name="date"> </td>
	</tr>
	<tr>
	<td> </td>
	<td> <input type="submit" value="Submit"> </td>
	</tr>
		<tr align="right">
	<td><h3> <a href="home.jsp"><button style="background-color: lightblue; border:2px;border-style: solid;border-color:lightpink;"> Back To Home Page</button</a></h3>
	</td>
	</tr>
		
	</table>
	</form>
	</td>
</tr>
	
</table>
</body>
</html>