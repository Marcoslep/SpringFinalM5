package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion;
import cl.AsesoriasPrevencionRiesgos.implementacion.CapacitacionImp;

/**
 * Servlet implementation class EliminarCapacitacion
 */
@WebServlet("/EliminarCapacitacion")
public class EliminarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCapacitacion() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession validarSesion = request.getSession();
		if (validarSesion.getAttribute("usuario") != null) {
		
	    int id = Integer.parseInt(request.getParameter("id"));

	    CapacitacionImp capacitacionImp = CapacitacionImp.getInstancia();
	    capacitacionImp.eliminarCapacitacion(id);
	    response.sendRedirect("ListarCapacitaciones");
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
