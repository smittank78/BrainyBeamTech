<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feed-Back Page</title>
<style type="text/css">
	.d1{
	background-color: lime;
	width: 400px;
	height: 450px;
	border: 4px;
	border-style: double;
	border-radius: 10px;
	margin: 10px;
	padding: 10px;
	}
	.d2{
	background-color: lightblue;
	align-content: center;
	width: 500px;
	height: 480px;
	}
	h2 {
    display: block;
    font-size: 1.5em;
    font-weight: bold;
    text-align: center;
	text-shadow: 5px;
	}
	d3{
	text-align: center;
	align-items: center;
	}
	td{
	text-transform:capitalize;
	}
</style>
</head>
<body bgcolor="lightblue">
<%@ include file="home.jsp" %>
<hr>
<table class="t2">	
<tr>
<td>
<div class="d1">
<br>
<a href="home.jsp"><button>back to home page</button></a>
<br><br>
<form action="FeedbackController" method="post">
<table class="t1">
<font size="20px"><b>Feed Back</b></font> <br><br>
<tr>
	<td><b>Title </b>  </td>
	<td>: <input type="text" placeholder="enter feed-back title" name="fTitle"></td>
</tr><br>
<tr>
	<td><b>Description </b> </td>
	<td>: <textarea rows="3" cols="15" placeholder="enter Description" name="fDes"></textarea>	
</tr>
<tr>
	<td> <b> Experience </b></td>
	<td>:<input type="radio" name="fExperience"><b>very bad </b><br>
		<input type="radio" name="fExperience"><b>bad </b><br>
		<input type="radio" name="fExperience"><b>good</b><br>
		<input type="radio" name="fExperience"><b>very good</b><br>
		<input type="radio" name="fExperience"><b>awsome</b> 
	</td>
</tr>
<tr>
	<td><b>date</b> </td>
	<td>: <input type="date" placeholder="todays date" name="fDate"> </td>
</tr>
<tr>
	<td><b>Suggestions </b> </td>
	<td>: <textarea rows="2" cols="15" placeholder="enter suggestions" name="fSuggestion"></textarea> </textarea> </td>
</tr>
<tr>
	<td> </td>
	<td> <input type="submit" value="Submit"> </td>
</tr>
</table>
</form>
</div>
</td><td> </td>
<td>
<div class="d2" >
<div class="d3" style="background-color: lightblue;">
<br><br><br><br><br><br>
<h2>T H N K Y O U </h2>
<h2> F O R  </h2>
<h2>   F E E D B A C K </h2>
</div>
</div>
</td>
</tr>
</table>
</body>
</html>