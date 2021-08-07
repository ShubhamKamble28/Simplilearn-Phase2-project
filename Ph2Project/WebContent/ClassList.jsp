<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.List,com.model.RegisterBean,com.connection.Studentlist,com.model.AddTeacher,com.connection.AddTeacherDao,com.connection.TeacherList,com.controller.TeacherServlet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Class List</title>

<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Online Learner - Dashboard</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/font-awesome.min.css" rel="stylesheet">
	<link href="resources/css/datepicker3.css" rel="stylesheet">
	<link href="resources/css/styles.css" rel="stylesheet">
	
	<!--Custom Font-->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
	

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<b>Subjects for Classes </b> 
<div align = "center">
<form action="ClassList.jsp">

Standard <select name="std">
<option>ALL</option>
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
</select>
<br>
<input type="submit" value="Search">
</form>

	<table class="table" border="3">
	<thead class="black white-text">
      <tr>
        <th scope="col">Class</th>
        <th scope="col">Subject</th>
      </tr>
    </thead>
	
	
	<% 
	
	List<RegisterBean> l =Studentlist.search(request.getParameter("std"));
	List<AddTeacher> l1 = TeacherList.search(request.getParameter("subject"));
	for(RegisterBean rb:l)  for(AddTeacher at:l1)
	{
		%>
		
		<tbody>
      <tr>
		<td><%= rb.getStd() %></td>
		<td><%= at.getTsubject() %></td>
		 </tr>
    </tbody>
		<%
		
	}
%>

<jsp:include page="footer.jsp"></jsp:include>
<script src="resources/js/jquery-1.11.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/chart.min.js"></script>
	<script src="resources/js/chart-data.js"></script>
	<script src="resources/js/easypiechart.js"></script>
	<script src="resources/js/easypiechart-data.js"></script>
	<script src="resources/js/bootstrap-datepicker.js"></script>
	<script src="resources/js/custom.js"></script>


</div>
</body>
</html>