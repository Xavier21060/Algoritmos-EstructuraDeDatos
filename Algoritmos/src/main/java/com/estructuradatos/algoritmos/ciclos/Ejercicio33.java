package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * @author Xavier Sanchez
 * 
 * @description: Realizar un programa que pinte la letra (U) por pantalla hecha con aterisco
 * El programa pedira la altura 
 * 
 * Fijarse el programa inserte un espacio y pinta dos aterisco menos en la base
 * para simular la curvatura de las esquinas inferiores
 *
 */
public class Ejercicio33 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite la altura de la letra (U)");
		int altura = sc.nextInt();
		
		int longitudBase = altura-2;
		
		String caracter = "*";
		String caracter2 = "*";
		
		System.out.println("La longitud de la base  es igual a: " + longitudBase);
		for (int i = 1; i <= altura; i++) {
			
			System.out.println(caracter   + "   " + caracter2);

			if (i == altura) {
				System.out.print(" "  );
				
				while (longitudBase > 1) {
					
					System.out.print(caracter);
					longitudBase--;
					
				}
				
			}
			


			
		
			
		}
	}
	

}
