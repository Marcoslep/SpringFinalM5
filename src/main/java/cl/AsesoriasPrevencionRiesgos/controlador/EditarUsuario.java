package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.AsesoriasPrevencionRiesgos.conexion.UsuarioDAO;
import cl.AsesoriasPrevencionRiesgos.modelo.Usuario;
/**
 * Servlet implementation class EditarUsuario
 */
@WebServlet("/EditarUsuario")
public class EditarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession validarSesion = request.getSession();
		if (validarSesion.getAttribute("usuario") != null) {

        int id = Integer.parseInt(request.getParameter("id"));
        String tipoUsuario = request.getParameter("tipoUsuario");

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        Usuario usuario = usuarioDAO.obtenerUsuarioPorId(id);

        request.setAttribute("usuario", usuario);
        if (tipoUsuario.equals("Cliente")) {
        request.getRequestDispatcher("views/editarCliente.jsp").forward(request, response);
        }
        else if (tipoUsuario.equals("Administrativo")) {
        	request.getRequestDispatcher("views/editarAdministrativo.jsp").forward(request, response);
        }
        else if (tipoUsuario.equals("Profesional")) {
        	request.getRequestDispatcher("views/editarProfesional.jsp").forward(request, response);
        }
        
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
