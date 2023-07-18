/**
 * Archivo Javascript.
 * Permite desplegar codigo Jquery y Javascript en el proyecto
 * Entre sus funciones esta validar formularios respecto a 
 * condiciones definidas en sus campos, como tambien
 * desplegar los campos correspondientes a cada tipo de usuario
 * en el formulario de creacion de usuario.
 * 
 */

//Valida formulario capacitacion
 $(document).ready(function(){
  $("#boton").click(function(){
     var rutCliente = $('#rutCliente').val();
       var ubicacion =$ ('#ubicacion').val();
        var asistentes = $('#cantAsistentes').val();
        
        if ((rutCliente > 99999999 || rutCliente.length < 7)) {
          alert('Por favor, ingresa un RUT valido.');
          return false;
        }
        
		if(ubicacion.length < 5 || ubicacion.length > 50){
		alert('Por favor, ingresa una Ubicacion valida. (min 5/max 50 caracteres)')
		return false;
		}
		
        if ((asistentes < 1 || asistentes > 1000)) {
          alert('Por favor, ingresa un Numero de Asistentes valido. (Entre 1 y 1000)');
          return false;
        }
        
        alert('La capacitacion se registro correctamente.');

      });
    });
    
     $(document).ready(function(){
  $("#botonuser").click(function(){
     var rut = $('#rut').val();
       var nombres =$ ('#nombres').val();
        var apellidos = $('#apellidos').val();
        
        if ((rut > 99999999 || rut.length < 7)) {
          alert('Por favor, ingresa un RUT valido.');
          return false;
        }
        
		if(nombres.length < 3 || nombres.length > 50){
			alert('Por favor, ingresa un Nombre valido. (min 3/max 50 caracteres)')
			return false;
		}
		
        if ((apellidos.length < 3 || apellidos.length > 50)) {
          alert('Por favor, ingresa un Apellido valido. (min 3/max 50 caracteres)');
          return false;
        }
        
        alert('El usuario se registro correctamente.');

      });
    });
    
    // Metodo para desplegar campos especificos por tipo de usuario.
            function mostrarCamposEspecificos() {
            var tipoUsuario = document.getElementById("tipoUsuario").value;
            var camposCliente = document.getElementById("camposCliente");
            var camposAdministrativo = document.getElementById("camposAdministrativo");
            var camposProfesional = document.getElementById("camposProfesional");

            // Ocultar todos los campos específicos
            camposCliente.style.display = "none";
            camposAdministrativo.style.display = "none";
            camposProfesional.style.display = "none";

            // Mostrar los campos específicos según el tipo de usuario seleccionado
            if (tipoUsuario === "Cliente") {
                camposCliente.style.display = "block";
            } else if (tipoUsuario === "Administrativo") {
                camposAdministrativo.style.display = "block";
            } else if (tipoUsuario === "Profesional") {
                camposProfesional.style.display = "block";
            }
        }