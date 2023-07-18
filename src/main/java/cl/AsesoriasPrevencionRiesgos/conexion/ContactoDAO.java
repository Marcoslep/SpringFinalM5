package cl.AsesoriasPrevencionRiesgos.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

import cl.AsesoriasPrevencionRiesgos.modelo.Contacto;



public class ContactoDAO {
	
	private static ContactoDAO instancia;
    private Connection conexion;

    private ContactoDAO() {
        // Establecer la conexión a la base de datos en el constructor privado
        // Usar Singleton para asegurar que solo haya una instancia de UsuarioDAO
        // y una única conexión a la base de datos en todo el proyecto
        conexion = obtenerConexion(); // Implementar este método
    }

    public static ContactoDAO getInstancia() {
        if (instancia == null) {
            instancia = new ContactoDAO();
        }
        return instancia;
    }

    
    // Métodos CRUD
    

   
    
    public void enviarContacto(Contacto contacto) {
        String consulta = "INSERT INTO contacto (nombre,correo,mensaje)"
        		+ " VALUES (?, ?, ?)";

        try (
        		
        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, contacto.getNombre());
            statement.setString(2, contacto.getCorreo());
            statement.setString(3, contacto.getMensaje());       
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   

    private Connection obtenerConexion() {
        Connection conexion = null;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/prevencion_riesgos";
            String usuario = "adminasesorias";
            String password = "asesorias123";
            
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
    

}
