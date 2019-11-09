package modelo;

import java.sql.Date;
import java.sql.Time;

public class Cita {
	private int claveCita;
	private Date fechaCita;
	private Time horaInicioCita;
	private Time horaFinCita;
	private String calleCita;
	private int numeroCita;
	private String orientacionCita;
	private int claveColonia;
	private int claveCliente;
	private int claveTrabajador;
	
	public Cita() {
		
	}
	
	public Cita(int claveCita, Date fechaCita, Time horaInicioCita, Time horaFinCita, String calleCita, int numeroCita,
			String orientacionCita, int claveColonia, int claveCliente, int claveTrabajador) {
		super();
		this.claveCita = claveCita;
		this.fechaCita = fechaCita;
		this.horaInicioCita = horaInicioCita;
		this.horaFinCita = horaFinCita;
		this.calleCita = calleCita;
		this.numeroCita = numeroCita;
		this.orientacionCita = orientacionCita;
		this.claveColonia = claveColonia;
		this.claveCliente = claveCliente;
		this.claveTrabajador = claveTrabajador;
	}

	public int getClaveCita() {
		return claveCita;
	}

	public void setClaveCita(int claveCita) {
		this.claveCita = claveCita;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Time getHoraInicioCita() {
		return horaInicioCita;
	}

	public void setHoraInicioCita(Time horaInicioCita) {
		this.horaInicioCita = horaInicioCita;
	}

	public Time getHoraFinCita() {
		return horaFinCita;
	}

	public void setHoraFinCita(Time horaFinCita) {
		this.horaFinCita = horaFinCita;
	}

	public String getCalleCita() {
		return calleCita;
	}

	public void setCalleCita(String calleCita) {
		this.calleCita = calleCita;
	}

	public int getNumeroCita() {
		return numeroCita;
	}

	public void setNumeroCita(int numeroCita) {
		this.numeroCita = numeroCita;
	}

	public String getOrientacionCita() {
		return orientacionCita;
	}

	public void setOrientacionCita(String orientacionCita) {
		this.orientacionCita = orientacionCita;
	}

	public int getClaveColonia() {
		return claveColonia;
	}

	public void setClaveColonia(int claveColonia) {
		this.claveColonia = claveColonia;
	}

	public int getClaveCliente() {
		return claveCliente;
	}

	public void setClaveCliente(int claveCliente) {
		this.claveCliente = claveCliente;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}
