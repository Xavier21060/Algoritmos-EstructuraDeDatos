package com.estructuradatos.algoritmos.LinkedList;

import java.util.Scanner;

public class InventoryApp {

	private Scanner sc;
	private Inventory inventory;
	
	public static void main(String[] args) {

		InventoryApp app = new InventoryApp();
		app.init();
		
		
	}

	
	
	public void init() {
		sc = new Scanner(System.in);
		inventory = new Inventory();
		
		int option;
		do {
			
			System.out.println("\n\n\t Menú \t");
            System.out.println("--Manejo de inventarios--");
            System.out.println("1.- Nuevo producto: ");
            System.out.println("2.- Agregar producto al inventario: ");
            System.out.println("3.- Eliminar producto: ");
            System.out.println("4.- Actualizar precio de producto: ");
            System.out.println("5.- Mostrar lista de productos: ");
            System.out.println("6.- Salir");
            
            System.out.println("\nSeleccione la opción deseada: ");
			
            option = sc.nextInt();
            
			switch (option) {
				case 1:
						newProduct();
					break;
	
				case 2:
						addProduct();
					break;
				case 3:
					 deleteProduct();
					break;
				case 4:
					  updateProductPrice();
					break;
				case 5:
	                  printProducts();
					break;
				
				default:
					System.out.println("Gracias!, su inventario ha finalizado");
					break;
			}

		} while (option != 6);

	}



	private void printProducts() {
		// TODO Auto-generated method stub
		
	}



	private void updateProductPrice() {
		// TODO Auto-generated method stub
		
	}



	private void deleteProduct() {
		// TODO Auto-generated method stub
		
	}



	private void addProduct() {

		System.out.println("ID del producto a añadir:");
		int ID = sc.nextInt();
		
		System.out.println("Nombre del producto: ");
		String name = sc.next();
		
		System.out.println("Existencia inicial del producto: ");
		int existence = sc.nextInt();
		
		System.out.println("Precio del product");
		Double price = sc.nextDouble();
		
		inventory.newProduct(ID, name, existence, price);
	}



	private void newProduct() {
		// TODO Auto-generated method stub
		
	}

	
}
