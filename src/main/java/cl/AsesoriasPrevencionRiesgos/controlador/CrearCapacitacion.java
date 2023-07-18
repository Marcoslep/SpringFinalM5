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
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession validarSesion = request.getSession();
		if (validarSesion.getAttribute("usuario") != null) {
			request.getRequestDispatcher("/views/formularioCapacitacion.jsp").forward(request, response);
		
		}
		else {
			
			response.sendRedirect("Login");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String titulo = request.getParameter("titulo");
	    int rutCliente = Integer.parseInt(request.getParameter("rutCliente"));
	    String hora = request.getParameter("hora");
	    String fecha = request.getParameter("fecha");
	    int duracion = Integer.parseInt(request.getParameter("duracion"));
	    String ubicacion = request.getParameter("ubicacion");
	    int cantAsistentes = Integer.parseInt(request.getParameter("cantAsistentes"));
	    String descripcion = request.getParameter("descripcion"); 
	    
	    Capacitacion capacitacion = new Capacitacion();
	    capacitacion.setTitulo(titulo);
	    capacitacion.setRutCliente(rutCliente);
	    capacitacion.setFecha(fecha);
	    capacitacion.setHora(hora);
	    capacitacion.setUbicacion(ubicacion);
	    capacitacion.setDuracion(duracion);
	    capacitacion.setCantAsistentes(cantAsistentes);
	    capacitacion.setDescripcion(descripcion);
	    
	    CapacitacionImp capacitacionImp = CapacitacionImp.getInstancia();
	    capacitacionImp.registraCapacitacion(capacitacion);
	    
	    request.getSession().setAttribute("capacitacionGuardada", true);
	    
        response.sendRedirect("ListarCapacitaciones");
		
	}

}
