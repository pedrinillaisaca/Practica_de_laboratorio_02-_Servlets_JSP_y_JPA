<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
   
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- <meta charset="utf-8"> -->
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Agenda</title>
  <meta name="description" content="">
  <meta name="keywords" content="">



  <!-- Twitter Cards integration: https://dev.twitter.com/cards/  -->
  <meta name="twitter:card" content="summary">
  <meta name="twitter:site" content="">
  <meta name="twitter:title" content="">
  <meta name="twitter:description" content="">
  <meta name="twitter:image" content="">

  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:400,300|Raleway:300,400,900,700italic,700,300,600">
  <link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/jquery.bxslider.css">
  <link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/animate.css">
  <link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/style.css">
 
</head>

<body>
 


  <div class="loader"></div>
  <div id="myDiv">
    <!--HEADER-->
    <div class="header">
      <div class="bg-color">
        <header id="main-header">
          <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
              <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
       	         <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
                <a class="navbar-brand" href="#">MiAgenda<span class="logo-dec">PC</span></a>
              </div>
              <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav navbar-right">
<!--                   <li class="active"><a href="#main-header">Home</a></li>
                  <li class=""><a href="#feature">About</a></li>
                  <li class=""><a href="#service">Services</a></li>
                  <li class=""><a href="#portfolio">Portfolio</a></li>
                  <li class=""><a href="#testimonial">Testimonial</a></li> -->
                  <li class=""><a href="#inicioSesion">Inicar Sesion</a></li>
                  <li class=""><a href="#registro">Registrarse</a></li>
                </ul>
              </div>
            </div>
          </nav>
        </header>
       <!--  </div>
        </div> -->
        
        

    <section id="inicioSesion" class="section-padding wow fadeInUp delay-05s">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center white">
            <h2 class="service-title pad-bt15">Login</h2>
            
            <c:if test="${not empty loginError}">
 				<p style="color: red">${loginError}</p>
   			 <script>
  					  window.addEventListener("load",function(){alert("${loginError}");}
    		</script>
			</c:if>
            <!-- <p class="sub-title pad-bt15">salto<br>pedro pedro pedro </p> -->
            <hr class="bottom-line white-bg">
          </div>
          <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="loction-info white">
              <p><i class="fa fa-map-marker fa-fw pull-left fa-2x"></i>Iniciar Sesion</p>
              <p><i class="fa fa-envelope-o fa-fw pull-left fa-2x"></i>Ingrese su Correo</p>
              <!-- <p><i class="fa fa-phone fa-fw pull-left fa-2x"></i>+41 5787 2323</p> -->
            </div>
          </div>  
          <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="contact-form">
              <div id="sendmessage">Your message has been sent. Thank you!</div>
              <div id="errormessage"></div>
			<form action="/Practica022/InicioSesion" method="post" role="form" class="contactForm">
                 
              <!-- <div class="col-md-6 padding-right-zero">
                 <div class="form-group">
                    <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                    <div class="validation"></div>
                  </div>
                </div> -->
                <div class="col-md-12">
                  <div class="form-group">
                    <input type="email" class="form-control" name="correo" id="correo" placeholder="correo" data-rule="email" data-msg="Please enter a valid email" />
                    <div class="validation"></div>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                    <input type="password" class="form-control" name="contra" id="contra" placeholder="Contrase�a" data-rule="contra" data-msg="Ingrese Su contrase�a" />
                    <div class="validation"></div>
                  </div>
                </div>
                <!-- <div class="col-md-12">
                  <div class="form-group">
                    <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                    <div class="validation"></div>
                  </div>
                </div> -->
                <div class="col-md-12">
                 <!-- <div class="form-group">
                    <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                    <div class="validation"></div>
                  </div> -->
                  <button type="submit" class="btn btn-primary btn-submit">INICIAR SESION </button>
                </div>
              </form>

            </div>
          </div>
        </div>
      </div>
    </section>
    <br><br><br><br><br><br><br><br><br><br><br><br>
    <!-- registro -->
        <section id="registro" class="section-padding wow fadeInUp delay-05s">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center white">
            <h2 class="service-title pad-bt15">Formulario de Registro</h2>
            <!-- <p class="sub-title pad-bt15">salto<br>pedro pedro pedro </p> -->
            <hr class="bottom-line white-bg">
          </div>
          <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="loction-info white">
              <p><i class="fa fa-map-marker fa-fw pull-left fa-2x"></i>Registro de Usuarios</p>
              <p><i class="fa fa-envelope-o fa-fw pull-left fa-2x"></i>Ingrese los datos a Continuaci�n:</p>
              <!-- <p><i class="fa fa-phone fa-fw pull-left fa-2x"></i>+41 5787 2323</p> -->
            </div>
          </div>          
          <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="contact-form">
              <div id="sendmessage">Your message has been sent. Thank you!</div>
              <div id="errormessage"></div>
              <form action="/Practica022/RegistrarUsuarios" method="post" role="form" class="contactForm">
<!--                 <div class="col-md-6 padding-right-zero">
                  <div class="form-group">
                    <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                    <div class="validation"></div>
                  </div>
                </div> -->
                              
                
                <div class="col-md-12">
                  <div class="form-group">
                    <label for="nombrea" style="color: white;">Nombres:</label>
				  	<input type="text" class="form-control" name="nombres" placeholder="nombres" id="nombres"  required>
                    <div class="validation"></div>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                   <label for="apellidos" style="color: white;">Apellidos:</label>
				  <input type="text" class="form-control" name="apellidos" placeholder="apellidos" id="apellidos" aria-describedby="sizing-addon1" required>
                    <div class="validation"></div>
                  </div>
                </div>                
                <div class="col-md-12">
                  <div class="form-group">
                   <label for="numeroced" style="color: white;">Cedula:</label>
				  <input type="text" class="form-control" name="numeroced" placeholder="numeroced" id="numeroced" aria-describedby="sizing-addon1" required>
                    <div class="validation"></div>
                  </div>
                </div>
                     
                
                <div class="col-md-12">
                  <div class="form-group">
                   <label for="correo" style="color: white;">Correo:</label>
				  <input type="email" class="form-control" name="correo" id="correo" placeholder="correo" data-rule="email" data-msg="Please enter a valid email"  required/>
                    <div class="validation"></div>
                  </div>
                </div>
                <div class="col-md-12">
                  <div class="form-group">
                  <label for="contra" style="color: white;">Contrase�a:</label>
                    <input type="password" class="form-control" name="contra" id="contra" placeholder="Contrase�a" data-rule="contra" data-msg="Ingrese Su contrase�a" />
                    <div class="validation"></div>
                  </div>
                </div>
<!--                 <div class="col-md-12">
                  <div class="form-group">
                    <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                    <div class="validation"></div>
                  </div>
                </div> -->
                <div class="col-md-12">
<!--                   <div class="form-group">
                    <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                    <div class="validation"></div>
                  </div> -->
                  <button type="submit" class="btn btn-primary btn-submit">REGISTARSE</button>
                </div>
              </form>

            </div>
          </div>
        </div>
      </div>
    </section>
    
    <!-- fin registro -->
    <!---->
    <!---->
    <footer id="footer">
      <div class="container">
        <div class="row text-center">
          <p>&copy; Pedro Illaisaca. All Rights Reserved.</p>
          <div class="credits">
        
            Designed by <a href="https://www.youtube.com/channel/UCDH0DJaVLkCDtl_YN9hhByw/featured?view_as=subscriber">Pedro Illaisaca</a>
          </div>
        </div>
      </div>
    </footer>
    <!---->
  </div>
  <!-- <script src="js/jquery.min.js"></script>
  <script src="js/jquery.easing.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/wow.js"></script>
  <script src="js/jquery.bxslider.min.js"></script>
  <script src="js/custom.js"></script>
  <script src="contactform/contactform.js"></script> -->

</body>
</html>
