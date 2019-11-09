package modelo;

import java.sql.Date;

public class Avance {
	private int numeroAvance;
	private Date fechaAvance;
	private int cantidadAvance;
	private String unidadMedidaAvance;
	private int claveTrabajadorActividad;
	
	public Avance() {
		
	}
	
	public Avance(int numeroAvance, Date fechaAvance, int cantidadAvance, String unidadMedidaAvance,
			int claveTrabajadorActividad) {
		super();
		this.numeroAvance = numeroAvance;
		this.fechaAvance = fechaAvance;
		this.cantidadAvance = cantidadAvance;
		this.unidadMedidaAvance = unidadMedidaAvance;
		this.claveTrabajadorActividad = claveTrabajadorActividad;
	}

	public int getNumeroAvance() {
		return numeroAvance;
	}

	public void setNumeroAvance(int numeroAvance) {
		this.numeroAvance = numeroAvance;
	}

	public Date getFechaAvance() {
		return fechaAvance;
	}

	public void setFechaAvance(Date fechaAvance) {
		this.fechaAvance = fechaAvance;
	}

	public int getCantidadAvance() {
		return cantidadAvance;
	}

	public void setCantidadAvance(int cantidadAvance) {
		this.cantidadAvance = cantidadAvance;
	}

	public String getUnidadMedidaAvance() {
		return unidadMedidaAvance;
	}

	public void setUnidadMedidaAvance(String unidadMedidaAvance) {
		this.unidadMedidaAvance = unidadMedidaAvance;
	}

	public int getClaveTrabajadorActividad() {
		return claveTrabajadorActividad;
	}

	public void setClaveTrabajadorActividad(int claveTrabajadorActividad) {
		this.claveTrabajadorActividad = claveTrabajadorActividad;
	}
	
}