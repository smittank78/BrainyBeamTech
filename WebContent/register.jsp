<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="lightpink">
	<h1>Welcome User </h1>
	<h4>please fill this form</h4> 
	<form action="UserRegistrationController">
		<table bgcolor="lightblue" >
			<tr>
				<td>First Name </td>
				<td>: <input type="text" name="firstName" required="required"> </td>
				<td>Midel Name </td>
				<td>: <input type="text" name="midelName" required="required"> </td>
				<td>Last Name </td>
				<td>: <input type="text" name="lastName" required="required"> </td>
			</tr>
			<tr>
				<td>Student Age </td>
				<td>: <input type="number" name="studentAge" required="required"></td>
			</tr>
			<tr>
				<td> Birth Date </td>
				<td>: <input type="date"  name="studentBirthDate" required="required">
			</tr>
			<tr>
				<td>Student College</td>
				<td>: <input type="text" name="studentClg" required="required"> </td>
			</tr>
			
			<tr>
				<td>College State</td>
				<td>: <input type="text" name="studentClgState" required="required"> </td>
			</tr>
			<tr>
				<td>College City</td>
				<td>: <input type="text" name="studentClgCity" required="required"> </td>
			</tr>
			<tr>
				<td>College PinCode</td>
				<td>: <input type="number" name="studentClgPincode" required="required"> </td>
			</tr>
			<tr>
				<td>Education  </td>
				<td>: <input type="radio"  name="graduation" value="Deploma">Deploma <br>
					<input type="radio"  name="graduation" value="Degree">Degree  <br>
					<input type="radio"  name="graduation" value="master">Master
				 </td>
			</tr>
			<tr>
				<td>Department</td>
				<td>: <input type="text" name="studentDepartment" required="required"> </td>
			</tr>
			<tr>
			<td>User Email </td>
			<td>: <input type="email" name="studentEmail" required="required"> </td>
			</tr>
			<tr>
			<td>Password </td>
			<td>: <input type="password" name="studentPassword" required="required"> </td>
			</tr>
			<tr>
			<td>Ph Number</td>
			<td>: <input type="number" name="studentPhNumber" required="required"> </td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type="submit" value = "SUBMIT"> </td>
			</tr>
		</table>
	</form>
	<a href="home.jsp"><button>Skip</button></a>
</body>
</html>