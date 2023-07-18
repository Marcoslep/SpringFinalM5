package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.AsesoriasPrevencionRiesgos.conexion.UsuarioDAO;
import cl.AsesoriasPrevencionRiesgos.modelo.Usuario;

/**
 * Servlet implementation class ActualizarUsuario
 */
@WebServlet("/ActualizarUsuario")
public class ActualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("Login");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String tipoUsuario = request.getParameter("tipoUsuario");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String fechaNacimiento = request.getParameter("fechaNacimiento");
		int rut = Integer.parseInt(request.getParameter("rut"));
		//Atributos Cliente
		String telefono = request.getParameter("telefono");
		String afp = request.getParameter("afp");
		String sistemaSalud = request.getParameter("sistemaSalud");
		String direccion = request.getParameter("direccion");
		String comuna = request.getParameter("comuna");
		//Atributos Administrativo
		String area = request.getParameter("area");
		String experienciaPrevia = request.getParameter("experienciaPrevia");
		//Atributos Profesional
		String titulo = request.getParameter("titulo");
		String fechaIngreso = request.getParameter("fechaIngreso");
		
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setTipoUsuario(tipoUsuario);
		usuario.setNombres(nombres);
		usuario.setApellidos(apellidos);
		usuario.setFechaNacimiento(fechaNacimiento);
		usuario.setRut(rut);
		usuario.setTelefono(telefono);
		usuario.setAfp(afp);
		usuario.setSistemaSalud(sistemaSalud);
		usuario.setDireccion(direccion);
		usuario.setComuna(comuna);
		usuario.setArea(area);
		usuario.setExperienciaPrevia(experienciaPrevia);
		usuario.setTitulo(titulo);
		usuario.setFechaIngreso(fechaIngreso);
		
		
		UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
		usuarioDAO.actualizarUsuario(usuario);
		
		response.sendRedirect("ListarUsuarios");
		
	}

}
