package modelo;

import java.sql.Date;

public class PermisoContrato {
	private int clavePermContrato;
	private Date fechaPermContrato;
	private int costoPermContrato;
	private Date fechaInicioPermContrato;
	private Date fechaFinPermContrato;
	private int clavePermiso;
	private int claveContrato;
	
	public PermisoContrato() {
		
	}
	
	public PermisoContrato(int clavePermContrato, Date fechaPermContrato, int costoPermContrato,
			Date fechaInicioPermContrato, Date fechaFinPermContrato, int clavePermiso, int claveContrato) {
		super();
		this.clavePermContrato = clavePermContrato;
		this.fechaPermContrato = fechaPermContrato;
		this.costoPermContrato = costoPermContrato;
		this.fechaInicioPermContrato = fechaInicioPermContrato;
		this.fechaFinPermContrato = fechaFinPermContrato;
		this.clavePermiso = clavePermiso;
		this.claveContrato = claveContrato;
	}

	public int getClavePermContrato() {
		return clavePermContrato;
	}

	public void setClavePermContrato(int clavePermContrato) {
		this.clavePermContrato = clavePermContrato;
	}

	public Date getFechaPermContrato() {
		return fechaPermContrato;
	}

	public void setFechaPermContrato(Date fechaPermContrato) {
		this.fechaPermContrato = fechaPermContrato;
	}

	public int getCostoPermContrato() {
		return costoPermContrato;
	}

	public void setCostoPermContrato(int costoPermContrato) {
		this.costoPermContrato = costoPermContrato;
	}

	public Date getFechaInicioPermContrato() {
		return fechaInicioPermContrato;
	}

	public void setFechaInicioPermContrato(Date fechaInicioPermContrato) {
		this.fechaInicioPermContrato = fechaInicioPermContrato;
	}

	public Date getFechaFinPermContrato() {
		return fechaFinPermContrato;
	}

	public void setFechaFinPermContrato(Date fechaFinPermContrato) {
		this.fechaFinPermContrato = fechaFinPermContrato;
	}

	public int getClavePermiso() {
		return clavePermiso;
	}

	public void setClavePermiso(int clavePermiso) {
		this.clavePermiso = clavePermiso;
	}

	public int getClaveContrato() {
		return claveContrato;
	}

	public void setClaveContrato(int claveContrato) {
		this.claveContrato = claveContrato;
	}
}
