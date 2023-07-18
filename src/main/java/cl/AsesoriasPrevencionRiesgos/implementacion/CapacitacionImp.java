package cl.AsesoriasPrevencionRiesgos.implementacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.AsesoriasPrevencionRiesgos.interfaces.ICapacitacion;
import cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion;

public class CapacitacionImp implements ICapacitacion {
	
	
	private static CapacitacionImp instancia;
    private Connection conexion;

    //Constructor
    private CapacitacionImp() {
        // Establecer la conexión a la base de datos en el constructor privado
        // Usar Singleton para asegurar que solo haya una instancia de UsuarioDAO
        // y una única conexión a la base de datos en todo el proyecto
        conexion = obtenerConexion(); // Implementar este método
    }

    //Obtencion de instancia
    public static CapacitacionImp getInstancia() {
        if (instancia == null) {
            instancia = new CapacitacionImp();
        }
        return instancia;
    }

    //Metodos CRUD
    
	public List<Capacitacion> listaCapacitaciones() {
        List<Capacitacion> capacitaciones = new ArrayList<>();
        String consulta = "SELECT id,titulo,rutCliente,fecha,hora,ubicacion,duracion,"
        		+ "cantAsistentes,descripcion FROM capacitaciones";

        try (
        	 PreparedStatement statement = conexion.prepareStatement(consulta);
        		
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
            	Capacitacion capacitacion = new Capacitacion();
            	capacitacion.setId(resultSet.getInt("id"));
            	capacitacion.setTitulo(resultSet.getString("titulo"));
            	capacitacion.setRutCliente(resultSet.getInt("rutCliente"));
            	capacitacion.setFecha(resultSet.getString("fecha"));
            	capacitacion.setHora(resultSet.getString("hora"));
            	capacitacion.setUbicacion(resultSet.getString("ubicacion"));
            	capacitacion.setDuracion(resultSet.getInt("duracion"));
            	capacitacion.setCantAsistentes(resultSet.getInt("cantAsistentes"));
            	capacitacion.setDescripcion(resultSet.getString("descripcion"));
            	
            	capacitaciones.add(capacitacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return capacitaciones;
    }
	
	public Capacitacion listarCapacitacionPorId(int id) {
    	Capacitacion capacitacion = null;
        String consulta = "SELECT id,titulo,rutCliente,fecha,hora,ubicacion,duracion,"
        		+ "cantAsistentes,descripcion FROM capacitaciones WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                	capacitacion = new Capacitacion();
                	capacitacion.setId(resultSet.getInt("id"));
                	capacitacion.setTitulo(resultSet.getString("titulo"));
                	capacitacion.setRutCliente(resultSet.getInt("rutCliente"));
                	capacitacion.setFecha(resultSet.getString("fecha"));
                	capacitacion.setHora(resultSet.getString("hora"));
                	capacitacion.setUbicacion(resultSet.getString("ubicacion"));
                	capacitacion.setDuracion(resultSet.getInt("duracion"));
                	capacitacion.setCantAsistentes(resultSet.getInt("cantAsistentes"));
                	capacitacion.setDescripcion(resultSet.getString("descripcion"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return capacitacion;
    }
	

	public void registraCapacitacion(Capacitacion capacitacion) {
        String consulta = "INSERT INTO capacitaciones "
        		+ "(titulo, rutCliente,fecha,hora,ubicacion,duracion,cantAsistentes,descripcion) "
        		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (
        		
        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, capacitacion.getTitulo());
            statement.setInt(2, capacitacion.getRutCliente());
            statement.setString(3, capacitacion.getFecha());
            statement.setString(4, capacitacion.getHora());
            statement.setString(5, capacitacion.getUbicacion());
            statement.setInt(6, capacitacion.getDuracion());
            statement.setInt(7, capacitacion.getCantAsistentes());
            statement.setString(8, capacitacion.getDescripcion());
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    public void actualizarCapacitacion(Capacitacion capacitacion) {
        String consulta = "UPDATE capacitaciones SET titulo = ?, rutCliente = ?, fecha = ?,"
        		+ " hora = ?, ubicacion = ?, duracion = ?, cantAsistentes = ?, descripcion = ?"
        		+ "  WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
        	
        	statement.setString(1, capacitacion.getTitulo());
            statement.setInt(2, capacitacion.getRutCliente());
            statement.setString(3, capacitacion.getFecha());
            statement.setString(4, capacitacion.getHora());
            statement.setString(5, capacitacion.getUbicacion());
            statement.setInt(6, capacitacion.getDuracion());
            statement.setInt(7, capacitacion.getCantAsistentes());
            statement.setString(8, capacitacion.getDescripcion());
            statement.setInt(9, capacitacion.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarCapacitacion(int id) {
        String consulta = "DELETE FROM capacitaciones WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
		
	//Metodo obtencion de conexion a BD
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
