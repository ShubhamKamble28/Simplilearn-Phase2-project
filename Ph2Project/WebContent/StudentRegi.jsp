<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Student Registration</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/font-awesome.min.css" rel="stylesheet">
	<link href="resources/css/datepicker3.css" rel="stylesheet">
	<link href="resources/css/styles.css" rel="stylesheet">
	
	<!--Custom Font-->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br>
<div align="center">
<b>Student Registration Form</b>
<br>
<form method ="post" action = "RegistrationServlet">
<br>
			<table class="table" border="3">
					<tr>
						<td>Name</td>
						<td><input type="text" name= "name"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name= "email"></td>
					</tr>
					<tr>
						<td>Phone No.</td>
						<td><input type="text" name= "phone"></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><textarea cols="20" rows="6" name= "add"></textarea></td>
					</tr>
					<tr>
						<td>Date_Of_Birth</td>
						<td><input type="date" name= "dob"></td>
					</tr>
					<tr>
						<td>Standard</td>
						<td><select name= "std">
						<option>select</option>
						<option>1st</option>
						<option>2nd</option>
						<option>3rd</option>
						<option>4th</option>
						<option>5th</option>
						<option>6th</option>
						<option>7th</option>
						<option>8th</option>
						<option>9th</option>
						<option>10th</option>						
						</td>
					</tr>
					<tr>
						<td>Gender</td>
						<td>M<input type="radio" name= "gender" value = "M">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						F<input type="radio" name="gender" value ="F">	
						</td>
					</tr>
					<tr>
						<td><input type="submit" value= "Register"></td>
						<td><input type="reset" value="Cancle"></td>
					</tr>
			</table>
		
		</form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
<script src="resources/js/jquery-1.11.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/chart.min.js"></script>
	<script src="resources/js/chart-data.js"></script>
	<script src="resources/js/easypiechart.js"></script>
	<script src="resources/js/easypiechart-data.js"></script>
	<script src="resources/js/bootstrap-datepicker.js"></script>
	<script src="resources/js/custom.js"></script>

</body>
</html>