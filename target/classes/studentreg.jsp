<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration </title>
</head>
<body  bgcolor="#ccc">

 <div>
         
       <form:form method="post" action="savestd" >    
        <table align="center" > 
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
       <h5 align="center"><a href="index.jsp">Home</a></h5> 
       </div>      
</body>
</html>      		