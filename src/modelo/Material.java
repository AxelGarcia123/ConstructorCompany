package modelo;

public class Material {
	private int claveMaterial;
	private String nombreMaterial;
	private String marcaMaterial;
	private String tipoMaterial;
	private int minimoMaterial;
	private int maximoMaterial;
	private String unidadMedidaMaterial;
	private int contenidoMaterial;
	
	public Material() {
		
	}
	
	public Material(int claveMaterial, String nombreMaterial, String marcaMaterial, String tipoMaterial,
			int minimoMaterial, int maximoMaterial, String unidadMedidaMaterial, int contenidoMaterial) {
		super();
		this.claveMaterial = claveMaterial;
		this.nombreMaterial = nombreMaterial;
		this.marcaMaterial = marcaMaterial;
		this.tipoMaterial = tipoMaterial;
		this.minimoMaterial = minimoMaterial;
		this.maximoMaterial = maximoMaterial;
		this.unidadMedidaMaterial = unidadMedidaMaterial;
		this.contenidoMaterial = contenidoMaterial;
	}

	public int getClaveMaterial() {
		return claveMaterial;
	}

	public void setClaveMaterial(int claveMaterial) {
		this.claveMaterial = claveMaterial;
	}

	public String getNombreMaterial() {
		return nombreMaterial;
	}

	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}

	public String getMarcaMaterial() {
		return marcaMaterial;
	}

	public void setMarcaMaterial(String marcaMaterial) {
		this.marcaMaterial = marcaMaterial;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public int getMinimoMaterial() {
		return minimoMaterial;
	}

	public void setMinimoMaterial(int minimoMaterial) {
		this.minimoMaterial = minimoMaterial;
	}

	public int getMaximoMaterial() {
		return maximoMaterial;
	}

	public void setMaximoMaterial(int maximoMaterial) {
		this.maximoMaterial = maximoMaterial;
	}

	public String getUnidadMedidaMaterial() {
		return unidadMedidaMaterial;
	}

	public void setUnidadMedidaMaterial(String unidadMedidaMaterial) {
		this.unidadMedidaMaterial = unidadMedidaMaterial;
	}

	public int getContenidoMaterial() {
		return contenidoMaterial;
	}

	public void setContenidoMaterial(int contenidoMaterial) {
		this.contenidoMaterial = contenidoMaterial;
	}
}
