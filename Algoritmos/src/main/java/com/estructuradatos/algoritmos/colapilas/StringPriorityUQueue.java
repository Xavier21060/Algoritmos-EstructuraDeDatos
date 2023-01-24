package com.estructuradatos.algoritmos.colapilas;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityUQueue {

	
	public static void main(String[] args) {
		
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("C");
		queue.add("C++");
		queue.add("Java");
		queue.add("Python");
		queue.add("JavaScript");
		queue.add("Rust");
		queue.add("GO");
		queue.add("R");
		queue.add("C#");
		
		System.out.println("Elementos ordenados con prioridad: " + queue.toString());
		
		
		String mayorPrioridad = queue.peek();
		//Mostramos (sin eliminar) el elemento de mayor prioridad
		System.out.println("El valor de mayor prioridad es: " + mayorPrioridad);
		System.out.println();
		
		//Remover el elemento de mayor prioridad	
		String removeElementMorePriority = queue.poll();
		System.out.println("El elemento eliminado es: " + removeElementMorePriority + " Despues de remover el elemento de mayor prioridas la "
				+ "cola queda de la siguiente manera: " + queue );
		
		

		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//verificar si un elemennto esta presente en nuestra cola de prioridad
		boolean javasIsPresent = queue.contains("Java");
		System.out.println("\nLa cola de prioridad contiene el elemneto Java: " + javasIsPresent);
	
		//Obteniendo los elementos de la cola en un array
		Object [] arr = queue.toArray();
	
		
		
		
	}
	
}
