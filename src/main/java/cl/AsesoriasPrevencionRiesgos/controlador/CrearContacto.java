package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.AsesoriasPrevencionRiesgos.conexion.ContactoDAO;
import cl.AsesoriasPrevencionRiesgos.conexion.UsuarioDAO;
import cl.AsesoriasPrevencionRiesgos.modelo.Contacto;
import cl.AsesoriasPrevencionRiesgos.modelo.Usuario;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class CrearContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession validarSesion = request.getSession();
		if (validarSesion.getAttribute("usuario") != null) {
			request.getRequestDispatcher("views/formularioContacto.jsp").forward(request, response);
		
		}
		else {
			
			response.sendRedirect("Login");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String nombre = request.getParameter("nombre");
	    String correo = request.getParameter("correo");
	    String mensaje = request.getParameter("mensaje");

	    request.setAttribute("nombre", nombre);
		request.setAttribute("correo", correo);
		request.setAttribute("mensaje", mensaje);
		
		Contacto contacto = new Contacto();
		contacto.setNombre(nombre);
		contacto.setCorreo(correo);
		contacto.setMensaje(mensaje);
		
		ContactoDAO contactoDAO = ContactoDAO.getInstancia();
		contactoDAO.enviarContacto(contacto);

		request.getRequestDispatcher("views/guardarContacto.jsp").forward(request, response);
		
		
	}

}
