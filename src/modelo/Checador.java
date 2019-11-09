package modelo;

import java.sql.Date;

public class Checador {
	private int claveCheck;
	private Date fechaCheck;
	private String horaEntradaCheck;
	private String horaSalidaCheck;
	private int claveTrabajador;
	
	public Checador() {
		
	}
	
	public Checador(int claveCheck, Date fechaCheck, String horaEntradaCheck, String horaSalidaCheck,
			int claveTrabajador) {
		super();
		this.claveCheck = claveCheck;
		this.fechaCheck = fechaCheck;
		this.horaEntradaCheck = horaEntradaCheck;
		this.horaSalidaCheck = horaSalidaCheck;
		this.claveTrabajador = claveTrabajador;
	}

	public int getClaveCheck() {
		return claveCheck;
	}

	public void setClaveCheck(int claveCheck) {
		this.claveCheck = claveCheck;
	}

	public Date getFechaCheck() {
		return fechaCheck;
	}

	public void setFechaCheck(Date fechaCheck) {
		this.fechaCheck = fechaCheck;
	}

	public String getHoraEntradaCheck() {
		return horaEntradaCheck;
	}

	public void setHoraEntradaCheck(String horaEntradaCheck) {
		this.horaEntradaCheck = horaEntradaCheck;
	}

	public String getHoraSalidaCheck() {
		return horaSalidaCheck;
	}

	public void setHoraSalidaCheck(String horaSalidaCheck) {
		this.horaSalidaCheck = horaSalidaCheck;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}