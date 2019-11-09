package modelo;

import java.sql.Date;

public class Persona {
	private int clavePer;
	private String apellidoPaternoPer;
	private String apellidoMaternoPer;
	private String nombrePer;
	private String callePer;
	private int numeroPer;
	private String orientacionPer;
	private String entreCallesPer;
	private String generoPer;
	private String estadoCivilPer;
	private String mailPer;
	private int telefono;
	private Date fechaNacimientoPer;
	private int claveColonia;
	
	public Persona() {
		
	}
	
	public Persona(int clavePer, String apellidoPaternoPer, String apellidoMaternoPer, String nombrePer,
			String callePer, int numeroPer, String orientacionPer, String entreCallesPer, String generoPer,
			String estadoCivilPer, String mailPer, int telefono, Date fechaNacimientoPer, int claveColonia) {
		super();
		this.clavePer = clavePer;
		this.apellidoPaternoPer = apellidoPaternoPer;
		this.apellidoMaternoPer = apellidoMaternoPer;
		this.nombrePer = nombrePer;
		this.callePer = callePer;
		this.numeroPer = numeroPer;
		this.orientacionPer = orientacionPer;
		this.entreCallesPer = entreCallesPer;
		this.generoPer = generoPer;
		this.estadoCivilPer = estadoCivilPer;
		this.mailPer = mailPer;
		this.telefono = telefono;
		this.fechaNacimientoPer = fechaNacimientoPer;
		this.claveColonia = claveColonia;
	}

	public int getClavePer() {
		return clavePer;
	}

	public void setClavePer(int clavePer) {
		this.clavePer = clavePer;
	}

	public String getApellidoPaternoPer() {
		return apellidoPaternoPer;
	}

	public void setApellidoPaternoPer(String apellidoPaternoPer) {
		this.apellidoPaternoPer = apellidoPaternoPer;
	}

	public String getApellidoMaternoPer() {
		return apellidoMaternoPer;
	}

	public void setApellidoMaternoPer(String apellidoMaternoPer) {
		this.apellidoMaternoPer = apellidoMaternoPer;
	}

	public String getNombrePer() {
		return nombrePer;
	}

	public void setNombrePer(String nombrePer) {
		this.nombrePer = nombrePer;
	}

	public String getCallePer() {
		return callePer;
	}

	public void setCallePer(String callePer) {
		this.callePer = callePer;
	}

	public int getNumeroPer() {
		return numeroPer;
	}

	public void setNumeroPer(int numeroPer) {
		this.numeroPer = numeroPer;
	}

	public String getOrientacionPer() {
		return orientacionPer;
	}

	public void setOrientacionPer(String orientacionPer) {
		this.orientacionPer = orientacionPer;
	}

	public String getEntreCallesPer() {
		return entreCallesPer;
	}

	public void setEntreCallesPer(String entreCallesPer) {
		this.entreCallesPer = entreCallesPer;
	}

	public String getGeneroPer() {
		return generoPer;
	}

	public void setGeneroPer(String generoPer) {
		this.generoPer = generoPer;
	}

	public String getEstadoCivilPer() {
		return estadoCivilPer;
	}

	public void setEstadoCivilPer(String estadoCivilPer) {
		this.estadoCivilPer = estadoCivilPer;
	}

	public String getMailPer() {
		return mailPer;
	}

	public void setMailPer(String mailPer) {
		this.mailPer = mailPer;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimientoPer() {
		return fechaNacimientoPer;
	}

	public void setFechaNacimientoPer(Date fechaNacimientoPer) {
		this.fechaNacimientoPer = fechaNacimientoPer;
	}

	public int getClaveColonia() {
		return claveColonia;
	}

	public void setClaveColonia(int claveColonia) {
		this.claveColonia = claveColonia;
	}
}
