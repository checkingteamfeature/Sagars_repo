/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ubuntu
 */
public class Register extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       String fname=request.getParameter("firstname");
       String lname=request.getParameter("lastname");
       String uname=request.getParameter("username");
       String pass=request.getParameter("password");
       String email=request.getParameter("email");
       String course=request.getParameter("course");
       String usn=request.getParameter("usn");
       int count=0;
       int countusn=0;
       Connection con=null;
       PrintWriter out= response.getWriter();
       /*out.print(fname);
       out.print(lname);
       out.print(uname);
       out.print(pass);
       out.print(email);
       out.print(course);
       out.print(usn);*/
       PreparedStatement st=null;
       PreparedStatement register=null;
       PreparedStatement checkusn=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           st=con.prepareStatement("select count(*) from register where uname=?");
           st.setString(1,uname);
          checkusn=con.prepareStatement("select count(*) from register where usn=?");
          checkusn.setString(1,usn);
           ResultSet rs=st.executeQuery();
           ResultSet rs2=checkusn.executeQuery();
           HttpSession session = request.getSession();
           PrintWriter pw=response.getWriter();
           while(rs2.next())
           {
               countusn=rs2.getInt(1);
           }
           while(rs.next())
           {
               count=rs.getInt(1);
           }
           if(count>=1)
           {
               out.println("<script type=\"text/javascript\">");
                out.println("alert('Username already taken, choose unique username');");
                out.println("location='index.html';");
                out.println("</script>");
               
           }
           else if(countusn>=1)
           {
               out.println("<script type=\"text/javascript\">");
                out.println("alert('Account with given USN already exists');");
                out.println("location='index.html';");
                out.println("</script>");
               
           }
           else
           {
               register=con.prepareStatement("insert into register(usn,fname,lname,uname,pass,email,course) values (?,?,?,?,?,?,?)");
               register.setString(1,usn);
               register.setString(2,fname);
              register.setString(3,lname);
               register.setString(4,uname);
               register.setString(5,pass);
               register.setString(6,email);
               register.setString(7,course);
               register.execute();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully registered');");
                out.println("location='index.html';");
                out.println("</script>");
           }
           
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
   
}
