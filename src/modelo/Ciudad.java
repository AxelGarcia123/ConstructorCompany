package modelo;

public class Ciudad {
	private int claveCiudad;
	private String nombreCiudad;
	private int ladaCiudad;
	
	public Ciudad() {
		
	}
	
	public Ciudad(int claveCiudad, String nombreCiudad, int ladaCiudad) {
		super();
		this.claveCiudad = claveCiudad;
		this.nombreCiudad = nombreCiudad;
		this.ladaCiudad = ladaCiudad;
	}

	public int getClaveCiudad() {
		return claveCiudad;
	}

	public void setClaveCiudad(int claveCiudad) {
		this.claveCiudad = claveCiudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public int getLadaCiudad() {
		return ladaCiudad;
	}

	public void setLadaCiudad(int ladaCiudad) {
		this.ladaCiudad = ladaCiudad;
	}
}
