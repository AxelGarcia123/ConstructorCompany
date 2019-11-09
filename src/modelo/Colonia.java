package modelo;

public class Colonia {
	private int claveColonia;
	private String nombreColonia;
	private String tipoAsentamientoColonia;
	private int codigoPostal;
	
	public Colonia() {
		
	}
	
	public Colonia(int claveColonia, String nombreColonia, String tipoAsentamientoColonia, int codigoPostal) {
		super();
		this.claveColonia = claveColonia;
		this.nombreColonia = nombreColonia;
		this.tipoAsentamientoColonia = tipoAsentamientoColonia;
		this.codigoPostal = codigoPostal;
	}

	public int getClaveColonia() {
		return claveColonia;
	}

	public void setClaveColonia(int claveColonia) {
		this.claveColonia = claveColonia;
	}

	public String getNombreColonia() {
		return nombreColonia;
	}

	public void setNombreColonia(String nombreColonia) {
		this.nombreColonia = nombreColonia;
	}

	public String getTipoAsentamientoColonia() {
		return tipoAsentamientoColonia;
	}

	public void setTipoAsentamientoColonia(String tipoAsentamientoColonia) {
		this.tipoAsentamientoColonia = tipoAsentamientoColonia;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
}
