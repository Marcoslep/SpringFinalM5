package cl.AsesoriasPrevencionRiesgos.interfaces;

import java.util.List;

import cl.AsesoriasPrevencionRiesgos.modelo.Capacitacion;

public interface ICapacitacion {
	
	public List<Capacitacion> listaCapacitaciones();
	
	public Capacitacion listarCapacitacionPorId(int id);
	
	public void registraCapacitacion(Capacitacion capacitacion);
	
	public void actualizarCapacitacion(Capacitacion capacitacion);
	
	public void eliminarCapacitacion(int id);

}
