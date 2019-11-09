package modelo;

import java.sql.Date;

public class StatusTrabajador {
	private int claveStatusTra;
	private Date fechaStatusTra;
	private String statusStatusTra;
	private int claveTrabajador;
	
	public StatusTrabajador() {
		
	}
	
	public StatusTrabajador(int claveStatusTra, Date fechaStatusTra, String statusStatusTra, int claveTrabajador) {
		super();
		this.claveStatusTra = claveStatusTra;
		this.fechaStatusTra = fechaStatusTra;
		this.statusStatusTra = statusStatusTra;
		this.claveTrabajador = claveTrabajador;
	}

	public int getClaveStatusTra() {
		return claveStatusTra;
	}

	public void setClaveStatusTra(int claveStatusTra) {
		this.claveStatusTra = claveStatusTra;
	}

	public Date getFechaStatusTra() {
		return fechaStatusTra;
	}

	public void setFechaStatusTra(Date fechaStatusTra) {
		this.fechaStatusTra = fechaStatusTra;
	}

	public String getStatusStatusTra() {
		return statusStatusTra;
	}

	public void setStatusStatusTra(String statusStatusTra) {
		this.statusStatusTra = statusStatusTra;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}
