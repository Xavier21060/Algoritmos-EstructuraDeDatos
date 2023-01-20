package com.estructuradatos.algoritmos.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Nuestro inventario va a manejar objectos de tipo producto
 *
 */
public class Inventory {

	private List<Product> products ;
	
	public Inventory() {
		products = new LinkedList<>();
	}
	
	/**
	 * Metodo utilizado para añadir un nuevo producto a una Lista doblemente enlazada
	 * @param iD
	 * @param name
	 * @param existence
	 * @param price
	 */
	
	public void newProduct(int iD, String name, int existence, Double price) {
		
		Product product = new Product(iD, name, price, existence);
		
		boolean success = products.add(product); //Añadiendo un producto a una lista
		
		if (success) {
			System.out.println("El producto " + name + " se logro añadir correctamente al inventario");
		}else {
			System.out.println("Ocurrio un problema al intentar añadir el producto " + name + " al inventario");
		}
	}

	
	public void printProducts() {
		
		System.out.println("Relacion de productos en el almacen: ");
		
		products.forEach(System.out::println);
		
		System.out.println("\n\n");
		
	}
	
	
	public void addProduct(int ID) {
		
		int productIndex = products.indexOf(new Product(ID)); // Voy a encontrar un ID de una incidencia de la lista de producto 
															  //Que coincida con el Id	
		Product product = products.get(productIndex); //Obtiene el indice 
		
		int existenceTemp = product.getExistence(); //Se guarda la existencia original del ID de un producto
		
		int newExistence = existenceTemp += 1; //Se le añade una nueva existencia al producto antual por su Id
		
		product.setExistence(newExistence); //Se establece una nueva existencia deun producto relacionado por su ID
		
		System.out.println("Se agregado el producto " + product.getName() + " exixtente\n" );
	}

	
	public void updateProductPrice(int iD, Double price) {
		
		int productIndex = products.indexOf(new Product(iD)); // Voy a encontrar un ID de una incidencia de la lista de producto 
		  //Que coincida con el Id	
		Product product = products.get(productIndex); //Obtiene el indice 
		
		product.setPrice(price);
		
		System.out.println("se ha actualizado el precio correctamente al producto: " + product.getName());
		
	}

	public void deleteProduct(int iD) {
		//Para elimiar un producto primero deberiamos obtener un indice
		int productIndex = products.indexOf(new Product(iD)); // Voy a encontrar un ID de una incidencia de la lista de producto 

		Product productToDelete = products.remove(productIndex);
		
		if (productToDelete != null) {
			System.out.println("El producto " + productToDelete.getName() + " se ha eliminado correctamente de las lista de inventario");
		}else {
			System.out.println("No se logro eliminar el producto por el id: " + iD);
		}
		
		
	}

}
