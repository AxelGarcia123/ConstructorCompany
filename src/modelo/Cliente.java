package modelo;

import java.sql.Date;

public class Cliente {
	private int claveCliente;
	private Date fechaCliente;
	private int clavePersona;
	
	public Cliente() {
		
	}
	
	public Cliente(int claveCliente, Date fechaCliente, int clavePersona) {
		super();
		this.claveCliente = claveCliente;
		this.fechaCliente = fechaCliente;
		this.clavePersona = clavePersona;
	}

	public int getClaveCliente() {
		return claveCliente;
	}

	public void setClaveCliente(int claveCliente) {
		this.claveCliente = claveCliente;
	}

	public Date getFechaCliente() {
		return fechaCliente;
	}

	public void setFechaCliente(Date fechaCliente) {
		this.fechaCliente = fechaCliente;
	}

	public int getClavePersona() {
		return clavePersona;
	}

	public void setClavePersona(int clavePersona) {
		this.clavePersona = clavePersona;
	}
}
