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
import java.util.HashSet;
import java.util.Set;
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
public class testresults extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       
       String test=request.getParameter("testselected");
       HttpSession session = request.getSession();
       String uname=(String) session.getAttribute("username");
       String subject[];
        subject = new String[7];
        String subjectsmarks[];
        subjectsmarks = new String[7];
        String subjectsattendance[];
        subjectsattendance = new String[7];
       String usn="";
        int gradestatus=0;
       int count=0;
       Connection con=null;
       PrintWriter out= response.getWriter();
       PreparedStatement st=null;
       PreparedStatement subjectslist;
       PreparedStatement pssubjectsattendance;
       PreparedStatement pssubjectsmarks;
       PreparedStatement getusn;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           subjectslist=con.prepareStatement("select subjectname from subjects;");
          getusn=con.prepareStatement("select usn from register where uname=?;");
           getusn.setString(1,uname);
           ResultSet usnrs=getusn.executeQuery();
           while(usnrs.next())
           {
               usn=usnrs.getString(1);
           }
        ResultSet subjectslistrs=subjectslist.executeQuery();  
           
         PreparedStatement sub1=con.prepareStatement("select subject1marks from student where usn=? and test=?;");
         sub1.setString(1,usn);
       sub1.setString(2,test);
          ResultSet sub1rs=sub1.executeQuery();
          PreparedStatement sub2=con.prepareStatement("select subject2marks from student where usn=? and test=?;");
         sub2.setString(1,usn);
        sub2.setString(2,test);
          ResultSet sub2rs=sub2.executeQuery();
          PreparedStatement sub3=con.prepareStatement("select subject3marks from student where usn=? and test=?;");
         sub3.setString(1,usn);
        sub3.setString(2,test);
          ResultSet sub3rs=sub3.executeQuery();
          PreparedStatement sub4=con.prepareStatement("select subject4marks from student where usn=? and test=?;");
         sub4.setString(1,usn);
         sub4.setString(2,test);
          ResultSet sub4rs=sub4.executeQuery();
          PreparedStatement sub5=con.prepareStatement("select subject5marks from student where usn=? and test=?;");
         sub5.setString(1,usn);
        sub5.setString(2,test);
          ResultSet sub5rs=sub5.executeQuery();
          PreparedStatement sub6=con.prepareStatement("select subject6marks from student where usn=? and test=?;");
         sub6.setString(1,usn);
         sub6.setString(2, test);
          ResultSet sub6rs=sub6.executeQuery();
           PrintWriter pw=response.getWriter();
           int i=1;
           while(subjectslistrs.next())
           {
               
               subject[i]=subjectslistrs.getString(1);
               i++;
           }
           String subject1marks = null;
        String subject2marks = null;
        String subject3marks = null;
        String subject4marks = null;
        String subject5marks = null;
        String subject6marks = null;
           while(sub1rs.next())
           {
               subject1marks=sub1rs.getString(1);
           }
           while(sub2rs.next())
           {
               subject2marks=sub2rs.getString(1);
           }
           while(sub3rs.next())
           {
               subject3marks=sub3rs.getString(1);
           }
           while(sub4rs.next())
           {
               subject4marks=sub4rs.getString(1);
           }
           while(sub5rs.next())
           {
               subject5marks=sub5rs.getString(1);
           }
           while(sub6rs.next())
           {
               subject6marks=sub6rs.getString(1);
           }
          
           String subject1=subject[1];
         String subject2=subject[2];
        String subject3=subject[3];
        String subject4=subject[4];
        String subject5=subject[5];
        String subject6=subject[6];
       
        PreparedStatement att1=con.prepareStatement("select subject1attendance from student where usn=? and test=?;");
         att1.setString(1,usn);
        att1.setString(2,test);
          ResultSet att1rs=att1.executeQuery();
          PreparedStatement att2=con.prepareStatement("select subject2attendance from student where usn=? and test=?;");
        att2.setString(1,usn);
         att2.setString(2,test);
          ResultSet att2rs=att2.executeQuery();
          PreparedStatement att3=con.prepareStatement("select subject3attendance from student where usn=? and test=?;");
         att3.setString(1,usn);
         att3.setString(2,test);
          ResultSet att3rs=att3.executeQuery();
          PreparedStatement att4=con.prepareStatement("select subject4attendance from student where usn=? and test=?;");
         att4.setString(1,usn);
        att4.setString(2,test);
          ResultSet att4rs=sub4.executeQuery();
          PreparedStatement att5=con.prepareStatement("select subject5attendance from student where usn=? and test=?;");
         att5.setString(1,usn);
         att5.setString(2,test);
          ResultSet att5rs=att5.executeQuery();
          PreparedStatement att6=con.prepareStatement("select subject6attendance from student where usn=? and test=?;");
        att6.setString(1,usn);
        att6.setString(2,test);
          ResultSet att6rs=att6.executeQuery();
          String subject1attendance = null;//=subjectsmarks[1];
        String subject2attendance = null;//=subjectsmarks[2];
        String subject3attendance = null;//=subjectsmarks[3];
        String subject4attendance = null;//=subjectsmarks[4];
        String subject5attendance = null;//=subjectsmarks[5];
        String subject6attendance = null;//=subjectsmarks[6];
             while(att1rs.next())
           {
               subject1attendance=att1rs.getString(1);
           }
           while(att2rs.next())
           {
               subject2attendance=att2rs.getString(1);
           }
           while(att3rs.next())
           {
               subject3attendance=att3rs.getString(1);
           }
           while(att4rs.next())
           {
               subject4attendance=att4rs.getString(1);
           }
           while(att5rs.next())
           {
               subject5attendance=att5rs.getString(1);
           }
           while(att6rs.next())
           {
               subject6attendance=att6rs.getString(1);
           }
               session.setAttribute("username", uname);
               request.setAttribute("usn", usn);
               request.setAttribute("subject1", subject1);
               request.setAttribute("subject2", subject2);
               request.setAttribute("subject3", subject3);
               request.setAttribute("subject4", subject4);
               request.setAttribute("subject5", subject5);
               request.setAttribute("subject6", subject6);
          request.setAttribute("subject1marks", subject1marks);
          request.setAttribute("subject2marks", subject2marks);
          request.setAttribute("subject3marks", subject3marks);
          request.setAttribute("subject4marks", subject4marks);
          request.setAttribute("subject5marks", subject5marks);
          request.setAttribute("subject6marks", subject6marks);
         request.setAttribute("subject1attendance", subject1attendance);
          request.setAttribute("subject2attendance", subject2attendance);
          request.setAttribute("subject3attendance", subject3attendance);
          request.setAttribute("subject4attendance", subject4attendance);
          request.setAttribute("subject5attendance", subject5attendance);
          request.setAttribute("subject6attendance", subject6attendance);
          request.getRequestDispatcher("welcome.jsp").forward(request, response);
          //request.getRequestDispatcher("testresults.java").forward(request, response); 
           
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
