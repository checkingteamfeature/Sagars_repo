/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Prashanth Meesara
 */
public class removestudent extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       String usn=request.getParameter("usn");
       int count=0;
       Connection con=null;
       PrintWriter out= response.getWriter();
       PreparedStatement st=null;
       PreparedStatement register=null;
       PreparedStatement grade=null;
       PreparedStatement fee=null;
       PreparedStatement student=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           st=con.prepareStatement("select count(*) from register where usn=?");
           st.setString(1,usn);
            ResultSet rs=st.executeQuery();
            HttpSession session = request.getSession();
            while(rs.next())
           {
               count=rs.getInt(1);
           }
           if(count>=1)
           {
               register=con.prepareStatement("delete from register where usn=?");
               register.setString(1,usn);
               register.execute();
              grade=con.prepareStatement("delete from grade where usn=?");
               grade.setString(1,usn);
               grade.execute();
               fee=con.prepareStatement("delete from feestatus where usn=?");
               fee.setString(1,usn);
               fee.execute();
               student=con.prepareStatement("delete from student where usn=?");
               student.setString(1,usn);
               student.execute();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Removed');");
                out.println("location='adminpanel.jsp';");
                out.println("</script>");
               
           }
           
           else
           {
               out.println("<script type=\"text/javascript\">");
                out.println("alert('USN does not exist');");
                out.println("location='adminpanel.jsp';");
                out.println("</script>");
           }
       }
       catch(Exception e)
       {
           
       }
    }

    

}
