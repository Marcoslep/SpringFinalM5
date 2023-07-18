<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

     <link rel="stylesheet" href="assets/css/styles.css">
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>

<br>
<br>
  <form action ="Sesion" method="post">
  
  <div class ="container col-md-4">
  
  <h1> Ingreso Usuario </h1>
  
  <div class="form-group ">
    <label for="usuario">Usuario:</label>
    <input type="text" class="form-control" name ="usuario"  id="usuario">
  </div>
  <div class="form-group">
    <label for="pwd">Contraseña:</label>
    <input type="password" class="form-control" name="contraseña"  id="pwd">
  </div>
  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
  </div>
  <button type="submit" class="btn btn-primary">Ingresar</button>
  </div>
</form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>