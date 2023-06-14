
package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class NumerosPrimos2From100 {

	public static void main(String[] args) {

		int contadorPrimo = 0;
		int contadorNoPrimo = 0;
		int posicion = 0;
		
		int primos[];
		int noPrimos[];

		boolean isPrime = true;

		for (int i = 2; i <= 50; i++) {
			
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
				

			}
			
			if (isPrime) {
				contadorPrimo++;
				
	
				System.out.println("Es primo: " + i);
				

			} else if (!isPrime) {
				
				//primos[i] = i;
				contadorNoPrimo++;
				System.out.println("No es primo: " + i);
				//System.out.println(primos[i]);
			}

		}

		System.out.println("La cantidad de numeros primos son: " + contadorPrimo);
		System.out.println("La cantidad de los numeros que no son primos son: " + contadorNoPrimo);
	}

}
