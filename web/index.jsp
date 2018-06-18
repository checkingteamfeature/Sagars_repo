<%-- 
    Document   : index
    Created on : 19 Feb, 2018, 3:22:04 PM
    Author     : ubuntu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta charset="utf-8">
  <title>Regna Bootstrap Template</title>
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

  <!-- =======================================================
    Theme Name: Regna
    Theme URL: https://bootstrapmade.com/regna-bootstrap-onepage-template/
    Author: BootstrapMade.com
    License: https://bootstrapmade.com/license/
  ======================================================= -->
</head>
    <body>
        <header id="header">
    <div class="container">
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero">Home</a></li>
           <li><a href="#register">Register</a></li>
          <li><a href="#login">Login</a></li>
         
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->

  <!--==========================
    Hero Section
  ============================-->
  <section id="hero">
    <div class="hero-container">
      <h1>Welcome to Student Portal</h1>  
    </div>
  </section>
  <main id="main">
 <!--==========================
      Team Section
    ============================-->
 <section id="register">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">Register</h3>
          <p class="section-description">Enter you Details to Register</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form action="Register" method="post" role="form" class="contactForm">
                <div class="form-group">
                  <input type="text" name="firstname" class="form-control" id="firstname" placeholder="First Name" data-rule="minlen:4" data-msg="Please enter Your First Name" />
                  <div class="validation"></div>
                </div>
                 <div class="form-group">
                  <input type="text" name="lastname" class="form-control" id="lastname" placeholder="Last Name" data-rule="minlen:4" data-msg="Please enter Your Last Name" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" name="username" class="form-control" id="lastname" placeholder="User Name" data-rule="minlen:4" data-msg="Please enter Your User Name" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="password" name="password" class="form-control" id="lastname" placeholder="Password" data-rule="minlen:4" data-msg="Please enter Your Password" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="password" name="confirmpassword" class="form-control" id="lastname" placeholder="Retype Password" data-rule="minlen:4" data-msg="Please re-enter Your Password" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" name="course" id="subject" placeholder="Course Name" data-rule="minlen:4" data-msg="Please enter your course name" />
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit" name="Register">Register</button></div>
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
 <section id="login">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title"></h3>
          <p class="section-description"></p>
        </div><div class="section-header">
          <h3 class="section-title">Login</h3>
          <p class="section-description">Enter you Username and Password to Login</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form action="login" method="post" role="form" class="contactForm">
                <div class="form-group">
                  <input type="text" name="loginusername" class="form-control" id="name" placeholder="User Name" data-rule="minlen:4" data-msg="Please enter your username" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="password" name="loginpassword" class="form-control" id="name" placeholder="Password" data-rule="minlen:4" data-msg="Please enter your password" />
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit" name="login">Login</button></div>
                <p class="section-description"></p>
              </form>
          </div>
        </div>
<footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>

    
  </footer><!-- #footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
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

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
    </section>
        <h1>Hello World!</h1>
        <form action="login" method="post" role="form" class="contactForm">
                <div class="form-group">
                  <input type="text" name="loginusername" class="form-control" id="name" placeholder="User Name" data-rule="minlen:4" data-msg="Please enter your username" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="password" name="loginpassword" class="form-control" id="name" placeholder="Password" data-rule="minlen:4" data-msg="Please enter your password" />
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit" name="login">Login</button></div>
                <p class="section-description"></p>
              </form>
    </body>
</html>


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    

           