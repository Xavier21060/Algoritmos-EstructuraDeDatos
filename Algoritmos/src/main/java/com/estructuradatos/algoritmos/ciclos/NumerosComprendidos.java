
package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Escribe un programa que obtenga los numeros enteros comprendidos entre dos numero
 * introducidos por teclado y validados como distintos
 * @author usuario
 *
 */


public class NumerosComprendidos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOne, numberTwo;
		
		
		System.out.println("Introduce el primer numero: ");
		numberOne = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		numberTwo = sc.nextInt();
		
		if (numberOne != numberTwo) {
			
			
			if (numberOne < numberTwo) {
				
				System.out.println("\n::::::Los numeros cumplieron las condiciones:::::::");
				
				int menor = numberOne;
				int mayor = numberTwo;
				
				int distanciaOfnumbe1OneAnNumerTwo = numberTwo - numberOne;
				
				
				for(int i = menor; i < mayor; i+=7) {
					
					System.out.println(i);
					
				}
				
				
			}
			
			
			System.out.println("EL numero 1 no es menor que el numero 2.");
			
		}
		
		
		
		
	}
	
	
	
}
