<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
h4,h3
{
text-align: center;
color: red;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>loginfo</title>
</head>
<body bgcolor="#ccc">
<h4>Hello Admin! Following is your Searched Student Details </h4>

<table align="center">
<tr><th>Student ID:</th><td> ${model.studentid}</td></tr>
<tr><th>Name:</th><td> ${model.name}</td></tr>
 <tr><th>Email:</th><td> ${model.email}</td></tr>
<tr><th>City:</th><td> ${model.city}</td></tr>
<tr><th>State:</th><td> ${model.state}</td></tr>
<tr><th>Country:</th><td> ${model.cname}</td></tr>
<tr><th>Study Plan:</th><td> ${model.splan}</td></tr>
</table>
<h3><a href="index.jsp">Home</a></h3>
</body>
</html>