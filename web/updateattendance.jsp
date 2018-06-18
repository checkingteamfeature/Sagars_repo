<%-- 
    Document   : updateattendance
    Created on : 2 May, 2015, 7:16:48 PM
    Author     : AmanDhiman
--%>

<!DOCTYPE html>
<%@page import="java.sql.*,java.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update Attendance</title>
    </head>
    <body>
        <%! 
            int checkboxvalue[]= new int[100];
        String toupdate[]= new String[100];
        String selected[]=new String[100];     
        int present,total;
        String usn;
        
        %>
    <%
        selected = request.getParameterValues("roll[]");

        for(int i=0;i<selected.length;i++){
    out.println("<br/> Roll No. is ==> "+selected[i]);
    toupdate[i]=selected[i];
        
        }
    try{
    
    Connection con = null;
    String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
          Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
      
   
    out.println("\nConnected to the database");
    Statement st = con.createStatement();
    PreparedStatement pst=null;
    ResultSet rs=null;
    for(int i=0;i<toupdate.length;i++)
    {
        usn=toupdate[i];
        pst=con.prepareStatement("select * from attendancetb where usn=?");
        pst.setString(1,usn);
        rs=pst.executeQuery();
    while(rs.next())
    { 
    out.println("\n"+rs.getString(1)+"\t");
    out.println(rs.getInt(2)+"\t");
    out.println(rs.getInt(3)+"\t");
    
        usn=rs.getString(1);
        present=rs.getInt(2);
        total=rs.getInt(3);
        present=present+1;
        total=total+1;
        usn=toupdate[i];
        st = con.createStatement();
     
        st.execute("update attendancetb set attended = " + present + ", total = " + total + " where usn = " + usn);
    }
    }
    
        
    
//    st = connection.createStatement();
//    st.executeQuery("select * from attendance");    
   
    
    
    con.close();
    }
    catch(SQLException e)
    {
        out.println("error: " + e.getMessage());
        e.getStackTrace();
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
                e.getMessage();
    }
    catch(NullPointerException e)
    {
        e.getMessage();
    }
    //response.sendRedirect("faculty.jsp");
    %>         
        
    </body>
</html>
