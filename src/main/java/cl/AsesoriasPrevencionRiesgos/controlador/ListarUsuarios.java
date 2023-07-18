package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.AsesoriasPrevencionRiesgos.conexion.UsuarioDAO;
import cl.AsesoriasPrevencionRiesgos.modelo.Usuario;

/**
 * Servlet implementation class ListarUsuarios
 */
@WebServlet("/ListarUsuarios")
public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession validarSesion = request.getSession();
		if (validarSesion.getAttribute("usuario") != null) {
			UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
	        
			List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
	        
	        request.setAttribute("usuarios", usuarios);
	        request.getRequestDispatcher("views/listadoUsuarios.jsp").forward(request, response);
		
		}
		else {
			
			response.sendRedirect("Login");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        
		List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
        
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("views/listadoUsuarios.jsp").forward(request, response);
        
        
    }

}
