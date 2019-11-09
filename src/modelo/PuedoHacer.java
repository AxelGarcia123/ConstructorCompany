package modelo;

public class PuedoHacer {
	private int numPuedoHacer;
	private int claveActividad;
	private int claveTrabajador;
	
	public PuedoHacer() {
		
	}
	
	public PuedoHacer(int numPuedoHacer, int claveActividad, int claveTrabajador) {
		super();
		this.numPuedoHacer = numPuedoHacer;
		this.claveActividad = claveActividad;
		this.claveTrabajador = claveTrabajador;
	}

	public int getNumPuedoHacer() {
		return numPuedoHacer;
	}

	public void setNumPuedoHacer(int numPuedoHacer) {
		this.numPuedoHacer = numPuedoHacer;
	}

	public int getClaveActividad() {
		return claveActividad;
	}

	public void setClaveActividad(int claveActividad) {
		this.claveActividad = claveActividad;
	}

	public int getClaveTrabajador() {
		return claveTrabajador;
	}

	public void setClaveTrabajador(int claveTrabajador) {
		this.claveTrabajador = claveTrabajador;
	}
}
