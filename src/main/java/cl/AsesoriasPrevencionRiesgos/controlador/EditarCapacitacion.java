package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.AsesoriasPrevencionRiesgos.implementacion.CapacitacionImp;
import cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion;

/**
 * Servlet implementation class EditarCapacitacion
 */
@WebServlet("/EditarCapacitacion")
public class EditarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCapacitacion() {
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

        CapacitacionImp capacitacionImp = CapacitacionImp.getInstancia();
        Capacitacion capacitacion = capacitacionImp.listarCapacitacionPorId(id);

        request.setAttribute("capacitacion", capacitacion);
        request.getRequestDispatcher("views/editarCapacitacion.jsp").forward(request, response);
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
