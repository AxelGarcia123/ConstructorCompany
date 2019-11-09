package modelo;

import java.sql.Date;

public class Autorizacion {
	private int claveAutoriza;
	private Date fechaAutoriza;
	private String statusAutoriza;
	private int clavePermisoCont;
	
	public Autorizacion() {
		
	}
	
	public Autorizacion(int claveAutoriza, Date fechaAutoriza, String statusAutoriza, int clavePermisoCont) {
		super();
		this.claveAutoriza = claveAutoriza;
		this.fechaAutoriza = fechaAutoriza;
		this.statusAutoriza = statusAutoriza;
		this.clavePermisoCont = clavePermisoCont;
	}

	public int getClaveAutoriza() {
		return claveAutoriza;
	}

	public void setClaveAutoriza(int claveAutoriza) {
		this.claveAutoriza = claveAutoriza;
	}

	public Date getFechaAutoriza() {
		return fechaAutoriza;
	}

	public void setFechaAutoriza(Date fechaAutoriza) {
		this.fechaAutoriza = fechaAutoriza;
	}

	public String getStatusAutoriza() {
		return statusAutoriza;
	}

	public void setStatusAutoriza(String statusAutoriza) {
		this.statusAutoriza = statusAutoriza;
	}

	public int getClavePermisoCont() {
		return clavePermisoCont;
	}

	public void setClavePermisoCont(int clavePermisoCont) {
		this.clavePermisoCont = clavePermisoCont;
	}
}