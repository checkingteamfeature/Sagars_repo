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
public class removefaculty extends HttpServlet {

  

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       String uname=request.getParameter("username");
       int count=0;
       Connection con=null;
       PrintWriter out= response.getWriter();
       PreparedStatement st=null;
       PreparedStatement register=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           st=con.prepareStatement("select count(*) from facultylogin where uname=?");
           st.setString(1,uname);
            ResultSet rs=st.executeQuery();
            HttpSession session = request.getSession();
            while(rs.next())
           {
               count=rs.getInt(1);
           }
           if(count>=1)
           {
               register=con.prepareStatement("delete from facultylogin where uname=?;");
              
               register.setString(1,uname);
              
               register.execute();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Removed');");
                out.println("location='adminpanel.jsp';");
                out.println("</script>");
               
           }
           
           else
           {
               out.println("<script type=\"text/javascript\">");
                out.println("alert('Username does not exist');");
                out.println("location='adminpanel.jsp';");
                out.println("</script>");
           }
       }
       catch(Exception e)
       {
           
       }
    }

   
}
