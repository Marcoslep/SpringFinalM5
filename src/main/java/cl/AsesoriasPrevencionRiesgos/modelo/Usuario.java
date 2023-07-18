package cl.AsesoriasPrevencionRiesgos.modelo;

public class Usuario {
	
	protected int id;
	protected String tipoUsuario;
	protected String nombres;
	protected String apellidos;
	protected String fechaNacimiento; // DD-MM-AAAA
	protected int rut; //Numero menor a 99.999.999
	protected String telefono;
	protected String afp; 
	protected String sistemaSalud; // 1 (Fonasa) o 2 (Isapre)
	protected String direccion;
	protected String comuna;
	protected String area;
	protected String experienciaPrevia;
	protected String titulo;
	protected String fechaIngreso;
	
	
	//Getters y setters
	public Usuario() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	//Constructores
	public Usuario(int id, String tipoUsuario, String nombres, String apellidos, String fechaNacimiento, int rut,
			String telefono, String afp, String sistemaSalud, String direccion, String comuna, String area,
			String experienciaPrevia, String titulo, String fechaIngreso) {
		super();
		this.id = id;
		this.tipoUsuario = tipoUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}


	//Metodo toString
	public String toString() {
		return "Usuario [id=" + id + ", tipoUsuario=" + tipoUsuario + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", titulo=" + titulo
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}


}
