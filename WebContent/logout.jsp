<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogOutPage</title>
</head>
<body>
<%
	session.invalidate();
	System.out.print("Session Invalidated..............");
%>
<c:redirect url="login.jsp"> </c:redirect>
</body>
</html>