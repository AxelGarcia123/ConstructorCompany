package modelo;

import java.sql.Date;

public class Resurtir {
	private int numResurtir;
	private Date fechaResurtir;
	private Date fechaCadResurtir;
	private int precioPorUnidadResurtir;
	private int bajaResurtir;
	private int claveMaterial;
	
	public Resurtir() {
		
	}
	
	public Resurtir(int numResurtir, Date fechaResurtir, Date fechaCadResurtir, int precioPorUnidadResurtir,
			int bajaResurtir, int claveMaterial) {
		super();
		this.numResurtir = numResurtir;
		this.fechaResurtir = fechaResurtir;
		this.fechaCadResurtir = fechaCadResurtir;
		this.precioPorUnidadResurtir = precioPorUnidadResurtir;
		this.bajaResurtir = bajaResurtir;
		this.claveMaterial = claveMaterial;
	}

	public int getNumResurtir() {
		return numResurtir;
	}

	public void setNumResurtir(int numResurtir) {
		this.numResurtir = numResurtir;
	}

	public Date getFechaResurtir() {
		return fechaResurtir;
	}

	public void setFechaResurtir(Date fechaResurtir) {
		this.fechaResurtir = fechaResurtir;
	}

	public Date getFechaCadResurtir() {
		return fechaCadResurtir;
	}

	public void setFechaCadResurtir(Date fechaCadResurtir) {
		this.fechaCadResurtir = fechaCadResurtir;
	}

	public int getPrecioPorUnidadResurtir() {
		return precioPorUnidadResurtir;
	}

	public void setPrecioPorUnidadResurtir(int precioPorUnidadResurtir) {
		this.precioPorUnidadResurtir = precioPorUnidadResurtir;
	}

	public int getBajaResurtir() {
		return bajaResurtir;
	}

	public void setBajaResurtir(int bajaResurtir) {
		this.bajaResurtir = bajaResurtir;
	}

	public int getClaveMaterial() {
		return claveMaterial;
	}

	public void setClaveMaterial(int claveMaterial) {
		this.claveMaterial = claveMaterial;
	}
}
