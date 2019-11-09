package modelo;

public class Permiso {
	private int clavePermiso;
	private String tipoPermiso;
	private String descripcionPermiso;
	
	public Permiso() {
		
	}
	
	public Permiso(int clavePermiso, String tipoPermiso, String descripcionPermiso) {
		super();
		this.clavePermiso = clavePermiso;
		this.tipoPermiso = tipoPermiso;
		this.descripcionPermiso = descripcionPermiso;
	}

	public int getClavePermiso() {
		return clavePermiso;
	}

	public void setClavePermiso(int clavePermiso) {
		this.clavePermiso = clavePermiso;
	}

	public String getTipoPermiso() {
		return tipoPermiso;
	}

	public void setTipoPermiso(String tipoPermiso) {
		this.tipoPermiso = tipoPermiso;
	}

	public String getDescripcionPermiso() {
		return descripcionPermiso;
	}

	public void setDescripcionPermiso(String descripcionPermiso) {
		this.descripcionPermiso = descripcionPermiso;
	}
}
