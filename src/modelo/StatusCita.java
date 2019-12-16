package modelo;

import java.sql.Date;

public class StatusCita {
	private int numStatus;
	private Date fechaStatus;
	private String statusStatus;
	private String causaStatus;
	private int claveCita;
	
	public StatusCita() {
		
	}
	
	public StatusCita(int numStatus, Date fechaStatus, String statusStatus, String causaStatus, int claveCita) {
		super();
		this.numStatus = numStatus;
		this.fechaStatus = fechaStatus;
		this.statusStatus = statusStatus;
		this.causaStatus = causaStatus;
		this.claveCita = claveCita;
	}

	public int getNumStatus() {
		return numStatus;
	}
	public void setNumStatus(int numStatus) {
		this.numStatus = numStatus;
	}
	public Date getFechaStatus() {
		return fechaStatus;
	}
	public void setFechaStatus(Date fechaStatus) {
		this.fechaStatus = fechaStatus;
	}
	public String getStatusStatus() {
		return statusStatus;
	}
	public void setStatusStatus(String statusStatus) {
		this.statusStatus = statusStatus;
	}
	public String getCausaStatus() {
		return causaStatus;
	}
	public void setCausaStatus(String causaStatus) {
		this.causaStatus = causaStatus;
	}
	public int getClaveCita() {
		return claveCita;
	}
	public void setClaveCita(int claveCita) {
		this.claveCita = claveCita;
	}
}