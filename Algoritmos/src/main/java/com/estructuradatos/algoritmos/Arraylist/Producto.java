package com.estructuradatos.algoritmos.Arraylist;

public class Producto {
	
	private String marca;
	private String color;
	private String modelo;
	private String tallas;
	
	
	
	
	
	
	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(String marca, String color, String modelo, String tallas) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.tallas = tallas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTallas() {
		return tallas;
	}
	public void setTallas(String tallas) {
		this.tallas = tallas;
	}
	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", tallas=" + tallas + "]";
	}
	
	
	
	
}
