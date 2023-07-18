<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Capacitaciones</title>
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

    <div class="container ">
        <h1>Registro de Capacitaciones</h1>
        <form id="formularioCapacitacion" action="CrearCapacitacion" method="post">

            <div class="form-group">
                <label for="titulo">Título:</label>
                <input type="text" id="titulo" name="titulo" required>
            </div>
            <div class="form-group">
                <label for="rutCliente">Rut Cliente:</label>
                <input type="number" id="rutCliente" name="rutCliente" required>
            </div>
            <div class="form-group">
                <label for="fecha">Fecha:</label>
                <input type="date" id="fecha" name="fecha" required>
            </div>
            <div class="form-group">
                <label for="duracion">Hora</label>
                <input type="time" id="hora" name="hora" min="1" required>
            </div>
            <div class="form-group">
                <label for="duracion">Duración (horas):</label>
                <input type="number" id="duracion" name="duracion" min="1" required>
            </div>
            <div class="form-group">
                <label for="ubicacion">Ubicación:</label>
                <input type="text" id="ubicacion" name="ubicacion" required>
            </div>
            <div class="form-group">
                <label for="cantAsistentes">Cantidad de asistentes:</label>
                <input type="number" id="cantAsistentes" name="cantAsistentes" required>
            </div>
            <div class="form-group">
                <label for="descripcion">Descripción:</label>
                <textarea id="descripcion" name="descripcion" required></textarea>
            </div>
            <div class="form-group">
                <input type="submit" id= "boton" value="Guardar" class="btn btn-primary">
            </div>
        </form>
        </div>
        
    
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
     <script src="./assets/js/validar.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
