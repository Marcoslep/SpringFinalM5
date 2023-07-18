<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Contacto</title>
     <link rel="stylesheet" href="assets/css/styles.css">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body>

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
    
    <br>
    <br>

    <div class="container">
        <h1>Formulario de Contacto</h1>
        <form action="Contacto" method="post">
            <div class="form-group d-flex justify-content-center">
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required>
            </div>
            <div class="form-group d-flex justify-content-center">
                <label for="correo">Correo:</label>
                <input type="text" id="correo" name="correo" required>
            </div>
            <div class="form-group d-flex justify-content-center">
                <label for="mensaje">Mensaje:</label>
                <textarea id="mensaje" name="mensaje" required></textarea>
            </div>
            <div class="form-group">
                <input type="submit" value="Enviar" class="btn btn-primary">
            </div>
        </form>
        </div>
        
        
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        
</body>
</html>