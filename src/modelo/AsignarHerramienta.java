package modelo;

import java.sql.Date;

public class AsignarHerramienta {
	private int numeroAsigna;
	private Date fechaAsigna;
	private int cantidadAsigna;
	private int claveMaterial;
	private int claveContrato;
	
	public AsignarHerramienta() {
		
	}
	
	public AsignarHerramienta(int numeroAsigna, Date fechaAsigna, int cantidadAsigna, int claveMaterial,
			int claveContrato) {
		super();
		this.numeroAsigna = numeroAsigna;
		this.fechaAsigna = fechaAsigna;
		this.cantidadAsigna = cantidadAsigna;
		this.claveMaterial = claveMaterial;
		this.claveContrato = claveContrato;
	}

	public int getNumeroAsigna() {
		return numeroAsigna;
	}

	public void setNumeroAsigna(int numeroAsigna) {
		this.numeroAsigna = numeroAsigna;
	}

	public Date getFechaAsigna() {
		return fechaAsigna;
	}

	public void setFechaAsigna(Date fechaAsigna) {
		this.fechaAsigna = fechaAsigna;
	}

	public int getCantidadAsigna() {
		return cantidadAsigna;
	}

	public void setCantidadAsigna(int cantidadAsigna) {
		this.cantidadAsigna = cantidadAsigna;
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
}