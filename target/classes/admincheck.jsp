
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <div>
	<h1  > <img src="thapar.jpg" style="float:left;margin-top:3px; margin-left:30px; width:100px;height:120px;border: 3px solid #000; box-shadow: 0 0 40px #fff;">Online Attendance Management System</h1>
</div>
        <%
           String u="";
           String p="";
//           String s=request.getParameter("select");
    String userId = request.getParameter("id");    
    String pwd = request.getParameter("password");
    out.println("MyDerby Connect Example.<br/>");
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/mvc";
    //String dbName = "OAMS";
    String driver = "com.mysql.jdbc.Driver";
    String userName = "root"; 
    String password = " ";
//  if(s=="Faculty")
    try {
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url,userName,password);
        System.out.println("Connected to the database");
        Statement st = conn.createStatement();
        ResultSet rs;
        rs = st.executeQuery("select * from admin where id='" + userId + "' and password='" + pwd + "'");
        while(rs.next())
        {
            u=rs.getString(1);
            p=rs.getString(2);
            
        }
        if(p.equals(pwd) && u.equals(userId)){
            out.println("HHH");
            session.setAttribute("userid", userId);
            response.sendRedirect("admin.jsp");
        }
        else{
            
        response.sendRedirect("adminerror.jsp");        
        conn.close();
        }
    }
        catch (Exception e) {
        e.getMessage();
        }      
     %>
    </body>
</html>
