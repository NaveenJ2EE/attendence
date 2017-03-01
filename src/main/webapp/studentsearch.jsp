<!Doctype html>
<html>
<head>
<title>View Faculty
</title>
<link rel=stylesheet href="stylesheet.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
	<div>
	<h1  > <img src="thapar.jpg" style="float:left;margin-top:3px; margin-left:30px; width:100px;height:120px;border: 3px solid #000; box-shadow: 0 0 40px #fff;">Online Attendance Management System</h1>
</div>
<nav>
			<a href="admin.jsp">home</a>
<!--			<a href="classdetails.jsp">class</a>-->
			<a href="modifyfaculty.jsp">faculty</a>
			<a href="modifystudent.jsp">student</a>
                        <a href="adminlogout.jsp">Logout</a>
</nav>   
<h2>view Faculty </h2>

<br/>
        <div style="margin-left:300px;">
    <fieldset style="box-shadow: 10px 10px 10px #bbb;  border-radius: 10px; width: 30%; height: 120pt;" >
        <legend style="background-color:  #F40000;">Search Student</legend>
        
        
        <form action="search1">
 Student Name:<input type="text" name="name" placeholder="Enter Student Name Please"> <br>
 <input type="submit" value="Search" style= "float: right; background-color:#f40000 ; width: 100px;border:1px solid white; border-bottom:3px solid white;  color:white;">
 </form>
 <h3>Or</h3>
 
 <form action="searchbyemail">
 Student Email:<input type="text" name="email" placeholder="Enter Student Email Please"> <br>
 <input type="submit" value="Search" style= "float: right; background-color:#f40000 ; width: 100px;border:1px solid white; border-bottom:3px solid white;  color:white;">
 </form>
 
</fieldset >
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