package modelo;

import java.sql.Date;

public class EstadoCita {
	private int numEstado;
	private Date fechaEstado;
	private String causaEstado;
	private String statusEstado;
	private int claveCita;
	
	public EstadoCita() {
		
	}
	
	public EstadoCita(int numEstado, Date fechaEstado, String causaEstado, String statusEstado, int claveCita) {
		super();
		this.numEstado = numEstado;
		this.fechaEstado = fechaEstado;
		this.causaEstado = causaEstado;
		this.statusEstado = statusEstado;
		this.claveCita = claveCita;
	}

	public int getNumEstado() {
		return numEstado;
	}

	public void setNumEstado(int numEstado) {
		this.numEstado = numEstado;
	}

	public Date getFechaEstado() {
		return fechaEstado;
	}

	public void setFechaEstado(Date fechaEstado) {
		this.fechaEstado = fechaEstado;
	}

	public String getCausaEstado() {
		return causaEstado;
	}

	public void setCausaEstado(String causaEstado) {
		this.causaEstado = causaEstado;
	}

	public String getStatusEstado() {
		return statusEstado;
	}

	public void setStatusEstado(String statusEstado) {
		this.statusEstado = statusEstado;
	}

	public int getClaveCita() {
		return claveCita;
	}

	public void setClaveCita(int claveCita) {
		this.claveCita = claveCita;
	}
}
