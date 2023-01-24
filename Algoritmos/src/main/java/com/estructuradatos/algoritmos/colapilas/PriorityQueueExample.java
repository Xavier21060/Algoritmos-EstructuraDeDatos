package com.estructuradatos.algoritmos.colapilas;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer>  queue = new PriorityQueue<>();
		
		queue.add(6);
		queue.add(3);
		queue.add(34);
		queue.add(8);
		queue.add(6);
		queue.add(9);
		
		System.out.println(queue);
		
		//queue.clear(); //Eliminar todos los elementos de la cola
		System.out.println("Desencolando el primer elemento ya que fue el primero en encolar: " + queue.poll());
		System.out.println(queue);

	}
	
	
	
}
