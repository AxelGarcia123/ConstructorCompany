package modelo;

import java.sql.Date;

public class Pago {
	private int folioPago;
	private Date fechaPago;
	private int montoPago;
	private int claveTrabajador;
	
	public Pago() {
		
	}
	
	public Pago(int folioPago, Date fechaPago, int montoPago, int claveTrabajador) {
		super();
		this.folioPago = folioPago;
		this.fechaPago = fechaPago;
		this.montoPago = montoPago;
		this.claveTrabajador = claveTrabajador;
	}

	public int getFolioPago() {
		return folioPago;
	}

	public void setFolioPago(int folioPago) {
		this.folioPago = folioPago;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public int getMontoPago() {
		return montoPago;
	}

	public void setMontoPago(int montoPago) {
		this.montoPago = montoPago;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}
