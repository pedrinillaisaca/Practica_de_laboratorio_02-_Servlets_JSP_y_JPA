<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="Contenedor">
		 <div class="Icon">
                    <!--Icono de usuario-->
                   <span class="glyphicon glyphicon-user"></span>
                 </div>
<div class="ContentForm">
		 	<form action="../RegistrarUsuarios" method="post" name="formularioVerga">
		 		<div class="input-group input-group-lg">
				  <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-envelope"></i></span>
				  <label for="Correo">Correo:</label>
				  <input type="text" class="form-control" name="correo" placeholder="Correo" id="Correo" aria-describedby="sizing-addon1" required>
				</div>
				<br>
				<div class="input-group input-group-lg">
				  <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-lock"></i></span>
				  <label for="contrasenia">Contraseña:</label>
				  <input type="password" name="contra" id="contrasenia"class="form-control" placeholder="******" aria-describedby="sizing-addon1" required>
				</div>
				<br>			
				<div class="input-group input-group-lg">
				  <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-envelope"></i></span>
				  <label for="nombrea">Nombres:</label>
				  <input type="text" class="form-control" name="nombres" placeholder="nombres" id="nombres" aria-describedby="sizing-addon1" required>
				</div>
				<br>
				<div class="input-group input-group-lg">
				  <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-envelope"></i></span>
				  <label for="apellidos">Apellidos:</label>
				  <input type="text" class="form-control" name="apellidos" placeholder="apellidos" id="apellidos" aria-describedby="sizing-addon1" required>
				</div>
				<br>
				<div class="input-group input-group-lg">
				  <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-envelope"></i></span>
				  <label for="numeroced">Cedula:</label>
				  <input type="text" class="form-control" name="numeroced" placeholder="numeroced" id="numeroced" aria-describedby="sizing-addon1" required>
				</div>
				<br>
				
				<br>
				<br>
				<button class="btn btn-lg btn-primary btn-block btn-signin" id="Registrarce" type="submit">Registrarce</button>
				
		 	</form>
		 </div>	
		 </div>
</body>
</html>