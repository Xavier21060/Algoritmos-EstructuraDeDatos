package com.estructuradatos.algoritmos.LinkedList;

public class Product {
	
	
	
	
	private int id;
	private String name;
	private double price;
	private int existence;
	
	
	public Product(int id) {
		super();
		this.id = id;
	}


	public Product(int id, String name, double price, int existence) {
		
		this.id = id;
		this.name = name;
		this.existence = existence;
		this.price = price;
		
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (this.id != other.id)
			return false;
		return true;
	}
	

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", existence=" + existence + "]";
		
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getExistence() {
		return existence;
	}


	public void setExistence(int existence) {
		this.existence = existence;
	}
	
	
	
	
	
	
	

}
