<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.List,com.model.AddTeacher,com.connection.TeacherList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher List</title>

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
<b>New Teacher <a href = "AddTeacher.jsp">Add Here</a>!!!</b></br>
<b>Search Teacher by applying filter on Subject</b> 
<div align = "center">
<form action="TeacherList.jsp">

Subject <select name="subject">
<option>ALL</option>
						<option>MARATHI</option>
						<option>HINDI</option>
						<option>ENGLISH</option>
						<option>MATHS</option>
						<option>SCIENCE</option>
						<option>HISTORY</option>
						<option>GEOGRAPHY</option>	
</select>
<br>
<input type="submit" value="Search">
</form>


	<table class="table" border="3">
	<thead class="black white-text">
      <tr>
        <th scope="col">Title</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Phone No</th>
        <th scope="col">Subject</th>
        <th scope="col">Highest Qaulification</th>
      </tr>
    </thead>
	
	
	<% 
	
	List<AddTeacher> l = TeacherList.search(request.getParameter("subject"));
	for(AddTeacher at:l)
	{
		%>
		
		<tbody>
      <tr>
		<td><%= at.getTitle() %></td>
		<td><%= at.getTname() %></td>
		<td><%= at.getEmail() %></td>
		<td><%= at.getPhoneno() %></td>
		<td><%= at.getTsubject() %></td>
		<td><%= at.getQualificataion() %></td>
		
		
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