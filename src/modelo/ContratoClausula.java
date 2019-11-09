package modelo;

public class ContratoClausula {
	private int numeroClausula;
	private int claveContrato;
	private int claveClausula;
	
	public ContratoClausula() {
		
	}
	
	public ContratoClausula(int numeroClausula, int claveContrato, int claveClausula) {
		super();
		this.numeroClausula = numeroClausula;
		this.claveContrato = claveContrato;
		this.claveClausula = claveClausula;
	}

	public int getNumeroClausula() {
		return numeroClausula;
	}

	public void setNumeroClausula(int numeroClausula) {
		this.numeroClausula = numeroClausula;
	}

	public int getClaveContrato() {
		return claveContrato;
	}

	public void setClaveContrato(int claveContrato) {
		this.claveContrato = claveContrato;
	}

	public int getClaveClausula() {
		return claveClausula;
	}

	public void setClaveClausula(int claveClausula) {
		this.claveClausula = claveClausula;
	}
}
