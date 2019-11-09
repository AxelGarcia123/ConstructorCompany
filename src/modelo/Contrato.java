package modelo;

import java.sql.Date;

public class Contrato {
	private int claveContrato;
	private Date fechaInicioContrato;
	private Date fechaFinContrato;
	private String tipoContrato;
	private int metrosCuadradosContrato;
	private int honorariosArquitectoContrato;
	private int costoObraContrato;
	private int claveCliente;
	private int claveTrabajador;
	
	public Contrato() {
		
	}
	
	public Contrato(int claveContrato, Date fechaInicioContrato, Date fechaFinContrato, String tipoContrato,
			int metrosCuadradosContrato, int honorariosArquitectoContrato, int costoObraContrato, int claveCliente,
			int claveTrabajador) {
		super();
		this.claveContrato = claveContrato;
		this.fechaInicioContrato = fechaInicioContrato;
		this.fechaFinContrato = fechaFinContrato;
		this.tipoContrato = tipoContrato;
		this.metrosCuadradosContrato = metrosCuadradosContrato;
		this.honorariosArquitectoContrato = honorariosArquitectoContrato;
		this.costoObraContrato = costoObraContrato;
		this.claveCliente = claveCliente;
		this.claveTrabajador = claveTrabajador;
	}

	public int getClaveContrato() {
		return claveContrato;
	}

	public void setClaveContrato(int claveContrato) {
		this.claveContrato = claveContrato;
	}

	public Date getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	public void setFechaInicioContrato(Date fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public Date getFechaFinContrato() {
		return fechaFinContrato;
	}

	public void setFechaFinContrato(Date fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public int getMetrosCuadradosContrato() {
		return metrosCuadradosContrato;
	}

	public void setMetrosCuadradosContrato(int metrosCuadradosContrato) {
		this.metrosCuadradosContrato = metrosCuadradosContrato;
	}

	public int getHonorariosArquitectoContrato() {
		return honorariosArquitectoContrato;
	}

	public void setHonorariosArquitectoContrato(int honorariosArquitectoContrato) {
		this.honorariosArquitectoContrato = honorariosArquitectoContrato;
	}

	public int getCostoObraContrato() {
		return costoObraContrato;
	}

	public void setCostoObraContrato(int costoObraContrato) {
		this.costoObraContrato = costoObraContrato;
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
