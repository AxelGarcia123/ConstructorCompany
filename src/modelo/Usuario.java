package modelo;

public class Usuario {
	private int claveUsuario;
	private String correoUsuario;
	private String contrasenia;
	private String nombreEmpleadoUsuario;
	private int claveTrabajador;
	
	public Usuario() {
		
	}
	
	public Usuario(int claveUsuario, String correoUsuario, String contrasenia, String nombreEmpleadoUsuario,
			int claveTrabajador) {
		super();
		this.claveUsuario = claveUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasenia = contrasenia;
		this.nombreEmpleadoUsuario = nombreEmpleadoUsuario;
		this.claveTrabajador = claveTrabajador;
	}

	public int getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(int claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombreEmpleadoUsuario() {
		return nombreEmpleadoUsuario;
	}

	public void setNombreEmpleadoUsuario(String nombreEmpleadoUsuario) {
		this.nombreEmpleadoUsuario = nombreEmpleadoUsuario;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}
