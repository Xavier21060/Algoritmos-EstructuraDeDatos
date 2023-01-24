package com.estructuradatos.algoritmos.colapilas;

import java.util.ArrayDeque;
import java.util.Deque;

public class BufferActions {

	Deque<String> bufferActions = new ArrayDeque<>();
	
	//allows us to store redo actions
	Deque<String> redoActions = new ArrayDeque<>();
	
	//Allow us to records actions we have perfomed
	public void doActions(String action) {
		
		System.out.println(action); //print the action done == hecha
		
		insertActionsBuffer(action);//Save to action buffer
		
		System.out.println(bufferActions.toString());
									
	}
	
	//Method to undo  actions
	public void undo() {
		
		if (this.bufferActions.isEmpty()) {
			return; //If the bufferAction is empty does not return anything
		}else if (!this.bufferActions.isEmpty()) {
			String actionUndo = this.bufferActions.pollLast(); //If the bufferAction is not empty that remove an element from the tail
			redoActions.push(actionUndo); //and this element is inserted at the head of a stack
			
			System.out.println(this.bufferActions.toString());
		}
		
	}
	
	//Method to redo the actions
	public void redo() {
		System.out.println("Redo: ");
		String action = redoActions.pop();
		insertActionsBuffer(action);
		
		System.out.println("Redo actions: " + this.redoActions.toString());
		
		System.out.println(this.bufferActions.toString());
	}
	
	//Add action in the buffer in the tail
	private void insertActionsBuffer(String action) {
		
		//Method to insert an element in the tail 
		this.bufferActions.offerLast(action);
	}
	
	public static void main(String[] args) {
		
		BufferActions bufferActions = new BufferActions();
		bufferActions.doActions("Copiar");

		bufferActions.doActions("Pegar");

		bufferActions.doActions("Escribir Hola");

		bufferActions.doActions("Borrar");
		
		bufferActions.undo();
		bufferActions.undo();
		
		bufferActions.redo();
	
		
	}
	
}
