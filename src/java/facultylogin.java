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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ubuntu
 */
public class facultylogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       String uname=request.getParameter("floginusername");
       String pass=request.getParameter("floginpassword");
       int count=0;
       Connection con=null;
       PrintWriter out= response.getWriter();
       PreparedStatement st=null;
       PreparedStatement st2=null;
       String subjectname=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           st=con.prepareStatement("select count(*) from facultylogin where uname=? and password=?");
           st.setString(1,uname);
           st.setString(2,pass);
           ResultSet rs=st.executeQuery();
           HttpSession session = request.getSession();
           
           PrintWriter pw=response.getWriter();
           
           while(rs.next())
           {
               count=rs.getInt(1);
           }
           if(count>=1)
           {
               session.setAttribute("username", uname);
               st2=con.prepareStatement("select subjectname from facultylogin where uname=?");
               st2.setString(1,uname);
               ResultSet rs2=st2.executeQuery();
               while(rs2.next())
               {
                   subjectname=rs2.getString(1);
               }
               session.setAttribute("subjectname", subjectname);
               response.sendRedirect("welcomefaculty.jsp");
               out.println("<script type=\"text/javascript\">");
                out.println("alert('Login Successfull');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
               
           }
           else
           {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User or password incorrect');");
                out.println("location='index.html';");
                out.println("</script>");
           }
           
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
