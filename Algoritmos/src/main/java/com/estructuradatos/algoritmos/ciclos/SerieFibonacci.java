package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Hacer un programa que muestre los primeros n terminos de la serie de fibonacci 
 * 1) Termino = 0
 * 2) Termino = 1
 * 3) termino = F1 + f2
 * 
 * n => Terminos por teclado
 *
 */

public class SerieFibonacci {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int firstTerm = 0; //El segundo termino termino de fibonacci es 0
		int secondTerms = 1;
		int calcularFibonacci = 0;
		
		System.out.println("Introduce la cantidad de terminos que quieres que calculemos: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
								//  0     +    1
			calcularFibonacci = firstTerm + secondTerms;
			
			firstTerm = secondTerms;  //1 1 2 3 5
			secondTerms = calcularFibonacci;  //1  2 3 5 8
			
			System.out.println(calcularFibonacci);
		
			
			
			
		}
		
		
	}
	
	
}
