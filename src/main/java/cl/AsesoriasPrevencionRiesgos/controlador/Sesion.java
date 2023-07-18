package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
@WebServlet("/Sesion")
public class Sesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sesion() {
        super();
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
		
		String usuario =request.getParameter("usuario");
		String contraseña =request.getParameter("contraseña");
		
		if (usuario.equals("admin") && contraseña.equals("1234")) {
            // Autenticación exitosa, redirigir a la página de inicio
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario", usuario);
			sesion.setAttribute("contraseña", contraseña);
			request.getRequestDispatcher("views/formularioContacto.jsp").forward(request, response);
			
        } else {
            // Autenticación fallida, redirigir al formulario de inicio de sesión
            response.sendRedirect("Login");
            
            
        }
		
		
	}

}
