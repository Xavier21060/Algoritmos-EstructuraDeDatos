package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Write a program if thay says if a number entered for keyboard is or no prime
 * @author usuario
 *
 */


public class IsPrime {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		boolean isNotPrime = true;
		
		System.out.println("Introduce a number: ");
		numero = sc.nextInt();
		
		
		for(int i = 2; i < numero; i++) {
			
			
			if (numero%i == 0) {
				isNotPrime = false;
			}
			
			
		}
		if (isNotPrime) {
			System.out.println("El numero introducido es primo");
			
		}else {
			System.out.println("No es primo");
		}
		
	}

}
