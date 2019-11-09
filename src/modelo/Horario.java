package modelo;

import java.sql.Date;

public class Horario {
	private int folioHora;
	private Date fechaHora;
	private int claveTrabajador;
	
	public Horario() {
		
	}
	
	public Horario(int folioHora, Date fechaHora, int claveTrabajador) {
		super();
		this.folioHora = folioHora;
		this.fechaHora = fechaHora;
		this.claveTrabajador = claveTrabajador;
	}

	public int getFolioHora() {
		return folioHora;
	}

	public void setFolioHora(int folioHora) {
		this.folioHora = folioHora;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}
