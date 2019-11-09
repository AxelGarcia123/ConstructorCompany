package modelo;

import java.sql.Date;

public class CantidadProyecto {
	private int claveCantidad;
	private int cantidadCantidad;
	private Date fechaCantidad;
	private int claveTrabajador;
	
	public CantidadProyecto() {
		
	}
	
	public CantidadProyecto(int claveCantidad, int cantidadCantidad, Date fechaCantidad, int claveTrabajador) {
		super();
		this.claveCantidad = claveCantidad;
		this.cantidadCantidad = cantidadCantidad;
		this.fechaCantidad = fechaCantidad;
		this.claveTrabajador = claveTrabajador;
	}

	public int getClaveCantidad() {
		return claveCantidad;
	}

	public void setClaveCantidad(int claveCantidad) {
		this.claveCantidad = claveCantidad;
	}

	public int getCantidadCantidad() {
		return cantidadCantidad;
	}

	public void setCantidadCantidad(int cantidadCantidad) {
		this.cantidadCantidad = cantidadCantidad;
	}

	public Date getFechaCantidad() {
		return fechaCantidad;
	}

	public void setFechaCantidad(Date fechaCantidad) {
		this.fechaCantidad = fechaCantidad;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	} 
}