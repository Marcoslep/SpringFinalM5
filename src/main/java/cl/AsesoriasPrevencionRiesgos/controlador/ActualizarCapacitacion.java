package cl.AsesoriasPrevencionRiesgos.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cl.AsesoriasPrevencionRiesgos.implementacion.CapacitacionImp;
import cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion;

/**
 * Servlet implementation class ActualizarCapacitacion
 */
@WebServlet("/ActualizarCapacitacion")
public class ActualizarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarCapacitacion() {
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
	    String titulo = request.getParameter("titulo");
	    int rutCliente = Integer.parseInt(request.getParameter("rutCliente"));
	    String hora = request.getParameter("hora");
	    String fecha = request.getParameter("fecha");
	    int duracion = Integer.parseInt(request.getParameter("duracion"));
	    String ubicacion = request.getParameter("ubicacion");
	    int cantAsistentes = Integer.parseInt(request.getParameter("cantAsistentes"));
	    String descripcion = request.getParameter("descripcion");
	    
	    Capacitacion capacitacion = new Capacitacion();
	    capacitacion.setId(id);
	    capacitacion.setTitulo(titulo);
	    capacitacion.setRutCliente(rutCliente);
	    capacitacion.setFecha(fecha);
	    capacitacion.setHora(hora);
	    capacitacion.setUbicacion(ubicacion);
	    capacitacion.setDuracion(duracion);
	    capacitacion.setCantAsistentes(cantAsistentes);
	    capacitacion.setDescripcion(descripcion);
	    
	    CapacitacionImp capacitacionImp = CapacitacionImp.getInstancia();
	    capacitacionImp.actualizarCapacitacion(capacitacion);
	    
        response.sendRedirect("ListarCapacitaciones");
	}

}
