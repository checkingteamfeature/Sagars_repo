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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prashanth Meesara
 */
public class entermarks extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
        PrintWriter out= response.getWriter();
       String test=request.getParameter("test");
       String usn=request.getParameter("usn");
       String course=request.getParameter("course");
       String subject=request.getParameter("subject");
       String subjectmarks=request.getParameter("subjectmarks");
       String subjectattendance=request.getParameter("subjectattendance");
       // String feestatus=request.getParameter("feestatus");
       PreparedStatement entermarksdetails=null;
       PreparedStatement enterfeesstatus=null;
       Connection con=null;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           //enterfeesstatus=con.prepareStatement("insert into feestatus(usn,status) values (?,?)");
           //enterfeesstatus.setString(1, usn);
          // enterfeesstatus.setString(2, feestatus);
          
          if(subject.equalsIgnoreCase("Web Programming"))
          {
              entermarksdetails=con.prepareStatement("update student set course=?,subject1=?, subject1marks=? where usn=? and test=?");
              entermarksdetails.setString(1, course);
           entermarksdetails.setString(2, subject);
           entermarksdetails.setString(3, subjectmarks);
           
           entermarksdetails.setString(4, usn);
           entermarksdetails.setString(5, test);
           entermarksdetails.execute();
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
           if(subject.equalsIgnoreCase("Advanced Java Programming"))
          {
              entermarksdetails=con.prepareStatement("update student set course=?,subject2=?, subject2marks=? where usn=? and test=?");
              entermarksdetails.setString(1, course);
           entermarksdetails.setString(2, subject);
           entermarksdetails.setString(3, subjectmarks);
           entermarksdetails.setString(4, usn);
           entermarksdetails.setString(5, test);
           entermarksdetails.execute();
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
               
                out.println("</script>");
          }
           if(subject.equalsIgnoreCase("Cloud Computing"))
          {
              entermarksdetails=con.prepareStatement("update student set course=?,subject3=?, subject3marks=? where usn=? and test=?");
              entermarksdetails.setString(1, course);
           entermarksdetails.setString(2, subject);
           entermarksdetails.setString(3, subjectmarks);
           entermarksdetails.setString(4, usn);
           entermarksdetails.setString(5, test);
           entermarksdetails.execute();
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
           if(subject.equalsIgnoreCase("Distributed Operating System"))
          {
              entermarksdetails=con.prepareStatement("update student set course=?,subject4=?, subject4marks=? where usn=? and test=?");
              entermarksdetails.setString(1, course);
           entermarksdetails.setString(2, subject);
           entermarksdetails.setString(3, subjectmarks);
           entermarksdetails.setString(4, usn);
           entermarksdetails.setString(5, test);
           entermarksdetails.execute();
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
           if(subject.equalsIgnoreCase("Cryptography"))
          {
              entermarksdetails=con.prepareStatement("update student set course=?,subject5=?, subject5marks=? where usn=? and test=?");
              entermarksdetails.setString(1, course);
           entermarksdetails.setString(2, subject);
           entermarksdetails.setString(3, subjectmarks);
           entermarksdetails.setString(4, usn);
           entermarksdetails.setString(5, test);
           entermarksdetails.execute();
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
           if(subject.equalsIgnoreCase("Soft Skills"))
          {
              entermarksdetails=con.prepareStatement("update student set course=?,subject6=?, subject6marks=? where usn=? and test=?");
              entermarksdetails.setString(1, course);
           entermarksdetails.setString(2, subject);
           entermarksdetails.setString(3, subjectmarks);
          entermarksdetails.setString(4, usn);
           entermarksdetails.setString(5, test);
           entermarksdetails.execute();
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("</script>");
           
       }
       catch(Exception e)
       {
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Incorrect Data Entered, Try Again');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
       }
       out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("</script>");
    }

   
}
