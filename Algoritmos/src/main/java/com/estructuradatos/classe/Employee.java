package com.estructuradatos.classe;

public class Employee {

	private String name;
	private String edad;
	private String ciudad;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String edad, String ciudad) {
		super();
		this.name = name;
		this.edad = edad;
		this.ciudad = ciudad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		employee.setCiudad("abjja");
		employee.setEdad("12");
		employee.setName("xavier");
		
		
		System.out.println(employee);
	}
	
}
