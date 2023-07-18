<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <title>Asesorías en Prevención de Riesgos</title>
      <link rel="stylesheet" href= "assets/css/styles.css" >
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
 
  
</head>
<body>

	<% HttpSession validarSesion = request.getSession();
	String usuario = (String) validarSesion.getAttribute("usuario");
	if (validarSesion.getAttribute("usuario") != null) { %>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">APR</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
            aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="Inicio">Inicio</a>
                </li>
                 <li class="nav-item">
                    <a class="nav-link" href="CrearUsuario">Crear Usuario</a>
                </li>
                 <li class="nav-item">
                    <a class="nav-link" href="ListarUsuarios">Listar Usuarios</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="CrearCapacitacion">Crear Capacitacion</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ListarCapacitaciones">Listar Capacitacion</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Contacto">Contacto</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="CerrarSesion">Cerrar Sesion</a>
                </li>
            </ul>
        </div>
    </nav>
    <%} %>


    <br>
    <br>
    <div class="container">
        <h1 >Asesorías en Prevención de Riesgos</h1>
        
        <p>Bienvenido(a) al programa de asesorías en prevención de riesgos. 
        Aquí encontrarás información y recursos para mejorar la seguridad en tu entorno laboral.</p>
        <br>
        <br>
        <br>
        <h5>Instrucciones de uso: </h5>
        <br>
        <ol>
        <li>Inicia sesion en el sitio presionando el boton Iniciar Sesion</li>
        <li>Navega a traves del menu seleccionando sus diferentes opciones</li>
        <li>Para ingresar nuevos registros utiliza las opciones Crear</li>
        <li>Puedes editar los registros ingresados en la opcion de listado</li>
        </ol>
        <br>
        
        
        
        	<% HttpSession validarSesion2 = request.getSession();
			String usuario2 = (String) validarSesion.getAttribute("usuario");
			if (validarSesion2.getAttribute("usuario") == null) { %>
		<p>Inicia sesion para comenzar</p>
        <a href="Login" class="btn btn-primary">Iniciar Sesion</a>
        <br>
        <br>
        <br>
        <br>
        <br>
        <%} %>
        <p>Si tienes cualquier duda respecto a nuestras asesorías, contáctanos</p>
        </div>
    
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
