package modelo;

public class Clausula {
	private int claveClausula;
	private String descripcionClausula;
	
	public Clausula() {
		
	}
	
	public Clausula(int claveClausula, String descripcionClausula) {
		super();
		this.claveClausula = claveClausula;
		this.descripcionClausula = descripcionClausula;
	}

	public int getClaveClausula() {
		return claveClausula;
	}

	public void setClaveClausula(int claveClausula) {
		this.claveClausula = claveClausula;
	}

	public String getDescripcionClausula() {
		return descripcionClausula;
	}

	public void setDescripcionClausula(String descripcionClausula) {
		this.descripcionClausula = descripcionClausula;
	}
}
