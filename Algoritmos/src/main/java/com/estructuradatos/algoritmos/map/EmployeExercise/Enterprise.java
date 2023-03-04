package com.estructuradatos.algoritmos.map.EmployeExercise;

public class Enterprise {

	
	private int id;
	
	private String name;
	
	private String sector;
	
	
	public Enterprise(String name) {
		
		this.name = name;
	}


	public Enterprise(int id, String name, String sector) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", name=" + name + ", sector=" + sector + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sector == null) ? 0 : sector.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enterprise other = (Enterprise) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sector == null) {
			if (other.sector != null)
				return false;
		} else if (!sector.equals(other.sector))
			return false;
		return true;
	}
	
	
	
	
	
}
