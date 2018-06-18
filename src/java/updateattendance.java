/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prashanth Meesara
 */
public class updateattendance extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        Connection con = null;
    String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
       int checkboxvalue[]= new int[100];
        String toupdate[]= new String[100];
        String subject=request.getParameter("subject");
        String test=request.getParameter("test");
        String selected[]=new String[100];     
        int present,total;
        String usn;
        PrintWriter out =response.getWriter();
        try{
          Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
      
   
    //out.println("\nConnected to the database");
    Statement st = con.createStatement();
    PreparedStatement pst=null;
    PreparedStatement update=null;
    ResultSet rs=null;
    selected = request.getParameterValues("roll[]");

        for(int i=0;i<selected.length;i++){
   // out.println("<br/> Roll No. is ==> "+selected[i]);
    toupdate[i]=selected[i];
        
        }
    for(int i=0;i<toupdate.length;i++)
    {
        usn=toupdate[i];
        if(subject.equalsIgnoreCase("Web Programming"))
          {
              pst=con.prepareStatement("select usn,subject1attendance,subject1totalattendance from student where usn=?");
        pst.setString(1,usn);
        rs=pst.executeQuery();
        
    while(rs.next())
    { 
    //out.println("\n"+rs.getString(1)+"\t");
    //out.println(rs.getInt(2)+"\t");
    //out.println(rs.getInt(3)+"\t");
    
        usn=rs.getString(1);
        present=rs.getInt(2);
        total=rs.getInt(3);
        present=present+1;
        total=total+1;
        
        update=con.prepareStatement("update student set subject1attendance=?,subject1totalattendance=? where usn=? and test=?");
        update.setInt(1, present);
        update.setInt(2,total);
        update.setString(3, usn);
        update.setString(4,test);
        update.executeUpdate();   
    }
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
        if(subject.equalsIgnoreCase("Advanced Java Programming"))
          {
              pst=con.prepareStatement("select usn,subject2attendance,subject2totalattendance from student where usn=?");
        pst.setString(1,usn);
        rs=pst.executeQuery();
        
    while(rs.next())
    { 
    /*out.println("\n"+rs.getString(1)+"\t");
    out.println(rs.getInt(2)+"\t");
    out.println(rs.getInt(3)+"\t");*/
    
        usn=rs.getString(1);
        present=rs.getInt(2);
        total=rs.getInt(3);
        present=present+1;
        total=total+1;
        
        update=con.prepareStatement("update student set subject2attendance=?,subject2totalattendance=? where usn=? and test=?");
        update.setInt(1, present);
        update.setInt(2,total);
        update.setString(3, usn);
        update.setString(4,test);
        update.executeUpdate();   
    }
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
        if(subject.equalsIgnoreCase("Cloud Computing"))
          {
              pst=con.prepareStatement("select usn,subject3attendance,subject3totalattendance from student where usn=?");
        pst.setString(1,usn);
        rs=pst.executeQuery();
        
    while(rs.next())
    { 
    /*out.println("\n"+rs.getString(1)+"\t");
    out.println(rs.getInt(2)+"\t");
    out.println(rs.getInt(3)+"\t");*/
    
        usn=rs.getString(1);
        present=rs.getInt(2);
        total=rs.getInt(3);
        present=present+1;
        total=total+1;
        
        update=con.prepareStatement("update student set subject3attendance=?,subject3totalattendance=? where usn=? and test=?");
        update.setInt(1, present);
        update.setInt(2,total);
        update.setString(3, usn);
        update.setString(4,test);
        update.executeUpdate();   
    }
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
        if(subject.equalsIgnoreCase("Distributed Operating System"))
          {
              pst=con.prepareStatement("select usn,subject4attendance,subject4totalattendance from student where usn=?");
        pst.setString(1,usn);
        rs=pst.executeQuery();
        
    while(rs.next())
    { 
    /*out.println("\n"+rs.getString(1)+"\t");
    out.println(rs.getInt(2)+"\t");
    out.println(rs.getInt(3)+"\t");*/
    
        usn=rs.getString(1);
        present=rs.getInt(2);
        total=rs.getInt(3);
        present=present+1;
        total=total+1;
        
        update=con.prepareStatement("update student set subject4attendance=?,subject4totalattendance=? where usn=? and test=?");
        update.setInt(1, present);
        update.setInt(2,total);
        update.setString(3, usn);
        update.setString(4,test);
        update.executeUpdate();   
    }
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
        if(subject.equalsIgnoreCase("Cryptography"))
          {
              pst=con.prepareStatement("select usn,subject5attendance,subject5totalattendance from student where usn=?");
        pst.setString(1,usn);
        rs=pst.executeQuery();
        
    while(rs.next())
    { 
    /*out.println("\n"+rs.getString(1)+"\t");
    out.println(rs.getInt(2)+"\t");
    out.println(rs.getInt(3)+"\t");*/
    
        usn=rs.getString(1);
        present=rs.getInt(2);
        total=rs.getInt(3);
        present=present+1;
        total=total+1;
        
        update=con.prepareStatement("update student set subject5attendance=?,subject5totalattendance=? where usn=? and test=?");
        update.setInt(1, present);
        update.setInt(2,total);
        update.setString(3, usn);
        update.setString(4,test);
        update.executeUpdate();   
    }
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
          }
        if(subject.equalsIgnoreCase("Soft Skills"))
          {
              pst=con.prepareStatement("select usn,subject6attendance,subject6totalattendance from student where usn=?");
        pst.setString(1,usn);
        rs=pst.executeQuery();
        
    while(rs.next())
    { 
    /*out.println("\n"+rs.getString(1)+"\t");
    out.println(rs.getInt(2)+"\t");
    out.println(rs.getInt(3)+"\t");*/
    
        usn=rs.getString(1);
        present=rs.getInt(2);
        total=rs.getInt(3);
        present=present+1;
        total=total+1;
        
        update=con.prepareStatement("update student set subject6attendance=?,subject6totalattendance=? where usn=? and test=?");
        update.setInt(1, present);
        update.setInt(2,total);
        update.setString(3, usn);
        update.setString(4,test);
        update.executeUpdate();   
    }
           out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Entered');");
                out.println("location='welcomefaculty.jsp';");
                out.println("</script>");
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
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(updateattendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
