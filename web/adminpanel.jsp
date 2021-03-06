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
</head>
<body>
 <% if(session.getAttribute("username")==null)
    {
        response.sendRedirect("admin.jsp");
    }
 %>
 <header id="header">
    <div class="container">
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero">Home</a></li>
           
         <li><a href="logout">logout</a></li>
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
 <section id="register">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">Add Faculty Members</h3>
          <p class="section-description">Enter Faculty Details</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form name="registerform" action="addfaculty" method="post" onsubmit="return validatesform();" >
                <div class="form-group">
                  <input type="text" name="username" required id="name" placeholder="Username"  />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" name="password" required id="name" placeholder="Password"  />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" name="confirmpassword" required id="name" placeholder="Confirm Password"  />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" name="subjecthandled" required id="name" placeholder="Subject Handled"  />
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit" name="Register">Add</button></div>
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
 <section id="removefaculty">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">Remove Faculty Members</h3>
          <p class="section-description">Enter Faculty Details</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form name="registerform" action="removefaculty" method="post"  >
                <div class="form-group">
                  <input type="text" name="username" required id="name" placeholder="Username"  />
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit" name="Register">Remove</button></div>
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
 <section id="removestudent">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">Remove Student</h3>
          <p class="section-description">Enter Student USN</p>
        </div>
      </div>
      <div class="container wow fadeInUp">
        <div class="row justify-content-center">
            <form name="registerform" action="removestudent" method="post"  >
                <div class="form-group">
                  <input type="text" name="usn" required id="name" placeholder="USN"  />
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit" name="Register">Remove</button></div>
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
