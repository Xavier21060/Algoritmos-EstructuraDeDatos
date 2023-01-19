package com.estructuradatos.algoritmos.linkedlist.inventarios;

public class SimpleLinkedList {
	
	//representa la lista enlazada
	
	private Node first; //Representa al primer nodo de la lista enlazad
	
	public SimpleLinkedList() {
		this.first = null;
	}
	
	//Nos permita inserta un elemento en la cabecera de la lista enlazad
	public void push (Object obj) {
		Node newNode = new Node(obj);
		
		newNode.setNext(this.first);
		this.first = newNode;
	
	}
	
	public Node pop() {
		
		Node temp = this.first; //Guarda referencia al primer nodo en la variable temp
		
		this.first = this.first.getNext();
		
		return temp;
	}
	
	public Node delete (Object val) {
		Node currentNode = this.first;
		Node previousNode = this.first;
		
		while(!currentNode.toString().equals(val)){
			if(currentNode.getNext() == null) {
				return null;
			}else {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
		}
		
		if (currentNode == this.first) {
			this.first = this.first.getNext();
		}else {
			previousNode.setNext(currentNode.getNext());
		}
		return previousNode;
	}
	

}
