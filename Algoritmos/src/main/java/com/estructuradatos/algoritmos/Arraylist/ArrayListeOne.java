package com.estructuradatos.algoritmos.Arraylist;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListeOne {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unchecked")
		List<String> colors = new ArrayList();
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Red");
		
		
		String [] nombres = {"Alvaro", "Daniel", "Javier"};
	
		//Aslist para convertir un arreglo en un ArrayList
		List<String> nameList = Arrays.asList(nombres);
		
		//Construir una lista apartir de otra
		List<String> elementos = new ArrayList<String>(nameList);
		//Añadir elementos apartir de otra
		elementos.addAll(nameList);	
			
		System.out.println("Lista de nombres");
		nameList.forEach(System.out::println);
		
		System.out.println("Lista de colores");
		colors.forEach(System.out::println);
		
		//Iteracion de List
		ListIterator<String> iterator = colors.listIterator();
		
		//Mientras halla elemento
		while(iterator.hasNext()) {
			//colors.add("Green");
			System.out.println("Color: " + iterator.next());
			
		}
		
		while(iterator.hasNext()) {
			if (iterator.next().equals("Yellow")) {
				iterator.remove();
			}
			
		}
		
		
	}

}
