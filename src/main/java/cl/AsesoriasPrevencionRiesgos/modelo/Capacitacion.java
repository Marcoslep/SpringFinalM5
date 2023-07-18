package cl.AsesoriasPrevencionRiesgos.modelo;

public class Capacitacion {
	
	protected int id;
	protected String titulo;
	protected int rutCliente;
	protected String fecha;
	protected String hora;
	protected String ubicacion;
	protected int duracion;
	protected int cantAsistentes;
	protected String descripcion;
	
	// Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getCantAsistentes() {
		return cantAsistentes;
	}
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	//Constructores
	public Capacitacion() {
		super();
	}
	
	public Capacitacion(int id, String titulo, int rutCliente, String fecha, String hora, String ubicacion, int duracion,
			int cantAsistentes, String descripcion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.rutCliente = rutCliente;
		this.fecha = fecha;
		this.hora = hora;
		this.ubicacion = ubicacion;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
		this.descripcion = descripcion;
	}
	
	// Metodo toString
	public String toString() {
		return "Capacitacion [id=" + id + ", titulo=" + titulo + ", rutCliente=" + rutCliente + ", fecha=" + fecha
				+ ", hora=" + hora + ", ubicacion=" + ubicacion + ", duracion=" + duracion + ", cantAsistentes="
				+ cantAsistentes + ", descripcion=" + descripcion + "]";
	}
	
	

}
