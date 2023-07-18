<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="cl.AsesoriasPrevencionRiesgos.modelo.Usuario" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Listar Usuarios</title>
    <link rel="stylesheet" href= "assets/css/styles.css" >
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

    <div class="container">
        <h1 class="mt-4">Listado de Usuarios</h1>
        <table class="table table-striped mt-4">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Tipo de Usuario</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Rut</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <% List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios"); %>
                <% for (Usuario usuario : usuarios) { %>
                    <tr>
                        <td><%= usuario.getId() %></td>
                        <td><%= usuario.getTipoUsuario()  %></td>
                        <td><%= usuario.getNombres()  %></td>
                        <td><%= usuario.getApellidos()  %></td>
                        <td><%= usuario.getFechaNacimiento()  %></td>
                        <td><%= usuario.getRut()  %></td>
                        <td>
                        <a href="DetalleUsuario?tipoUsuario=<%= usuario.getTipoUsuario() %>&id=<%= usuario.getId() %>" class="btn btn-primary btn-sm">Ver</a>
                        <a href="EditarUsuario?tipoUsuario=<%= usuario.getTipoUsuario() %>&id=<%= usuario.getId() %>" class="btn btn-primary btn-sm">Editar</a>
                        <a href="EliminarUsuario?id=<%= usuario.getId() %>" class="btn btn-danger btn-sm">Eliminar</a>
                        </td>
                    </tr>
                    <% } %>
            </tbody>
        </table>
    </div>
    		<a href="CrearUsuario" class="btn btn-primary">Registrar nuevo usuario</a>
    
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>

