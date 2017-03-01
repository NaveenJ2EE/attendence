
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!Doctype html>
<html>
<head>
<title>Add new student
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
			<a href="classdetails.jsp">class</a>
			<a href="modifyfaculty.jsp">Modify</a>
			<a href="modifystudent.jsp">View/Delete Student</a>
                     
</nav>   
<h2></h2>
<br/>
        <div style="margin-left:300px;">
    <fieldset style="box-shadow: 10px 10px 10px #bbb;  border-radius: 10px; width: 30%; height: 420pt;" >
        <legend style="background-color:  #F40000; "> Student Registration </legend>
   <div> 
       <form:form method="post" action="savestd" >    
        <table align="center"> 
         <tr>    
          <td> Student ID : </td>   
          <td><form:input path="studentid"  /></td>  
         </tr>    
           
         <tr>    
          <td> Student Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td> Email :</td>    
          <td><form:input path="email" /></td>  
         </tr>   
         <tr>    
          <td>City :</td>    
          <td><form:input path="city" /></td>  
         </tr>  
         
          <tr>    
          <td>State :</td>    
          <td><form:input path="state" /></td>  
         </tr>   
         
          <tr>    
          <td>Course Name :</td>    
          <td><form:input path="cname" /></td>  
         </tr> 
        
         <tr>    
          <td>Study Plan :</td>    
          <td><form:input path="splan" /></td>  
         </tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>
       </form:form>    
       </div>      
  </fieldset >
  </div>




<div class="clear">
</div>
<br/>
<br/>
<br/>
<center>
<footer >
&copy Naveen Chandra
</footer>
</center>

</body>
</html>