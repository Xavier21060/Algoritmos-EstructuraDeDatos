package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * implementar el juego de piedra, papel y tijera
 * @author Xavier Sanchez
 *
 */
public class PiedraPapel {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce la jugada del primer usuario: ");
		String jugador1 = sc.next();
		
		System.out.println("introduce la jugada del segundo usuario: ");
		String jugador2 = sc.next();
		
		String resultado = "";
		
		String options[] = {"papel", "tijera", "piedra"};
		
		for (int i = 0; i < options.length-1; i++) {
			
			
			if (options[i].equals(jugador1) && options[i].equals(jugador2)) {
				
				i++;
				
				if (jugador1.equals("papel") && jugador2.equals("papel")) {
					
					resultado = "empate";
					System.out.println("EL juego termino en: " + resultado);
					
					
				}else if (jugador1.equals("papel".toUpperCase()) && jugador2.equals("tijera".toUpperCase())) {
				
					resultado = "jugador2";
					System.out.println("Gano el: " + resultado);
				}
			
			}else {
				
				System.out.println("Option incorrecta en el juego.");
				
			}
		}
		
			
		for(String opt: options) {
		
			if (opt.contains(options[0])) {
				
			}
		}
		
		
		
	}
}
