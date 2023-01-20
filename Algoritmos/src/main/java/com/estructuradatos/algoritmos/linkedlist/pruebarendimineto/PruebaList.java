package com.estructuradatos.algoritmos.linkedlist.pruebarendimineto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PruebaList {

	public static void main(String[] args) {

		List<Persona> listaarray = new ArrayList<>();
		List<Persona> listalinked = new LinkedList<>();
		long antes;

		/*
		 * Tiempo invertido en insertar una persona en listaarray (en nanosegundos):
		 * 700750 
		 * Tiempo invertido en insertar una persona en listalinked (en
		 * nanosegundos): 9247
		 */

		for (int i = 0; i < 1000000; i++) {
			listaarray.add(new Persona(i, "Persona" + i, i));
			listalinked.add(new Persona(i, "Persona" + i, i));
		}

		System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");
		antes = System.nanoTime(); // Devuelve el tiempo actual en nanosegundos
		listaarray.add(1000000, new Persona(10001, "Persona", 1001)); // Inserción en posicion 0 de una persona
		System.out.println(System.nanoTime() - antes); // Tiempo que se llevo en realizar esa operacion

		System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");
		antes = System.nanoTime();
		listalinked.add(1000000, new Persona(10001, "Persona", 1001)); // Inserción en posicion 0 de una persona
		System.out.println(System.nanoTime() - antes);
	}

	static class Persona {
		int idPersona;
		String nombre;
		int altura;

		public Persona(int idPersona, String nombre, int altura) {
			this.idPersona = idPersona;
			this.nombre = nombre;
			this.altura = altura;
		}
	}

}
