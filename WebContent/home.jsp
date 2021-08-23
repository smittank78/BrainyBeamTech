<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<style>
	body{
		background-color: aqua;
	}
	h1{
	text-transform :uppercase;
	text-decoration :inherit;
	}
	a{ text-decoration : none ;  color : blue ;}
	a:hover{background-color: yellow; }
	td{
	padding-left: 10px;
	padding-right: 10px;
	}
	tr:hover{ background-color: black;}
	td:hover{ background-color:lightgreen;}
	table {
	border: 3px;
	border-color: 
	}
</style>
</head>
<body>
<h1 align="center">Welcome to Ahmedabad Live </h1>
<table>
<hr>
<tr style="border-style: dotted;">
<td> <a href="complain.jsp"><h4>Complain</h4></a> </td>
<td> <a href="showComplain"><h4>Show Complain</h4></a>  </td>
<td> <a href="profile.jsp"><h4>View Profile</h4></a>  </td>
<td> <a href="logout.jsp"><h4>Log-Out</h4></a>  </td>
<td> <a href="feedback.jsp"><h4>Feed-Back</h4></a>  </td>

</td>
</tr>

</table><hr>
</body>
</html>