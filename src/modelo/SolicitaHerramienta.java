package modelo;

import java.sql.Date;

public class SolicitaHerramienta {
	private int claveSolicita;
	private Date fechaSolicita;
	private int cantidadSolicita;
	private Date fechaEsperaSolicita;
	private int claveMaterial;
	private int claveContrato;
	private int claveTrabajador;
	
	public SolicitaHerramienta() {
		
	}
	
	public SolicitaHerramienta(int claveSolicita, Date fechaSolicita, int cantidadSolicita, Date fechaEsperaSolicita,
			int claveMaterial, int claveContrato, int claveTrabajador) {
		super();
		this.claveSolicita = claveSolicita;
		this.fechaSolicita = fechaSolicita;
		this.cantidadSolicita = cantidadSolicita;
		this.fechaEsperaSolicita = fechaEsperaSolicita;
		this.claveMaterial = claveMaterial;
		this.claveContrato = claveContrato;
		this.claveTrabajador = claveTrabajador;
	}

	public int getClaveSolicita() {
		return claveSolicita;
	}

	public void setClaveSolicita(int claveSolicita) {
		this.claveSolicita = claveSolicita;
	}

	public Date getFechaSolicita() {
		return fechaSolicita;
	}

	public void setFechaSolicita(Date fechaSolicita) {
		this.fechaSolicita = fechaSolicita;
	}

	public int getCantidadSolicita() {
		return cantidadSolicita;
	}

	public void setCantidadSolicita(int cantidadSolicita) {
		this.cantidadSolicita = cantidadSolicita;
	}

	public Date getFechaEsperaSolicita() {
		return fechaEsperaSolicita;
	}

	public void setFechaEsperaSolicita(Date fechaEsperaSolicita) {
		this.fechaEsperaSolicita = fechaEsperaSolicita;
	}

	public int getClaveMaterial() {
		return claveMaterial;
	}

	public void setClaveMaterial(int claveMaterial) {
		this.claveMaterial = claveMaterial;
	}

	public int getClaveContrato() {
		return claveContrato;
	}

	public void setClaveContrato(int claveContrato) {
		this.claveContrato = claveContrato;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}
