package modelo;

import java.sql.Date;

public class Anticipo {
	private int claveAnticipo;
	private Date fechaAnticipo;
	private String tipoAnticipo;
	private int montoAnticipo;
	private int contractKey;
	
	public Anticipo(int claveAnticipo, Date fechaAnticipo, String tipoAnticipo, int montoAnticipo, int contractKey) {
		super();
		this.claveAnticipo = claveAnticipo;
		this.fechaAnticipo = fechaAnticipo;
		this.tipoAnticipo = tipoAnticipo;
		this.montoAnticipo = montoAnticipo;
		this.contractKey = contractKey;
	}
	
	public Anticipo() {
		
	}

	public int getClaveAnticipo() {
		return claveAnticipo;
	}

	public void setClaveAnticipo(int claveAnticipo) {
		this.claveAnticipo = claveAnticipo;
	}

	public Date getFechaAnticipo() {
		return fechaAnticipo;
	}

	public void setFechaAnticipo(Date fechaAnticipo) {
		this.fechaAnticipo = fechaAnticipo;
	}

	public String getTipoAnticipo() {
		return tipoAnticipo;
	}

	public void setTipoAnticipo(String tipoAnticipo) {
		this.tipoAnticipo = tipoAnticipo;
	}

	public int getMontoAnticipo() {
		return montoAnticipo;
	}

	public void setMontoAnticipo(int montoAnticipo) {
		this.montoAnticipo = montoAnticipo;
	}

	public int getContractKey() {
		return contractKey;
	}

	public void setContractKey(int contractKey) {
		this.contractKey = contractKey;
	}
}