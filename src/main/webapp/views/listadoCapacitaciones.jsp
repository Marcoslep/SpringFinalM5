<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Listar Capacitaciones</title>
      <link rel="stylesheet" href="./assets/css/styles.css">
      
      <script src="./assets/js/confirmar.js"></script>
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
	
    <div class="container">
        <h1 class="mt-4">Listado de Capacitaciones</h1>
        <table class="table table-striped mt-4">
            <thead style = "color: white">
                <tr>
                    <th>ID</th>
                    <th>Titulo</th>
                    <th>Rut Cliente</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>Ubicacion</th>
                    <th>Duracion</th>
                    <th>Cantidad de Asistentes</th>
                    <th>Descripcion</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody style = "color: white">
                <% List<Capacitacion> capacitaciones = (List<Capacitacion>) request.getAttribute("capacitaciones"); %>
                <% for (Capacitacion capacitacion : capacitaciones) { %>
                    <tr>
                        <td><%= capacitacion.getId() %></td>
                        <td><%= capacitacion.getTitulo() %></td>
                        <td><%= capacitacion.getRutCliente() %></td>
                        <td><%= capacitacion.getFecha() %></td>
                        <td><%= capacitacion.getHora() %></td>
                        <td><%= capacitacion.getUbicacion() %></td>
                        <td><%= capacitacion.getDuracion() %></td>
                        <td><%= capacitacion.getCantAsistentes() %></td>
                        <td><%= capacitacion.getDescripcion() %></td>
                        <td>
                            <a href="EditarCapacitacion?id=<%= capacitacion.getId() %>" class="btn btn-primary btn-sm">Editar</a>
                            <a href="EliminarCapacitacion?id=<%= capacitacion.getId() %>" class="btn btn-danger btn-sm">Eliminar</a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </div>

		<a href="CrearCapacitacion" class="btn btn-primary">Registrar nueva capacitacion</a>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>