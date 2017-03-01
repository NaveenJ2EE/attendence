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
			<a href="admin.jsp">home</a>
			<a href="classdetails.jsp">class</a>
			<a href="modifyfaculty.jsp">Modify</a>
			<a href="modifystudent.jsp">Modify</a>
                      
</nav>   
<h2>All Students </h2>

<br/>
        
<div>

<table  width="0%" align="center" bgcolor="#ccc">
<tr><th>Student Id</th><th>Id</th><th>Name</th><th>Email</th><th>City</th><th>State</th><th>Course name</th><th>Course Plan</th><th>Edit</th><th>Delete</th></tr>  
 <c:forEach var="std" items="${listStudent}">
 <tr>
 <td>${std.studentid }</td>
 <td>${std.id }</td>
 <td>${std.name}</td>
  <td>${std.email}</td>
  <td>${std.city}</td>
 <td>${std.state}</td>
 <td>${std.cname}</td>
  <td>${std.splan}</td>
 <td><a href="editstd/${std.id}">Edit</a></td> 
 <td><a href="deletestd/${std.id}">Delete</a></td>  
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