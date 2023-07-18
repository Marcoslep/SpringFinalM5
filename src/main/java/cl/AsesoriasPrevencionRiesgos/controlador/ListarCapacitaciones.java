package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.AsesoriasPrevencionRiesgos.implementacion.CapacitacionImp;
import cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion;

/**
 * Servlet implementation class listarCapacitaciones
 */
@WebServlet("/ListarCapacitaciones")
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession validarSesion = request.getSession();
		if (validarSesion.getAttribute("usuario") != null) {
			
			CapacitacionImp capacitacionImp = CapacitacionImp.getInstancia();
	        
	        List<Capacitacion> capacitaciones = capacitacionImp.listaCapacitaciones();
	        
	        request.setAttribute("capacitaciones", capacitaciones);
			request.getRequestDispatcher("views/listadoCapacitaciones.jsp").forward(request, response);
		
		}
		else {
			
			response.sendRedirect("Login");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CapacitacionImp capacitacionImp = CapacitacionImp.getInstancia();
        
		List<Capacitacion> capacitaciones = capacitacionImp.listaCapacitaciones();
		
        request.setAttribute("capacitaciones", capacitaciones);
        
        request.getRequestDispatcher("views/listadoCapacitaciones.jsp").forward(request, response);
	
	
	}

}
