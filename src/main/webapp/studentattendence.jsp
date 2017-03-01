<!Doctype html>
<html>
<head>
<title>Student Attendence
</title>
<link rel=stylesheet href="stylesheet.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
	<div>
	<h1  > <img src="thapar.jpg" style="float:left;margin-top:3px; margin-left:30px; width:100px;height:120px;border: 3px solid #000; box-shadow: 0 0 40px #fff;">Online Attendance Management System</h1>
</div>
<nav>
			<a href="faculty.jsp">home</a>
<!--			<a href="classdetails.jsp">class</a>-->
			<a href="#">Faculty</a>
			<a href="#">Student</a>
			   <a href="#">Logout</a>
		
</nav>   
 <div style="margin-left:300px;">
    <fieldset style="box-shadow: 10px 10px 10px #bbb;  border-radius: 10px; width: 30%; height: 220pt;" >
        <legend style="background-color:  #F40000;"> Student Daily Attendence</legend>


<form action="saveatd" method="post">
Student Roll No:<input type="text" name="rollno" placeholder="Enter Student RN Please"> <br>
Student   ID:  <input type="text" name="studentid" placeholder="Enter Student ID Please"> <br>
Student Name:<input type="text" name="name" placeholder="Enter Student Name Please"> <br>
Student Status:<input type="text" name="status" placeholder="Enter Student Name Please"> <br>
Student Subject:<input type="text" name="subject" placeholder="Enter Student Name Please"> <br>
Student  Attendence Date:<input type="text" name="attendencedate" placeholder=" Enter Date ONLY "> <br>

<input type="submit" style= "float: right; background-color:#f40000 ; width: 100px;border:1px solid white; border-bottom:3px solid white;  color:white;">
</form>

</fieldset>
</div>
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