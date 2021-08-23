<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.complainBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Complain</title>

<style type="text/css">
	body{
	background-color: black;
	}
	.table{
	border: 3px;
	border-radius:10px;
	border-style:ridge;
	border-color: green;
	background-color: red;
	align-content: center;
	margin: 5px;
	}
	tr{
	align-content: center;
	}
</style>
</head>
<body>
<%@ include file="home.jsp" %>
<hr>

<marquee><h3><font color="blue">Your Complain Details :</font></h3></marquee>
<% 
	List<complainBean> listofComplain = (ArrayList) request.getAttribute("complain");
	for(int j=0;j<listofComplain.size();j++)
	{
		System.out.println(listofComplain + " ");
		System.out.println();
	}
%>
<table border="2px" class=".table">
<tr align="center" bgcolor="yellow">
	<td><h4>id</h4></td>
	<td><h4>Date</h4> </td>
	<td><h4>Title</h4></td>
	<td><h4>Detail</h4> </td>
	<td><h4>Address</h4> </td>
	<td><h4>MobileNumber</h4> </td>
	<td><h4>Action</h4> </td>
</tr>
<tr>
	<% for(int i=10;i<listofComplain.size();i++)
	   {
			complainBean bean = listofComplain.get(i);	
			System.out.println(bean.getId() +bean.getDate() +bean.getTitle()  );
	%>
	<td><%=bean.getId() %>
	<td><%=bean.getDate() %> </td>
	<td><%=bean.getTitle() %> </td>
	<td><%=bean.getDetails() %> </td>
	<td><%=bean.getAddress() %> </td>
	<td><%=bean.getMobileNumber() %> </td>
	<td><a href="ComplainEditController?id=<%=bean.getId() %>">update</a>/<a href="ComplainDeleteController?id=<%= bean.getId()%>">delete</a></td>
</tr>		
   <% } %>

<h3> <a href="home.jsp"> <button style="background-color: lightblue; border:2px;border-style: solid;border-color:lightpink; "> Back To Home Page</button></a></h3>
</table>
</body>
</html>