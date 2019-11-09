package modelo;

import java.sql.Date;

public class StatusSolicitudHerramienta {
	private int claveStatus;
	private Date fechaStatus;
	private String statusStatus;
	private String causaStatus;
	private int claveSolicita;
	
	public StatusSolicitudHerramienta() {
		
	}
	
	public StatusSolicitudHerramienta(int claveStatus, Date fechaStatus, String statusStatus, String causaStatus,
			int claveSolicita) {
		super();
		this.claveStatus = claveStatus;
		this.fechaStatus = fechaStatus;
		this.statusStatus = statusStatus;
		this.causaStatus = causaStatus;
		this.claveSolicita = claveSolicita;
	}

	public int getClaveStatus() {
		return claveStatus;
	}

	public void setClaveStatus(int claveStatus) {
		this.claveStatus = claveStatus;
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

	public int getClaveSolicita() {
		return claveSolicita;
	}

	public void setClaveSolicita(int claveSolicita) {
		this.claveSolicita = claveSolicita;
	}
}
