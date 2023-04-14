package com.estructuradatos.algoritmos.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Una tienda de ropa ha dejado de vender cierta marca de ropa que tiene
 * identificada en una lista sin embargo en su base de datos siempre apareciendo
 * en su busqueeda porque no han sido eliminadas. No queremos eliminar una por
 * una, debemos crear un programa que en base de una lista de marcas, revise si
 * encuentra en la base de datos
 * 
 * @author usuario
 *
 */

public class EliminarProducto {

	private static List<Producto> productos;

	public static Producto[] obtenerProductos() {

		Producto[] productos = { new Producto("hsm", "yellow", "pay", "32"), new Producto("H&M", "Verde", "Pay", "32L"),
				new Producto("Zara", "Gris", "Coco", "32L"), new Producto("Lacoste", "Verde", "Crown", "32L"),
				new Producto("Farm", "Azul", "Holos", "32L"), new Producto("Ho!", "Gris", "Pay", "32L"),
				new Producto("H&M", "Gris", "Pay", "32L"), new Producto("H&M", "Gris", "Pay", "32L"),
				new Producto("Lacoste", "Gris", "Pay", "32L") };

		return productos;
	}
	
	
	

    public static void main(String[] args) {
//        String [] marcas = {"H&M", "Lacoste"};
//        
//        
//        //Convierta la matriz o el metodo que es una matriz  en un ArrayList
//        List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
//       //que los recorra
//        productos.forEach(System.out::println);
//        //eliminarMarcasIterator(productos, Arrays.asList(marcas));
//        
//        eliminarMarcasStream(productos, Arrays.asList(marcas));
//        
//        System.out.println("\n\nProductos sin las marcas no deseadas: ");
//        productos.forEach(System.out::println);
    	
    	Producto[] e = obtenerProductos();
    	
    	for (int i = 0; i < e.length; i++) {
			
    		System.out.println(e[i].toString());
		}
    	
    	System.out.println(e.length);
    }
    
    private static void eliminarMarcasStream(List<Producto> productos, List<String> marcas){
       
    	productos.removeIf((producto) -> marcas.contains(producto.getMarca()));
    }
    
    private static void eliminarMarcasIterator(List<Producto> productos, List<String> marcas){
        for(ListIterator<Producto> iterador = productos.listIterator(); iterador.hasNext(); ) {
            if(marcas.contains(iterador.next().getMarca())){
                iterador.remove();
            }
        }
    	
    	
    }

}
