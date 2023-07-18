package cl.AsesoriasPrevencionRiesgos.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

import cl.AsesoriasPrevencionRiesgos.conexion.UsuarioDAO;
import cl.AsesoriasPrevencionRiesgos.modelo.Usuario;



public class UsuarioDAO {
	
	private static UsuarioDAO instancia;
    private Connection conexion;

    private UsuarioDAO() {
        // Establecer la conexión a la base de datos en el constructor privado
        // Usar Singleton para asegurar que solo haya una instancia de UsuarioDAO
        // y una única conexión a la base de datos en todo el proyecto
        conexion = obtenerConexion(); // Implementar este método
    }

    public static UsuarioDAO getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioDAO();
        }
        return instancia;
    }

    
    // Métodos CRUD
    

    public List<Usuario> obtenerUsuarios() {
    	
        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT id,tipoUsuario,nombres,apellidos,fechaNacimiento,rut FROM usuarios";

        try (
        	 PreparedStatement statement = conexion.prepareStatement(consulta);
        		
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setTipoUsuario(resultSet.getString("tipoUsuario"));
                usuario.setNombres(resultSet.getString("nombres"));
                usuario.setApellidos(resultSet.getString("apellidos"));
                usuario.setFechaNacimiento(resultSet.getString("fechaNacimiento"));
                usuario.setRut(resultSet.getInt("rut"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public Usuario obtenerUsuarioPorId(int id) {
        Usuario usuario = null;
        String consulta = "SELECT id,tipoUsuario,nombres,apellidos,fechaNacimiento,rut,"
        		+ "telefono,afp,sistemaSalud,direccion,comuna,area,experienciaPrevia,titulo,fechaIngreso"
        		+ " FROM usuarios WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                	usuario = new Usuario();
                	usuario.setId(resultSet.getInt("id"));
                    usuario.setTipoUsuario(resultSet.getString("tipoUsuario"));
                    usuario.setNombres(resultSet.getString("nombres"));
                    usuario.setApellidos(resultSet.getString("apellidos"));
                    usuario.setFechaNacimiento(resultSet.getString("fechaNacimiento"));
                    usuario.setRut(resultSet.getInt("rut"));
                    usuario.setTelefono(resultSet.getString("telefono"));
                    usuario.setAfp(resultSet.getString("afp"));
                    usuario.setSistemaSalud(resultSet.getString("sistemaSalud"));
                    usuario.setDireccion(resultSet.getString("direccion"));
                    usuario.setComuna(resultSet.getString("comuna"));
                    usuario.setArea(resultSet.getString("area"));
                    usuario.setExperienciaPrevia(resultSet.getString("experienciaPrevia"));
                    usuario.setTitulo(resultSet.getString("titulo"));
                    usuario.setFechaIngreso(resultSet.getString("fechaIngreso"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

    public void agregarUsuario(Usuario usuario) {
        String consulta = "INSERT INTO usuarios (tipoUsuario,nombres,apellidos,fechaNacimiento,rut,"
        		+ "telefono,afp,sistemaSalud,direccion,comuna,area,experienciaPrevia,titulo,fechaIngreso)"
        		+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (
        		
        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario.getTipoUsuario());
            statement.setString(2, usuario.getNombres());
            statement.setString(3, usuario.getApellidos());
            statement.setString(4, usuario.getFechaNacimiento());
            statement.setInt(5, usuario.getRut());
            statement.setString(6, usuario.getTelefono());
            statement.setString(7, usuario.getAfp());
            statement.setString(8, usuario.getSistemaSalud());
            statement.setString(9, usuario.getDireccion());
            statement.setString(10, usuario.getComuna());
            statement.setString(11, usuario.getArea());
            statement.setString(12, usuario.getExperienciaPrevia());
            statement.setString(13, usuario.getTitulo());
            statement.setString(14, usuario.getFechaIngreso());
            
            
            
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarUsuario(Usuario usuario) {
        String consulta = "UPDATE usuarios SET nombres = ?, apellidos = ?, fechaNacimiento = ?,"
        		+ " rut = ?, telefono = ?, afp = ?, sistemaSalud = ?, direccion = ?,"
        		+ " comuna = ?, area = ?, experienciaPrevia = ?, titulo = ?, fechaIngreso = ?"
        		+ "   WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario.getNombres());
            statement.setString(2, usuario.getApellidos());
            statement.setString(3, usuario.getFechaNacimiento());
            statement.setInt(4, usuario.getRut());
            statement.setString(5, usuario.getTelefono());
            statement.setString(6, usuario.getAfp());
            statement.setString(7, usuario.getSistemaSalud());
            statement.setString(8, usuario.getDireccion());
            statement.setString(9, usuario.getComuna());
            statement.setString(10, usuario.getArea());
            statement.setString(11, usuario.getExperienciaPrevia());
            statement.setString(12, usuario.getTitulo());
            statement.setString(13, usuario.getFechaIngreso());
            statement.setInt(14, usuario.getId());
            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarUsuario(int id) {
        String consulta = "DELETE FROM usuarios WHERE id = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
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
