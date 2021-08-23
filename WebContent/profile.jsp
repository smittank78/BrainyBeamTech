<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body bgcolor="lightgreen"></body>

<%@ include file="home.jsp" %>
<hr>
<h1> Your Profile </h1>
<h2><a href="home.jsp" ><button type="button" >back to home page</button></a></h2>
<br>
<% HttpSession session1 = request.getSession();
	
	String FirstName = (String)session.getAttribute("FirstName");
	String MiddelName = (String)session.getAttribute("MiddelName");
	String LastName = (String)session.getAttribute("LastName");
	
	String sBirthDate= (String)session.getAttribute("BOD");
	String sClg =(String)session.getAttribute("Clg");
	String sClgState= (String)session.getAttribute("ClgState");
	String sClgCity = (String)session.getAttribute("ClgCity");
	
	String sGraduation = (String)session.getAttribute("Graduation");
	String sDepartment =(String)session.getAttribute("Department");
	String sEmail= (String)session.getAttribute("Email");

%>
<b>
First Name :<%= FirstName %>
Middel Name :<%= MiddelName %>
Last Name :<%= LastName%>
 <br><br>
BOD :<%= sBirthDate %><br><br>
College :<%= sClg %><br><br>
College State :<%= sClgState %><br><br>
College City :<%= sClgCity %><br><br>
Graduation :<%= sGraduation%><br><br>
Department :<%= sDepartment%><br><br>
Email :<%= sEmail %>

</b>
</body>
</html>