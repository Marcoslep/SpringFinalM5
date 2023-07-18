package cl.AsesoriasPrevencionRiesgos.modelo;

public class Contacto {
	
	String nombre;
	String correo;
	String mensaje;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	//Constructores
	public Contacto() {
		super();
	}
	
	public Contacto(String nombre, String correo, String mensaje) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.mensaje = mensaje;
	}
	
	//Metodo toString
	public String toString() {
		return "Contacto [nombre=" + nombre + ", correo=" + correo + ", mensaje=" + mensaje + "]";
	}
	
	
	
	

}
