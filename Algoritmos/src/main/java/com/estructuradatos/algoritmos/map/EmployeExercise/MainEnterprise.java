
package com.estructuradatos.algoritmos.map.EmployeExercise;

/**
 * Crear un programa informatico en el cual se tenga la posibilidad de
 * alta a una empresa o un empleado
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainEnterprise {

	private Map<Enterprise, List<Employee>> enterprises; //Que empresa va a tener una relacion con un empleado
	private Scanner sc;

	public MainEnterprise() {
		setEnterprise(new HashMap<>());
		sc = new Scanner(System.in);
	}

	public void init() {

		int option;
		boolean isTrueOption; 

		
		do {
		
			System.out.println("\n\n\t Menu \t");
			System.out.println("---Employees");

			System.out.println("1. Dar de alta de la empresa");
			System.out.println("2. Dar de alta empleado");
			System.out.println("3. Imprimir relacion");
			System.out.println("4. Salir");
			
			System.out.println("Enter your option");
			option = sc.nextInt();
			
			isTrueOption  = option > 0 && option <=4 ? true : false;
			
			
			switch (option) {
				case 1:
					newtEnterprise();
					break;
				case 2:
					newEmployee();
					break;
	
				case 3:
					print();
					break;
				case 4:
					System.out.println("Gracias por su visita a la empresa");
					break;

					default:
						break;
			}

		} while (isTrueOption);
	}

	private void print() {
		
		for(Map.Entry<Enterprise, List<Employee>> entry: enterprises.entrySet() ) {
			Enterprise enterprise = entry.getKey();
			List<Employee> employees = entry.getValue();
			
			System.out.println("El nombre de la empresa: " + enterprise.getName());
			
			for(Employee employeeEnterprise: employees) {
				System.out.println("");
				System.out.println(employeeEnterprise.toString());
				System.out.println("");
			}
		}
		
	}

	private void newEmployee() {
		
		System.out.println("Proporciona el id del empleado: ");
		int id = sc.nextInt();
		
		System.out.println("Proporciona el nombre del empleado: ");
		String name = sc.next();
		
		System.out.println("Proporcione el numero de seguridad social del empleado: ");
		String nss = sc.next();
		
		System.out.println("Proporcione el nombre de la empresa, en la que está ejerciendo las labores el emnpleado: ");
		String nameEnterprise = sc.next();
		
		Employee em = new Employee(id, name, nss, nameEnterprise);
		
		Enterprise enterprise = new Enterprise(nameEnterprise);
		
		
		if (enterprises.containsKey(enterprise)) {
			enterprises.get(enterprise).add(em); //Obtiene el valor que corresponde a la empresa, con una lista de los empleados
		}else {
			
			enterprises.put(enterprise, new LinkedList<Employee>());
			enterprises.get(enterprises).add(em);
		}
		
	}

	private void newtEnterprise() {
		
		System.out.println("Proporciona el id de la Empresa");
		int id = sc.nextInt();
		
		System.out.println("Proporciona el nombre de la empresa");
		String name = sc.next();
		
		System.out.println("proporcione el sector de la empresa");
		String sector = sc.next();
		
		Enterprise enterpriseE = new Enterprise(id, name, sector);
		 
		enterprises.put(enterpriseE, new LinkedList<Employee>());
		
		
	}
	
	public static void main(String[] args) {
		MainEnterprise a = new MainEnterprise();
		
		a.init();
	}

	public Map<Enterprise, List<Employee>> getEnterprise() {
		return enterprises;
	}

	public void setEnterprise(Map<Enterprise, List<Employee>> enterprise) {
		this.enterprises = enterprise;
	}

}