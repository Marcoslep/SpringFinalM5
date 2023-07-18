package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.AsesoriasPrevencionRiesgos.conexion.UsuarioDAO;


/**
 * Servlet implementation class EliminarUsuario
 */
@WebServlet("/EliminarUsuario")
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuario() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession validarSesion = request.getSession();
		if (validarSesion.getAttribute("usuario") != null) {
		
        int id = Integer.parseInt(request.getParameter("id"));

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        usuarioDAO.eliminarUsuario(id);

        response.sendRedirect("ListarUsuarios");
		}
		
		else {
			
			response.sendRedirect("Login");
		}
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
