<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Passowrd</title>
</head>
<body>
<center>
<h3>Change Password</h3>
<form action="ForgetServlet" method="post">
<table border="1px">
<tr><td>Enter Username:</td>
<td><input type="text" name="uname"></td>
</tr>
<tr><td>Enter new password:</td>
<td><input type="password" name="password"></td>
</tr>
<tr><td>Confirm new password:</td>
<td><input type="password" name="password1"></td>
</tr>
<tr><td><input type="submit" value="Change Password"></td>
<td><input type="reset" value="Cancel"></td>
</tr>
</table>
</form>
</center>
<%@ include file = "footer.jsp" %>
</body>
</html>