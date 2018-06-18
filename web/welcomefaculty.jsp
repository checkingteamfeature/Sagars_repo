<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
  <meta charset="utf-8">
  <title>Student Portal</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">

  <script src="js/validateform.js"></script>
</head>
<body>
    <% if(session.getAttribute("username")==null)
    {
        response.sendRedirect("index.html");
        session.getAttribute("subject1");
        session.getAttribute("subjectname");
    }
    
   %>   
   <%
    
    String usn="";
    String list[]= new String[100];
    int Total=0;
    int count=0;
    Connection con = null;
    String url="jdbc:mysql://localhost:3306/portal";
       String UN="root";
       String PW="root";
          Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
    Statement st = con.createStatement();
    
    ResultSet rs=null;
%>    
 <header id="header">
    <div class="container">
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero">Home</a></li>
           <li><a href="#entermarks">EnterMarks</a></li>
          <li><a href="logout">Logout</a></li>
         
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
     <div class="container">
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          
         
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->

  <!--==========================
    Hero Section
  ============================-->
  <section id="hero">
    <div class="hero-container">
        <h1>Welcome </h1><h1>${username}</h1>  
    </div>
    <main id="main">
      <main id="main">       
  </section><!-- #hero -->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>
  </footer>
 <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>
  </footer>
<section id="entermarks">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title"></h3>
          <p class="section-description"></p>
        </div>
          <div class="section-header">
          <h3 class="section-title">Enter Marks</h3>
          <p class="section-description">Enter Marks of ${subjectname}</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form action="entermarks" method="post"  >
                <div class="form-group">
                  <input type="text" name="usn" required id="name" placeholder="USN"  />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" name="course" required id="name" placeholder="Course"  />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" name="test" required id="name" placeholder="Test"  />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="hidden" name="subject" id="name" value="${subjectname}"  />
                  
                </div>
                <div class="form-group">
                  <input type="text" name="subjectmarks" required id="name" placeholder="Marks"  />
                  <div class="validation"></div>
                </div>
                
                
                <div class="text-center"><button type="submit" name="login">Submit</button></div>
                <p class="section-description"></p>
              </form>
          </div>
        </div>

    </section>
                  <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>
  </footer>
 <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>
  </footer>
                  <section id="enterattendance">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title"></h3>
          <p class="section-description"></p>
        </div>
          <div class="section-header">
          <h3 class="section-title">Enter Attendance</h3>
          <p class="section-description">Enter Attendance of ${subjectname}</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            
            <form action="updateattendance" method="post" >
        <div class="form-group">
                  <input type="hidden" name="subject" id="name" value="${subjectname}"  />
                  
                </div>
                  <center><div class="form-group">
                  <input type="text" name="test" required id="name" placeholder="Test"  />
                  <div class="validation"></div>
                      </div></center>
<table border="1">
  
    <tr>
        <th ALIGN=CENTER> USN</th>
        
        <th ALIGN=CENTER> Present/Absent </th>
        
        <!---<th ALIGN=CENTER> Total Attendance </th>--->
        
    </tr>
<%
    rs = st.executeQuery("select * from attendancetb");
    while(rs.next())
    { 
    usn=rs.getString(1);
    Total=rs.getInt(3);
    
%>    
    <tr>
        
        <td ALIGN=CENTER>
            <%=usn%>
        </td>
        <td ALIGN=CENTER>
            <input type="checkbox" name="roll[]" value=<%=usn%> checked style="width: 15pt;" >Present
        </td>
        
       <!--- <td ALIGN=CENTER>
            <%=Total%>
        </td>--->
    
        
    </tr>
    
<tr>
    <%
    count++;
    }
    %>
    <td></td>
    <td></td>
    <td></td>
    
</tr>
</table>

<center>
<input type="reset" value="Reset" style="border-top-style: groove; border-radius: 0pt; padding: 5px; margin-right: 60px;  border: 2pt solid #000; color: #000; background-color: #CCC;" >
<input type="submit" value="Submit" style="border-top-style: groove; border-radius: 0pt;  padding: 5px; margin-left: 60px;border: 2pt solid #000; color: #000; background-color: #CCC;">
</center>
</form>
          </div>
        </div>

    </section>
  <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>
  </footer>
 <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>
  </footer>
  <!-- JavaScript Libraries -->
  

  <!-- Template Main Javascript File --><script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/wow/wow.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD8HeI8o-c1NppZA-92oYlXakhDPYR7XMY"></script>

  <script src="lib/waypoints/waypoints.min.js"></script>
  <script src="lib/counterup/counterup.min.js"></script>
  <script src="lib/superfish/hoverIntent.js"></script>
  <script src="lib/superfish/superfish.min.js"></script>

  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>
  <script src="js/main.js"></script>
    
  <!-- #footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

</body>
</html>