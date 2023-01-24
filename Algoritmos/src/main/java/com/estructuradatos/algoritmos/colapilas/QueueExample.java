package com.estructuradatos.algoritmos.colapilas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	/**
	 * La interfaz Queue implementa la clase LinkedList
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		for (int i = 0; i < 5; i++ ) {
			
			if (i % 2 == 0) {
				i *=2;
			}
		
			
			queue.add(i);
			
			System.out.println(queue);
		}
		
		System.out.print("Elementos de la cola: " + queue);
		
		//Eliminar el header o cabecera
		int head = queue.remove();
		System.out.print("\nElementos de la cola eliminado: " + head);

		System.out.print("\nElementos de la cola despues de eliminar el primer elemeneto en entrar" + queue);

		
		int size = queue.size();
		
		System.out.println("\nTamaño de la cola: " + size);
		
		//Hacer una inspeccion o busqueda de la cabecera de la cola o elemento con mayor prioridad
		
		System.out.println("La cabecera de la cola ahora es: " + queue.peek());
		
		
	}
	
	
}
