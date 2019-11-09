package modelo;

import java.sql.Date;

public class TrabajadorActividad {
	private int claveTrabajadorAct;
	private int cantidadTrabajadorAct;
	private Date fechaTrabajadorAct;
	private int activityNumber;
	
	public TrabajadorActividad() {
		
	}
	
	public TrabajadorActividad(int claveTrabajadorAct, int cantidadTrabajadorAct, Date fechaTrabajadorAct,
			int activityNumber) {
		super();
		this.claveTrabajadorAct = claveTrabajadorAct;
		this.cantidadTrabajadorAct = cantidadTrabajadorAct;
		this.fechaTrabajadorAct = fechaTrabajadorAct;
		this.activityNumber = activityNumber;
	}

	public int getClaveTrabajadorAct() {
		return claveTrabajadorAct;
	}

	public void setClaveTrabajadorAct(int claveTrabajadorAct) {
		this.claveTrabajadorAct = claveTrabajadorAct;
	}

	public int getCantidadTrabajadorAct() {
		return cantidadTrabajadorAct;
	}

	public void setCantidadTrabajadorAct(int cantidadTrabajadorAct) {
		this.cantidadTrabajadorAct = cantidadTrabajadorAct;
	}

	public Date getFechaTrabajadorAct() {
		return fechaTrabajadorAct;
	}

	public void setFechaTrabajadorAct(Date fechaTrabajadorAct) {
		this.fechaTrabajadorAct = fechaTrabajadorAct;
	}

	public int getActivityNumber() {
		return activityNumber;
	}

	public void setActivityNumber(int activityNumber) {
		this.activityNumber = activityNumber;
	}
}
