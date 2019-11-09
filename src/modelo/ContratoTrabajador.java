package modelo;

import java.sql.Date;

public class ContratoTrabajador {
	private int claveTrabajador;
	private Date fechaInicioTrabajador;
	private Date fechaFinTrabajador;
	private String puestoTrabajador;
	private int sueldoTrabajador;
	private String numeroSSTrabajador;
	private int clavePersona;
	
	public ContratoTrabajador() {
		
	}
	
	public ContratoTrabajador(int claveTrabajador, Date fechaInicioTrabajador, Date fechaFinTrabajador,
			String puestoTrabajador, int sueldoTrabajador, String numeroSSTrabajador, int clavePersona) {
		super();
		this.claveTrabajador = claveTrabajador;
		this.fechaInicioTrabajador = fechaInicioTrabajador;
		this.fechaFinTrabajador = fechaFinTrabajador;
		this.puestoTrabajador = puestoTrabajador;
		this.sueldoTrabajador = sueldoTrabajador;
		this.numeroSSTrabajador = numeroSSTrabajador;
		this.clavePersona = clavePersona;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}

	public Date getFechaInicioTrabajador() {
		return fechaInicioTrabajador;
	}

	public void setFechaInicioTrabajador(Date fechaInicioTrabajador) {
		this.fechaInicioTrabajador = fechaInicioTrabajador;
	}

	public Date getFechaFinTrabajador() {
		return fechaFinTrabajador;
	}

	public void setFechaFinTrabajador(Date fechaFinTrabajador) {
		this.fechaFinTrabajador = fechaFinTrabajador;
	}

	public String getPuestoTrabajador() {
		return puestoTrabajador;
	}

	public void setPuestoTrabajador(String puestoTrabajador) {
		this.puestoTrabajador = puestoTrabajador;
	}

	public int getSueldoTrabajador() {
		return sueldoTrabajador;
	}

	public void setSueldoTrabajador(int sueldoTrabajador) {
		this.sueldoTrabajador = sueldoTrabajador;
	}

	public String getNumeroSSTrabajador() {
		return numeroSSTrabajador;
	}

	public void setNumeroSSTrabajador(String numeroSSTrabajador) {
		this.numeroSSTrabajador = numeroSSTrabajador;
	}

	public int getClavePersona() {
		return clavePersona;
	}

	public void setClavePersona(int clavePersona) {
		this.clavePersona = clavePersona;
	}
}
