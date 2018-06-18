<%-- 
    Document   : newjsp
    Created on : 3 May, 2015, 12:54:16 PM
    Author     : AmanDhiman
--%>


<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance... </title>
    </head>
    <body>
        	

<h2>Make Attendance Here...</h2>

<%
    
    String usn="";
    String list[]= new String[100];
    int Total=0;
    int count=0;
    Connection con = null;
    String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
          Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
    Statement st = con.createStatement();
    
    ResultSet rs=null;
%>    
<center>

    <form action="updateattendance" method="post" >
        
<table >
  
    <tr>
        <th> USN</th>
        
        <th> Present/Absent </th>
        
        <th> Total Attendance </th>
        
    </tr>
<%
    rs = st.executeQuery("select * from attendancetb");
    while(rs.next())
    { 
    usn=rs.getString(1);
    Total=rs.getInt(3);
    
%>    
    <tr>
        <td>
           
        </td>
        <td>
            <%=usn%>
        </td>
        <td>
            <input type="checkbox" name="roll[]" value=<%=usn%> checked style="width: 15pt;" >Present
        </td>
        
        <td>
            <%=Total%>
        </td>
    
        
    </tr>
    
<tr>
    <%
    count++;
    }
    %>
    <td></td>
    <td></td>
    <td></td>
    
</tr>
</table>

<center>
<input type="reset" value="Reset" style="border-top-style: groove; border-radius: 0pt; padding: 5px; margin-right: 60px;  border: 2pt solid #000; color: #000; background-color: #CCC;" >
<input type="submit" value="Submit" style="border-top-style: groove; border-radius: 0pt;  padding: 5px; margin-left: 60px;border: 2pt solid #000; color: #000; background-color: #CCC;">
</center>
</form>
</center>


</body>
</html>
