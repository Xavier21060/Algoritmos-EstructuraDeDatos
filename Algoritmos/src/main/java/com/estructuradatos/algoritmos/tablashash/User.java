package com.estructuradatos.algoritmos.tablashash;

import java.util.Objects;

public class User {

	
	private int id;
	private String email;
	private String name;
	
	public User(int id, String email, String name) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + "]";
	}

//	@Override
//	public int hashCode() {
//		
//		int hash = 3;
//		
//		hash = 43 + hash + this.id;
//		hash = 43 * hash + Objects.hashCode(this.email);
//		hash = 43 + hash + Objects.hashCode(this.name);
//		
//		return hash;
//		
//	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.email == null) ? 0 : email.hashCode());
		result = prime * result + this.id;
		result = prime * result + ((this.name == null) ? 0 : name.hashCode());
		
		System.out.println("Hashcode: " + result);
		
		
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
}
