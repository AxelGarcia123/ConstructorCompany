package modelo;

import java.sql.Date;

public class MaterialActividad {
	private int numMaterialAct;
	private Date fechaMaterialAct;
	private int cantidadMaterialAct;
	private int claveMaterial;
	private int claveActividad;
	
	public MaterialActividad() {
		
	}
	
	public MaterialActividad(int numMaterialAct, Date fechaMaterialAct, int cantidadMaterialAct, int claveMaterial,
			int claveActividad) {
		super();
		this.numMaterialAct = numMaterialAct;
		this.fechaMaterialAct = fechaMaterialAct;
		this.cantidadMaterialAct = cantidadMaterialAct;
		this.claveMaterial = claveMaterial;
		this.claveActividad = claveActividad;
	}

	public int getNumMaterialAct() {
		return numMaterialAct;
	}

	public void setNumMaterialAct(int numMaterialAct) {
		this.numMaterialAct = numMaterialAct;
	}

	public Date getFechaMaterialAct() {
		return fechaMaterialAct;
	}

	public void setFechaMaterialAct(Date fechaMaterialAct) {
		this.fechaMaterialAct = fechaMaterialAct;
	}

	public int getCantidadMaterialAct() {
		return cantidadMaterialAct;
	}

	public void setCantidadMaterialAct(int cantidadMaterialAct) {
		this.cantidadMaterialAct = cantidadMaterialAct;
	}

	public int getClaveMaterial() {
		return claveMaterial;
	}

	public void setClaveMaterial(int claveMaterial) {
		this.claveMaterial = claveMaterial;
	}

	public int getClaveActividad() {
		return claveActividad;
	}

	public void setClaveActividad(int claveActividad) {
		this.claveActividad = claveActividad;
	}
}
