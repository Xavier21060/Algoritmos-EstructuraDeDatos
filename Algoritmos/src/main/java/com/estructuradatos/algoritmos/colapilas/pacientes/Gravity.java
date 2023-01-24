package com.estructuradatos.algoritmos.colapilas.pacientes;

public enum Gravity {

	MINOR("MINOR", 1),
	MODERATE("MODERATE", 2),
	SEVERE("SEVERE", 3),
	VERY_SEVERE("VERY SEVERE", 4);
	
	
	private String description;
	private Integer level;
	
	
	private Gravity(String descriptio, Integer level) {
		this.description = descriptio;
		this.level = level;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getLevel() {
		return level;
	}


	public void setLevel(Integer level) {
		this.level = level;
	}
	
	
	
	
	
	
}
