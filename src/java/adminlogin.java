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
public class adminlogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       String uname=request.getParameter("loginusername");
       String pass=request.getParameter("loginpassword");
       int count=0;
       PrintWriter out= response.getWriter();
       PreparedStatement st=null;
       Connection con=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           st=con.prepareStatement("select count(*) from adminlogin where uname=? and pass=?");
           st.setString(1,uname);
           st.setString(2,pass);
           ResultSet rs=st.executeQuery();
            HttpSession session = request.getSession();
            while(rs.next())
           {
               count=rs.getInt(1);
           }
           if(count>=1)
           {
               session.setAttribute("username", uname);
               request.getRequestDispatcher("adminpanel.jsp").forward(request, response);
               response.sendRedirect("adminpanel.jsp");
               out.println("<script type=\"text/javascript\">");
                out.println("alert('Login Successfull');");
                out.println("location='adminpanel.jsp';");
                out.println("</script>");
               
           }
           else
           {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User or password incorrect');");
                out.println("location='admin.jsp';");
                out.println("</script>");
           }
       }
       catch(Exception e)
       {
           
       }

    
    }  
}
