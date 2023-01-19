package com.estructuradatos.algoritmos.linkedlist;




public class Node {
	
	
	//representa el dato del nodo
	private Object data;
	
	private Node next;

	public Node() {
		super();
		
	}

	//Inicializando un objecto con un campo
	public Node(Object data) {
		
		this.data = data;	
	}

	/**
	 * Nos devuleve un valor con el nodo que esta enlazado
	 * @return
	 */
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	/**
	 * Nos permite establecer un nodo con el que esta enlazado
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data;
	}
	
	
	  
	
	
	
	
	
	
	

}
