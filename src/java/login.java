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
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       String uname=request.getParameter("loginusername");
       String pass=request.getParameter("loginpassword");
       //String test=request.getParameter("testselected");
       String subject[];
        subject = new String[7];
        String subjectsmarks[];
        subjectsmarks = new String[7];
        String subjectsattendance[];
        subjectsattendance = new String[7];
       String usn="";
       String gradeavailable="";
       String counter="1";
       int count=0;
       Connection con=null;
       PrintWriter out= response.getWriter();
       PreparedStatement st=null;
       PreparedStatement subjectslist;
       PreparedStatement pssubjectsattendance;
       PreparedStatement pssubjectsmarks;
       PreparedStatement getusn;
       PreparedStatement checktest;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
           st=con.prepareStatement("select count(*) from login where uname=? and pass=?");
           subjectslist=con.prepareStatement("select subjectname from subjects;");
          getusn=con.prepareStatement("select usn from register where uname=?;");
           getusn.setString(1,uname);
           ResultSet usnrs=getusn.executeQuery();
           checktest=con.prepareStatement("select count(*) from student where usn=? and test='test5';");
           checktest.setString(1, usn);
           ResultSet checktestrs=checktest.executeQuery();
           while(checktestrs.next())
           {
               gradeavailable=checktestrs.getString(1);
           }
           while(usnrs.next())
           {
               usn=usnrs.getString(1);
           }
           
           //pssubjectsattendance=con.prepareStatement("select subject1attendance,subject2attendance,subject3attendance,subject4attendance,subject5attendance,subject6attendance from student ;");
           //pssubjectsattendance.setString(1,usn);
           //pssubjectsmarks=con.prepareStatement("select subject1marks,subject2marks,subject3marks,subject4marks,subject5marks,subject6marks from student;");
           //pssubjectsmarks.setString(1,usn);
           st.setString(1,uname);
           st.setString(2,pass);
           ResultSet rs=st.executeQuery();
           ResultSet subjectslistrs=subjectslist.executeQuery();
          // ResultSet subjectmarks=pssubjectsmarks.executeQuery();
           //ResultSet subjectsattendancers=pssubjectsattendance.executeQuery();
           HttpSession session = request.getSession();
         PreparedStatement sub1=con.prepareStatement("select subject1marks from student where usn=? and test='test1';");
         sub1.setString(1,usn);
       //sub1.setString(2,"test1");
          ResultSet sub1rs=sub1.executeQuery();
          PreparedStatement sub2=con.prepareStatement("select subject2marks from student where usn=? and test='test1';");
         sub2.setString(1,usn);
        // sub2.setString(2,"test1");
          ResultSet sub2rs=sub2.executeQuery();
          PreparedStatement sub3=con.prepareStatement("select subject3marks from student where usn=? and test='test1';");
         sub3.setString(1,usn);
         //sub3.setString(2,"test1");
          ResultSet sub3rs=sub3.executeQuery();
          PreparedStatement sub4=con.prepareStatement("select subject4marks from student where usn=? and test='test1';");
         sub4.setString(1,usn);
         //sub4.setString(2,"test1");
          ResultSet sub4rs=sub4.executeQuery();
          PreparedStatement sub5=con.prepareStatement("select subject5marks from student where usn=? and test='test1';");
         sub5.setString(1,usn);
        //sub5.setString(2,"test1");
          ResultSet sub5rs=sub5.executeQuery();
          PreparedStatement sub6=con.prepareStatement("select subject6marks from student where usn=? and test='test1';");
         sub6.setString(1,usn);
         //sub5.setString(2,"test1");
          ResultSet sub6rs=sub6.executeQuery();
           PrintWriter pw=response.getWriter();
           int i=1;
           while(subjectslistrs.next())
           {
               
               subject[i]=subjectslistrs.getString(1);
               i++;
           }
           String subject1marks = null;//=subjectsmarks[1];
        String subject2marks = null;//=subjectsmarks[2];
        String subject3marks = null;//=subjectsmarks[3];
        String subject4marks = null;//=subjectsmarks[4];
        String subject5marks = null;//=subjectsmarks[5];
        String subject6marks = null;//=subjectsmarks[6];
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
          // subject1marks=subjectmarks.getString(1);
           /*while(subjectmarks.next())
           {
               
               subjectsmarks[i]=subjectmarks.getString(1);
               i++;
           }*/
          /* while(subjectsattendancers.next())
           {
              
               subjectsattendance[i]=subjectsattendancers.getString(i);
               i++;
           }*/
           String subject1=subject[1];
         String subject2=subject[2];
        String subject3=subject[3];
        String subject4=subject[4];
        String subject5=subject[5];
        String subject6=subject[6];
       /* String subject1attendance=subjectsattendance[1];
        String subject2attendance=subjectsattendance[2];
        String subject3attendance=subjectsattendance[3];
        String subject4attendance=subjectsattendance[4];
        String subject5attendance=subjectsattendance[5];
        String subject6attendance=subjectsattendance[6];*/
        
        /*String subject1grade="";
        String subject2grade="";
        String subject3grade="";
        String subject4grade="";
        String subject5grade="";
        String subject6grade="";
        String subject7grade="";*/
        PreparedStatement att1=con.prepareStatement("select subject1attendance from student where usn=? and test='test1';");
         att1.setString(1,usn);
        // sub1.setString(2,test);
          ResultSet att1rs=att1.executeQuery();
          PreparedStatement att2=con.prepareStatement("select subject2attendance from student where usn=? and test='test1';");
        att2.setString(1,usn);
         //sub2.setString(2,test);
          ResultSet att2rs=att2.executeQuery();
          PreparedStatement att3=con.prepareStatement("select subject3attendance from student where usn=? and test='test1';");
         att3.setString(1,usn);
         //sub3.setString(2,test);
          ResultSet att3rs=att3.executeQuery();
          PreparedStatement att4=con.prepareStatement("select subject4attendance from student where usn=? and test='test1';");
         att4.setString(1,usn);
        // sub4.setString(2,test);
          ResultSet att4rs=att4.executeQuery();
          PreparedStatement att5=con.prepareStatement("select subject5attendance from student where usn=? and test='test1';");
         att5.setString(1,usn);
         //sub5.setString(2,test);
          ResultSet att5rs=att5.executeQuery();
          PreparedStatement att6=con.prepareStatement("select subject6attendance from student where usn=? and test='test1';");
        att6.setString(1,usn);
        // sub5.setString(2,test);
          ResultSet att6rs=att6.executeQuery();
          String subject1attendance = null;//=subjectsmarks[1];
        String subject2attendance = null;//=subjectsmarks[2];
        String subject3attendance = null;//=subjectsmarks[3];
        String subject4attendance = null;//=subjectsmarks[4];
        String subject5attendance = null;//=subjectsmarks[5];
        String subject6attendance = null;//=subjectsmarks[6];
        String subject1grade = null;//=subjectsmarks[1];
        String subject2grade = null;//=subjectsmarks[2];
        String subject3grade = null;//=subjectsmarks[3];
        String subject4grade = null;//=subjectsmarks[4];
        String subject5grade = null;//=subjectsmarks[5];
        String subject6grade = null;//=subjectsmarks[6];
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
    
               PreparedStatement grd1=con.prepareStatement("select avg(subject1marks) from student where usn=?;");
         grd1.setString(1,usn);
        // sub1.setString(2,test);
          ResultSet grd1rs=grd1.executeQuery();
          PreparedStatement grd2=con.prepareStatement("select avg(subject2marks) from student where usn=?;");
        grd2.setString(1,usn);
         //sub2.setString(2,test);
          ResultSet grd2rs=grd2.executeQuery();
          PreparedStatement grd3=con.prepareStatement("select avg(subject3marks) from student where usn=?;");
         grd3.setString(1,usn);
         //sub3.setString(2,test);
          ResultSet grd3rs=grd3.executeQuery();
          PreparedStatement grd4=con.prepareStatement("select avg(subject4marks) from student where usn=?;");
         grd4.setString(1,usn);
        // sub4.setString(2,test);
          ResultSet grd4rs=grd4.executeQuery();
          PreparedStatement grd5=con.prepareStatement("select avg(subject5marks) from student where usn=?;");
         grd5.setString(1,usn);
         //sub5.setString(2,test);
          ResultSet grd5rs=grd5.executeQuery();
          PreparedStatement grd6=con.prepareStatement("select avg(subject6marks) from student where usn=?;");
        grd6.setString(1,usn);
        // sub5.setString(2,test);
          ResultSet grd6rs=grd6.executeQuery();
          
             while(grd1rs.next())
           {
               subject1grade=grd1rs.getString(1);
           }
           while(grd2rs.next())
           {
               subject2grade=grd2rs.getString(1);
           }
           while(grd3rs.next())
           {
               subject3grade=grd3rs.getString(1);
           }
           while(grd4rs.next())
           {
               subject4grade=grd4rs.getString(1);
           }
           while(grd5rs.next())
           {
               subject5grade=grd5rs.getString(1);
           }
           while(grd6rs.next())
           {
               subject6grade=grd6rs.getString(1);
           }
           if(Double.parseDouble(subject1grade)>=89)
           {
               subject1grade="A";
           }
           else if(Double.parseDouble(subject1grade)>=74)
           {
               subject1grade="B";
           }
           else if(Double.parseDouble(subject1grade)>=59)
           {
               subject1grade="C";
           }
           else if(Double.parseDouble(subject1grade)>=44)
           {
               subject1grade="D";
           }
           else if(Double.parseDouble(subject1grade)>=34)
           {
               subject1grade="E";
           }
           else
           {
               subject1grade="F";
           }
           if(Double.parseDouble(subject2grade)>=89)
           {
               subject2grade="A";
           }
           else if(Double.parseDouble(subject2grade)>=74)
           {
               subject2grade="B";
           }
           else if(Double.parseDouble(subject2grade)>=59)
           {
               subject2grade="C";
           }
           else if(Double.parseDouble(subject2grade)>=44)
           {
               subject2grade="D";
           }
           else if(Double.parseDouble(subject2grade)>=34)
           {
               subject2grade="E";
           }
           else
           {
               subject2grade="F";
           }
           if(Double.parseDouble(subject3grade)>=89)
           {
               subject3grade="A";
           }
           else if(Double.parseDouble(subject3grade)>=74)
           {
               subject3grade="B";
           }
           else if(Double.parseDouble(subject3grade)>=59)
           {
               subject3grade="C";
           }
           else if(Double.parseDouble(subject3grade)>=44)
           {
               subject3grade="D";
           }
           else if(Double.parseDouble(subject3grade)>=34)
           {
               subject3grade="E";
           }
           else
           {
               subject3grade="F";
           }
           if(Double.parseDouble(subject4grade)>=89)
           {
               subject4grade="A";
           }
           else if(Double.parseDouble(subject4grade)>=74)
           {
               subject4grade="B";
           }
           else if(Double.parseDouble(subject4grade)>=59)
           {
               subject4grade="C";
           }
           else if(Double.parseDouble(subject4grade)>=44)
           {
               subject4grade="D";
           }
           else if(Double.parseDouble(subject4grade)>=34)
           {
               subject4grade="E";
           }
           else
           {
               subject4grade="F";
           }
           if(Double.parseDouble(subject5grade)>=89)
           {
               subject5grade="A";
           }
           else if(Double.parseDouble(subject5grade)>=74)
           {
               subject5grade="B";
           }
           else if(Double.parseDouble(subject5grade)>=59)
           {
               subject5grade="C";
           }
           else if(Double.parseDouble(subject5grade)>=44)
           {
               subject5grade="D";
           }
           else if(Double.parseDouble(subject5grade)>=34)
           {
               subject5grade="E";
           }
           else
           {
               subject5grade="F";
           }
           if(Double.parseDouble(subject6grade)>=89)
           {
               subject6grade="A";
           }
           else if(Double.parseDouble(subject6grade)>=74)
           {
               subject6grade="B";
           }
           else if(Double.parseDouble(subject6grade)>=59)
           {
               subject6grade="C";
           }
           else if(Double.parseDouble(subject6grade)>=44)
           {
               subject6grade="D";
           }
           else if(Double.parseDouble(subject6grade)>=34)
           {
               subject6grade="E";
           }
           else
           {
               subject6grade="F";
           }
           request.setAttribute("subject1grade", subject1grade);
          request.setAttribute("subject2grade", subject2grade);
          request.setAttribute("subject3grade", subject3grade);
          request.setAttribute("subject4grade", subject4grade);
          request.setAttribute("subject5grade", subject5grade);
          request.setAttribute("subject6grade", subject6grade);
          //request.getRequestDispatcher("welcome.jsp").forward(request, response);
          
           while(rs.next())
           {
               count=rs.getInt(1);
           }
           if(count>=1)
           {
               session.setAttribute("username", uname);
               request.setAttribute("usn", usn);
               request.setAttribute("gradeavailable", gradeavailable);
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
          request.setAttribute("subject1grade", subject1grade);
          request.setAttribute("subject2grade", subject2grade);
          request.setAttribute("subject3grade", subject3grade);
          request.setAttribute("subject4grade", subject4grade);
          request.setAttribute("subject5grade", subject5grade);
          request.setAttribute("subject6grade", subject6grade);
          request.getRequestDispatcher("welcome.jsp").forward(request, response);
          request.getRequestDispatcher("testresults.java").forward(request, response);
               response.sendRedirect("welcome.jsp");
               out.println("<script type=\"text/javascript\">");
                out.println("alert('Login Successfull');");
                out.println("location='welcome.jsp';");
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
