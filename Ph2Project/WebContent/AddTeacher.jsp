<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Add Teacher</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/font-awesome.min.css" rel="stylesheet">
	<link href="resources/css/datepicker3.css" rel="stylesheet">
	<link href="resources/css/styles.css" rel="stylesheet">
	
	<!--Custom Font-->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
<b>Teacher Registration Form</b>
<form method ="post" action = "TeacherServlet">
			<table class="table" border="3">
			
					<tr>
						<td>Title</td>
						<td><select name= "title">
						<option>select</option>
						<option>Mr.</option>
						<option>Miss.</option>
						<option>Mrs.</option>						
						</td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input type="text" name= "tname"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name= "email"></td>
					</tr>
					<tr>
						<td>Phone No.</td>
						<td><input type="text" name= "phoneno"></td>
					</tr>
					<tr>
						<td>Subject</td>
						<td><select name="subject"><option>select</option>
						<option>MARATHI</option>
						<option>HINDI</option>
						<option>ENGLISH</option>
						<option>MATHS</option>
						<option>SCIENCE</option>
						<option>HISTORY</option>
						<option>GEOGRAPHY</option>	
						</select></td>
					</tr>
					<tr>
						<td>Qualification</td>
						<td><select name="qualification"><option>select</option>
						<option>BA</option>
						<option>MA</option>
						<option>B.ed</option>
						<option>M.ed</option>
						<option>D.ed</option>
						<option>BE</option>
						</select></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td>M<input type="radio" name= "gender" value = "M">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						F<input type="radio" name="gender" value ="F">	
						</td>
					</tr>
					<tr>
						<td><input type="submit" value= "Add"></td>
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