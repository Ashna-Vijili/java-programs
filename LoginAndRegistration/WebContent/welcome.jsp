<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> WELCOME PAGE !!</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");


if(session.getAttribute("username") == null)
{
	response.sendRedirect("login.jsp");
}


%>

<h2> WELCOME TO ${ username }</h2>
<br>
<div class="container">
<a href="welcome.jsp">Home</a>
<a href="about.jsp">About us</a>
<a href="admin.jsp">Admin</a>

</div>
<form action="Logout">
<input type="submit" value="Logout"> <br><br>
</form>
</body>
</html>