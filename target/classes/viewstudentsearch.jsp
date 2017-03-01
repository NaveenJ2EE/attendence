<!Doctype html>
<html>
<head>
<title>search result
</title>
<link rel=stylesheet href="stylesheet.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
	<div>
	<h1  > <img src="thapar.jpg" style="float:left;margin-top:3px; margin-left:30px; width:100px;height:120px;border: 3px solid #000; box-shadow: 0 0 40px #fff;">Online Attendance Management System</h1>
</div>
<nav>
			<a href="index.jsp">home</a>
<!--			<a href="classdetails.jsp">class</a>-->
			<a href="#">Faculty</a>
			<a href="#">Student</a>
			   <a href="#">Logout</a>
		
</nav>   

<h4 align="center">Hello Admin! Following is your Searched Student Details </h4>

<table align="center">
<tr><th>Student ID:</th><td> ${model.studentid}</td></tr>
<tr><th>Name:</th><td> ${model.name}</td></tr>
 <tr><th>Email:</th><td> ${model.email}</td></tr>
<tr><th>City:</th><td> ${model.city}</td></tr>
<tr><th>State:</th><td> ${model.state}</td></tr>
<tr><th>Country:</th><td> ${model.cname}</td></tr>
<tr><th>Study Plan:</th><td> ${model.splan}</td></tr>
</table>

<div class="clear">
</div>
<br/>
<center>
<footer >
&copy Naveen Chandra
</footer>
</center>


</body>
</html>