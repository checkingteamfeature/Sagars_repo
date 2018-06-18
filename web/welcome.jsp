<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
  <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }
            th, td {
                border: 1px solid #ccc;
                padding: 10px;
            }
            table.alt tr:nth-child(even) {
                background-color: #eee;
            }
            table.alt tr:nth-child(odd) {
                background-color: #fff;
            }            
        </style>
</head>
<body>
      <% if(session.getAttribute("username")==null)
    {
        response.sendRedirect("index.html");
    }
       session.getAttribute("subject1");
       session.getAttribute("subject2");
       session.getAttribute("subject3");
       session.getAttribute("subject4");
       session.getAttribute("subject5");
       session.getAttribute("subject6");
       session.getAttribute("subject1marks");
       session.getAttribute("subject2marks");
       session.getAttribute("subject3marks");
       session.getAttribute("subject4marks");
       session.getAttribute("subject5marks");
       session.getAttribute("subject6marks");
       session.getAttribute("subject1grade");
       session.getAttribute("subject2grade");
       session.getAttribute("subject3grade");
       session.getAttribute("subject4grade");
       session.getAttribute("subject5grade");
       session.getAttribute("subject6grade");
       
    
    
   %>   
 <header id="header">
    <div class="container">
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero">Home</a></li>
          <li><a href="#attendance">Attendance</a></li>
           <li><a href="#marks">Marks</a></li>
          <li><a href="#fees">Fees</a></li>
          <li><a href="#grade">Grade</a></li>
          <li><a href="logout">Logout</a></li>
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
      
  </section><!-- #hero -->

  <main id="main">
      <main id="main">
 <!--==========================
      Team Section
    ============================-->
 <section id="attendance">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">Attendance</h3>
          <p class="section-description">Subject wise Attendance given below</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form name="registerform" action="Register" method="post" onsubmit="return validatesform();" >
                <table class="alt">
            <tr>
                <th>Subject Name</th>
                <th>Attendance in %</th>
            </tr>
            <tr>
                <td>${subject1}</td>
                <td>${subject1attendance}</td>
            </tr>
            <tr>
                <td>${subject2}</td>
                <td>${subject2attendance}</td>
            </tr>
            <tr>
                <td>${subject3}</td>
                <td>${subject3attendance}</td>
            </tr>
            <tr>
                <td>${subject4}</td>
                <td>${subject4attendance}</td>
            </tr>
            <tr>
                <td>${subject5}</td>
                <td>${subject5attendance}</td>
            </tr>
            <tr>
                <td>${subject6}</td>
                <td>${subject6attendance}</td>
            </tr>
        </table>
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
 <section id="marks">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title"></h3>
          <p class="section-description"></p>
        </div>
          <div class="section-header">
          <h3 class="section-title">Marks</h3>
          <p class="section-description">Select the Test to know marks</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form action="testresults" method="post"  >
                Select the test:
                <select id="testselected" name="testselected">
                    <option value="test1" selected="selected">Test 1</option>
                     <option value="test2">Test 2</option>
                     <option value="test3">Test 3</option>
                     <option value="test4">Test 4</option>
                     <option value="test5">Test 5</option>
                </select>
                <input type="hidden" name="uname" value=${username}>  
                <div class="text-center"><button type="submit" name="submit">Submit</button></div><br><br>
                <table class="alt">
            <tr>
                <th>Subject Name</th>
                <th>Marks</th>
            </tr>
            <tr>
                <td>${subject1}</td>
                <td>${subject1marks}</td>
            </tr>
            <tr>
                <td>${subject2}</td>
                <td>${subject2marks}</td>
            </tr>
            <tr>
                <td>${subject3}</td>
                <td>${subject3marks}</td>
            </tr>
            <tr>
                <td>${subject4}</td>
                <td>${subject4marks}</td>
            </tr>
            <tr>
                <td>${subject5}</td>
                <td>${subject5marks}</td>
            </tr>
            <tr>
                <td>${subject6}</td>
                <td>${subject6marks}</td>
            </tr>
        </table>
                <p class="section-description"></p>
              </form>
          </div>
        </div>

    </section>
            <section id="Grade">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title"></h3>
          <p class="section-description"></p>
        </div>
          <div class="section-header">
          <h3 class="section-title">Grade</h3>
          <p class="section-description">Grade Report Of Current Semester</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form action="login" method="post"  >
                
                <table class="alt">
            <tr>
                <th>Subject Name</th>
                <th>Grade</th>
            </tr>
            <tr>
                <td>${subject1}</td>
                <td>${subject1grade}</td>
            </tr>
            <tr>
                <td>${subject2}</td>
                <td>${subject2grade}</td>
            </tr>
            <tr>
                <td>${subject3}</td>
                <td>${subject3grade}</td>
            </tr>
            <tr>
                <td>${subject4}</td>
                <td>${subject4grade}</td>
            </tr>
            <tr>
                <td>${subject5}</td>
                <td>${subject5grade}</td>
            </tr>
            <tr>
                <td>${subject6}</td>
                <td>${subject6grade}</td>
            </tr>
        </table>
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
 
 <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>
  </footer>

  <!--==========================
    Footer
  ============================-->
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
