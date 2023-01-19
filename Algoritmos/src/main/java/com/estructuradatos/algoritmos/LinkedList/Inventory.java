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

	

}
