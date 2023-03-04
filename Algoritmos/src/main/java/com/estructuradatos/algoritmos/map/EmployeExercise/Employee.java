 
package com.estructuradatos.algoritmos.map.EmployeExercise;
 
 
public class Employee{
	
	private String name;
	private int id;
	private String nss; //numero de seguridad social
	private String enterprise;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String nss, String enterprise) {
		super();
		this.id = id;
		this.name = name;
		this.nss = nss;
		this.enterprise = enterprise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", nss=" + nss + ", enterprise=" + enterprise + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enterprise == null) ? 0 : enterprise.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nss == null) ? 0 : nss.hashCode());
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
		Employee other = (Employee) obj;
		if (enterprise == null) {
			if (other.enterprise != null)
				return false;
		} else if (!enterprise.equals(other.enterprise))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nss == null) {
			if (other.nss != null)
				return false;
		} else if (!nss.equals(other.nss))
			return false;
		return true;
	}
	

	
}