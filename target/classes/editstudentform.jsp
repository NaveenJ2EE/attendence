<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ccc">

    
<form:form method="POST" action="/SpringWebModule/editsavestd">
<table align="center" bgcolor="orange">
<tr>
<td></td>
<td><form:hidden path="id"/></td>
</tr>

<tr>
<td>Student ID</td>
<td><form:input path="studentid"/></td>
</tr>

<tr>
<td>Name</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>Email</td>
<td><form:input path="email"/></td>
</tr>

<tr>
<td>City</td>
<td><form:input path="city"/></td>
</tr>

<tr>
<td>State</td>
<td><form:input path="state"/></td>
</tr>

<tr>
<td>Country</td>
<td><form:input path="cname"/></td>
</tr>


<tr>
<td>Study Plan</td>
<td><form:input path="splan"/></td>
</tr>


<tr>    
 <td> </td>   
 <td><input type="submit" value="Edit Save" /></td>    
</tr>    
</table>
</form:form>
</body>
</html>