<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Editar Capacitaciones</title>
      <link rel="stylesheet" href="assets/css/styles.css">
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
        <h1>Editar Capacitacion</h1>
        <% Capacitacion capacitacion = (Capacitacion) request.getAttribute("capacitacion"); %>
        <form action="ActualizarCapacitacion" method="POST">
            <input type="hidden" name="id" value="<%= capacitacion.getId() %>">
            <div class="form-group">
                <label for="titulo">Titulo:</label>
                <input type="text" class="form-control" name="titulo" value="<%= capacitacion.getTitulo() %>">
            </div>
            <div class="form-group">
                <label for="rutCliente">Rut Cliente:</label>
                <input type="number" class="form-control" name="rutCliente" value="<%= capacitacion.getRutCliente() %>">
            </div>
            <div class="form-group">
                <label for="fecha">Fecha:</label>
                <input type="date" class="form-control" name="fecha" value="<%= capacitacion.getFecha() %>">
            </div>
            <div class="form-group">
                <label for="hora">Hora:</label>
                <input type="time" class="form-control" name="hora" value="<%= capacitacion.getHora() %>">
            </div>
            <div class="form-group">
                <label for="ubicacion">Ubicacion:</label>
                <input type="text" class="form-control" name="ubicacion" value="<%= capacitacion.getUbicacion() %>">
            </div>
            <div class="form-group">
                <label for="duracion">Duracion (horas):</label>
                <input type="number" class="form-control" name="duracion" value="<%= capacitacion.getDuracion() %>">
            </div>
            <div class="form-group">
                <label for="cantAsistentes">Cantidad de Asistentes:</label>
                <input type="number" class="form-control" name="cantAsistentes" value="<%= capacitacion.getCantAsistentes() %>">
            </div>
            <div class="form-group">
                <label for="descripcion">Descripcion:</label>
                <input type="text" class="form-control" name="descripcion" value="<%= capacitacion.getDescripcion() %>">
            </div>
            <button type="submit" class="btn btn-primary">Actualizar</button>
        </form>
    </div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>