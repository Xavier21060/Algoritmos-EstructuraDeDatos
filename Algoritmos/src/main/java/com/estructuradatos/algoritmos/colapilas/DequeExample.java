package com.estructuradatos.algoritmos.colapilas;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	
	public static void main(String[] args) {
		
		Deque<String> numbers = new ArrayDeque<>();
		
		//Method for add an element to Deque
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		numbers.add("7");
		numbers.add("8");
		
		//print of the elements
		System.out.println(numbers.toString());
		
		//Inspect a item in the head
		System.out.println("Head: " + numbers.peek());
		
		//Method to inspect an element in the tail
		System.out.println("Tail: " + numbers.peekLast());
		
		System.out.println("Head -> " + numbers + " <- tail");
		
		//Method to remove an item from the head of a queue 
		System.out.println("Pop: " + numbers.pop());
		
		//Method to remove an item from the tail of a queue
		System.out.println("Tail: " + numbers.pollLast());
		
		System.out.println("Head -> " + numbers + " <- tail");
		
		
		
	}
}
