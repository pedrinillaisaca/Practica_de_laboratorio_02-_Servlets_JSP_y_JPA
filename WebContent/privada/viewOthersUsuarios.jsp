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
  
  
<!-- DATATABLES -->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
<!-- BOOTSTRAP 
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">-->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
	
	
<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:400,300|Raleway:300,400,900,700italic,700,300,600">
<link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/jquery.bxslider.css">
<link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/animate.css">
<link rel="stylesheet" type="text/css" href="/Practica022/Estilos/css/style.css">
 
</head>

<body>
<c:set var="usuario" value="${requestScope['usuario']}"/>
  <div class="loader"></div>
  <!-- <div id="myDiv"> -->
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
                <!-- PENDIENE -->
							<li class=""><a href="#main-header">Home</a></li>
							<li class=""><a href="/Practica022/ReturnCuent?ced=${usuario.cedula}">Mi Cuenta</a></li>
							<li class=""><a href="">mis telefonos</a></li>
							<li class=""><a href="">Nuevo Numero</a></li>
							<li class="active"><a href="">Buscar Usuarios</a></li>
							<li class=""><a href="/Practica022/CerrarSesion">Cerrar Sesion</a></li>
							<!-- <li class=""><a href="#testimonial">Testimonial</a></li> -->							
							<!-- <li class=""><a href="#registro">Registrarse</a></li> -->
                </ul>
              </div>
            </div>
          </nav>
        </header>
       <!--  </div>
        </div> -->
        
        

    <section id="miCuenta" class="section-padding wow fadeInUp delay-05s">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center white">
            <h2 class="service-title pad-bt15">Info de Usuario: ${usuario.nombre} ${usuario.apellido}</h2>
            <p class="sub-title pad-bt15">Correo:<br>${usuario.correo}<br><a href="mailto:${usuario.correo}">Enviar Correo</a></p>
            <hr class="bottom-line white-bg">
          </div>
         <!--  <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="loction-info white">
              <p><i class="fa fa-map-marker fa-fw pull-left fa-2x"></i>A99 Adam Street<br>Texas, TX 555072</p>
              <p><i class="fa fa-envelope-o fa-fw pull-left fa-2x"></i>consultas@servitecflhuaraz.com</p>
              <p><i class="fa fa-phone fa-fw pull-left fa-2x"></i>+41 5787 2323</p>
            </div>
          </div> -->  
          <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="contact-form">
              <div id="sendmessage">Your message has been sent. Thank you!</div>
              <div id="errormessage"></div>	
            </div>
          </div>        
        </div>
      </div>
    </section>
    
    


    <!---->
    <!---->

    <!---->
  </div>
  
  
  
  
  <!-- FIN DIV GLOBAL -->
  
  
                	<!-- DESDE AQUI VA LAS TABLAS -->

	<div id="divTablas" class="container" style="margin-top: 25px; padding: 10px">
		<table id="tablax" class="table table-striped table-bordered"
			style="width: 100%">
			<thead>			
				<th>Numero</th>
				<th>tipo</th>
				<th>operadora</th>
				<th>opciones</th>
				
			</thead>
			<tbody>
				<c:forEach var="telefonos" items="${usuario.telefonos}">
					<tr>
						<td>${telefonos.numero}</td>
						<td>${telefonos.tipo}</td>
						<td>${telefonos.operadora}</td>
						<td>
						
						<a href="tel:+593${telefonos.numero}">Llamar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
          <!-- fin tablas -->








<div class="bg-color">

    
    
    
    
    
    
    
   

</div>












		<div ><!-- class="bg-color"FOOTER -->

			<footer id="footer">
				<div class="container">
					<div class="row text-center">
						<p>&copy; Pedro Illaisaca. All Rights Reserved.</p>
						<div class="credits">

							Designed by <a
								href="https://www.youtube.com/channel/UCDH0DJaVLkCDtl_YN9hhByw/featured?view_as=subscriber">Pedro
								Illaisaca</a>
						</div>
					</div>
				</div>
			</footer>
		</div>


<!-- JQUERY -->
	<script src="https://code.jquery.com/jquery-3.4.1.js"
		integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
		crossorigin="anonymous">
        </script>
	<!-- DATATABLES -->
	<script
		src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js">
    </script>
	<!-- BOOTSTRAP -->
	<script
		src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js">
    </script>
	<script>
        $(document).ready(function () {
            $('#tablax').DataTable({
                language: {
                    processing: "Tratamiento en curso...",
                    search: "Buscar&nbsp;:",
                    lengthMenu: "Agrupar de _MENU_ items",
                    info: "Mostrando del item _START_ al _END_ de un total de _TOTAL_ items",
                    infoEmpty: "No existen datos.",
                    infoFiltered: "(filtrado de _MAX_ elementos en total)",
                    infoPostFix: "",
                    loadingRecords: "Cargando...",
                    zeroRecords: "No se encontraron datos con tu busqueda",
                    emptyTable: "No hay datos disponibles en la tabla.",
                    paginate: {
                        first: "Primero",
                        previous: "Anterior",
                        next: "Siguiente",
                        last: "Ultimo"
                    },
                    aria: {
                        sortAscending: ": active para ordenar la columna en orden ascendente",
                        sortDescending: ": active para ordenar la columna en orden descendente"
                    }
                },
                scrollY: 400,
                lengthMenu: [ [10, 25, -1], [10, 25, "All"] ],
            });
        });
    </script>

</body>
</html>
