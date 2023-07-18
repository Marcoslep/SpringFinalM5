<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="cl.AsesoriasPrevencionRiesgos.modelo.Usuario" %>
<html>
<head>
    <title>Crear Usuario</title>
    <link rel="stylesheet" href= "./assets/css/styles.css" >
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
        <h1 class="mt-4">Crear Usuario</h1>
        
       <form id="formularioUsuario" method="post" action="CrearUsuario" class="mt-4">
        <div>
            <label for="nombres">Nombres:</label>
            <input type="text" id="nombres" name="nombres" required>
        </div>
        <div>
            <label for="apellidos">Apellidos:</label>
            <input type="text" id="apellidos" name="apellidos" required>
        </div>
        <div>
            <label for="fechaNacimiento">Fecha de Nacimiento:</label>
            <input type="date" id="fechaNacimiento" name="fechaNacimiento" required>
        </div>
        <div>
            <label for="rut">RUT:</label>
            <input type="text" id="rut" name="rut" required>
        </div>
        <div>
            <label for="tipoUsuario">Tipo de Usuario:</label>
            <select id="tipoUsuario" name="tipoUsuario" onchange="mostrarCamposEspecificos()">
                <option value="">Seleccionar</option>
                <option value="Cliente">Cliente</option>
                <option value="Administrativo">Administrativo</option>
                <option value="Profesional">Profesional</option>
            </select>
        </div>
        <!-- Campos específicos para Cliente -->
        <div id="camposCliente" style="display: none;">
            <div>
                <label for="telefono">Teléfono:</label>
                <input type="text" id="telefono" name="telefono">
            </div>
            <div>
                <label for="afp">AFP:</label>
                <input type="text" id="afp" name="afp">
            </div>
            <div>
                <label for="sistemaSalud">Sistema de Salud:</label>
                <select id="sistemaSalud" name="sistemaSalud">
                    <option value="Fonasa">Fonasa</option>
                    <option value="Isapre">Isapre</option>
                </select>
            </div>
            <div>
                <label for="direccion">Dirección:</label>
                <input type="text" id="direccion" name="direccion">
            </div>
            <div>
                <label for="comuna">Comuna:</label>
                <input type="text" id="comuna" name="comuna">
            </div>
        </div>

        <!-- Campos específicos para Administrativo -->
        <div id="camposAdministrativo" style="display: none;">
            <div>
                <label for="area">Área:</label>
                <input type="text" id="area" name="area">
            </div>
            <div>
                <label for="experienciaPrevia">Experiencia Previa:</label>
                <input type="text" id="experienciaPrevia" name="experienciaPrevia">
            </div>
        </div>

        <!-- Campos específicos para Profesional -->
        <div id="camposProfesional" style="display: none;">
            <div>
                <label for="titulo">Título:</label>
                <input type="text" id="titulo" name="titulo">
            </div>
            <div>
                <label for="fechaIngreso">Fecha de Ingreso:</label>
                <input type="date" id="fechaIngreso" name="fechaIngreso">
            </div>
        </div>

        <div>
            <input class="btn" style= "color: white" type="submit" value="Guardar">
        </div>
    </form>
                
            </div>

            
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
     <script src="./assets/js/validar.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
