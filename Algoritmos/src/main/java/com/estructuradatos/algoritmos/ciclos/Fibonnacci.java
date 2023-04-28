package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * write a program that display the firts n term of the fibonacci series
 * @author usuario
 *
 */
public class Fibonnacci {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many digits do you want to calculate and"
				+ "display by console: ");
		
		int amount = sc.nextInt();
		
		int firstDigit = 0;
		int seconDigit = 1;
		
		int aux = 0;
		int fibonaccio ;
		
		
		for (int i = 0; i < amount; i++) {
			
			fibonaccio = firstDigit + seconDigit;
			firstDigit = fibonaccio;
			seconDigit = firstDigit;
			
			System.out.println("the values of the fibonacci series is: " + fibonaccio);

				
			
			
		}
		
	
	}

}
