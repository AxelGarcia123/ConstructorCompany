package modelo;

import java.sql.Date;

public class Precio {
	private int clavePrecio;
	private Date fechaPrecio;
	private int precioPrecio;
	private int claveActividad;
	
	public Precio() {
		
	}
	
	public Precio(int clavePrecio, Date fechaPrecio, int precioPrecio, int claveActividad) {
		super();
		this.clavePrecio = clavePrecio;
		this.fechaPrecio = fechaPrecio;
		this.precioPrecio = precioPrecio;
		this.claveActividad = claveActividad;
	}

	public int getClavePrecio() {
		return clavePrecio;
	}

	public void setClavePrecio(int clavePrecio) {
		this.clavePrecio = clavePrecio;
	}

	public Date getFechaPrecio() {
		return fechaPrecio;
	}

	public void setFechaPrecio(Date fechaPrecio) {
		this.fechaPrecio = fechaPrecio;
	}

	public int getPrecioPrecio() {
		return precioPrecio;
	}

	public void setPrecioPrecio(int precioPrecio) {
		this.precioPrecio = precioPrecio;
	}

	public int getClaveActividad() {
		return claveActividad;
	}

	public void setClaveActividad(int claveActividad) {
		this.claveActividad = claveActividad;
	}
}
