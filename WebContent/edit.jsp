<%@page import="com.bean.complainBean"%>
<%@page import="java.beans.beancontext.BeanContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
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

<%
String Date = (String)request.getAttribute("Date");
String Title = (String)request.getAttribute("Title");
String Detail = (String)request.getAttribute("Detail");
String Add = (String)request.getAttribute("Add");
String MNum = (String)request.getAttribute("Mnum");
int Id = (Integer)request.getAttribute("Id");

System.out.println("edit jsp :" + Date + Detail + Add + Id + MNum );

%>
<form action="ComplainUpdateController">
<table bgcolor="red">
<tr>
	<td class="td"> <img  src="C:\Users\NEW\eclipse-workspace\BrainyBeamTech\WebContent\pic\c_image.jpg"> </td>
	
	<td>
	<form action="complainController">
	<table bgcolor="orange" >	
	<tr>
	<td><h1> COMPLAIN </h1> </td>
	</tr>
	<tr> <td> <input type="hidden" name=id value= <%= Id %>> </td></tr>
	<tr>
	<td> Title  </td>
	<td> : <input type="text" name="title" value=<%= Title%>> </td>
	</tr>
	
	<tr>
	<td> Detail </td>
  	<td> <textarea rows="5" cols="18"  name="detail" value=<%= Detail %>> </textarea></td>
	</tr>

	<tr>
	<td> Adress </td>
	<td> <textarea rows="3" cols="18"name="adress" value=<%= Add %>> </textarea></td>
	</tr>
	
	<tr>
	<td> Mobile Number</td>
	<td> : <input type="text" name="mNumber" value=<%= MNum %>> </td>
	</tr>
	
	<tr>
	<td> Problem Date </td>
	<td> : <input type="text"  name="date" value=<%= Date %>> </td>
	</tr>
	<tr>
	<td> </td>
	<td> <input type="submit" value="Submit"> </td>
	</tr>
	</table>
	</form>
	</td>
	
</tr>
</table>
</form>
</body>
</html>