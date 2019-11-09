package modelo;

public class ActividadRealizar {
	private int activityNumber;
	private int cantidad;
	private int activityKey;
	private int contractKey;
	
	public ActividadRealizar(int activityNumber, int cantidad, int activityKey, int contractKey) {
		super();
		this.activityNumber = activityNumber;
		this.cantidad = cantidad;
		this.activityKey = activityKey;
		this.contractKey = contractKey;
	}
	
	public ActividadRealizar() {
		
	}

	public int getActivityNumber() {
		return activityNumber;
	}

	public void setActivityNumber(int activityNumber) {
		this.activityNumber = activityNumber;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getActivityKey() {
		return activityKey;
	}

	public void setActivityKey(int activityKey) {
		this.activityKey = activityKey;
	}

	public int getContractKey() {
		return contractKey;
	}

	public void setContractKey(int contractKey) {
		this.contractKey = contractKey;
	}
}