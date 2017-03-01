<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!Doctype html>
<html>
<head>
<title>View Student
</title>
<link rel=stylesheet href="stylesheet.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
	<div>
	<h1  > <img src="thapar.jpg" style="float:left;margin-top:3px; margin-left:30px; width:100px;height:120px;border: 3px solid #000; box-shadow: 0 0 40px #fff;">Online Attendance Management System</h1>
</div>
<nav>
			<a href="student.jsp">home</a>
			<a href="classdetails.jsp">class</a>
			<a href="modifyfaculty.jsp">Modify</a>
			<a href="modifystudent.jsp">Modify</a>
                      
</nav>   
<h2>All Notices </h2>

<br/>
        
<div>

<table  width="0%" align="center" >
<tr><th> Id</th><th>Roll NO</th><th>Student ID</th><th> Name</th><th>Status</th><th>Subject</th><th>Attendence Day</th></tr>  
 <c:forEach var="atd" items="${listAttendence}">
 <tr>
 <td>${atd.id }</td>
 <td>${atd.rollno}</td>
  <td>${atd.studentid}</td>
  <td>${atd.name}</td>
  <td>${atd.status }</td>
 <td>${atd.subject}</td>
  <td>${atd.attendencedate}</td>
 </tr>
 </c:forEach>
 </table>
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