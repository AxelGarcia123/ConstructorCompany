package modelo;

public class Actividad {
	private int key;
	private String name;
	private String description;
	private String unitOfMeasure;
	
	public Actividad(String name, String description, String unitOfMeasure, int key) {
		super();
		this.key = key;
		this.name = name;
		this.description = description;
		this.unitOfMeasure = unitOfMeasure;
	}
	
	public Actividad() {
		
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
}