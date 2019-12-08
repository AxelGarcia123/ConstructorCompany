package modelo;

public class Codigo {
	private int codigoPostal;
	private int claveCiudad;
	
	public Codigo() {
		
	}
	
	public Codigo(int codigoPostal, int claveCiudad) {
		super();
		this.codigoPostal = codigoPostal;
		this.claveCiudad = claveCiudad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getClaveCiudad() {
		return claveCiudad;
	}

	public void setClaveCiudad(int claveCiudad) {
		this.claveCiudad = claveCiudad;
	}
}
