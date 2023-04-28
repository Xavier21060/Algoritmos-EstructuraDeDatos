package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class NumberPrime {
	
	
	private static Scanner sc;


	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Digite un numero: ");
		int n = sc.nextInt();
		
		System.out.println(isPrime(n));
	
		
	}
	
	
	
	
	@SuppressWarnings("unused")
	public static boolean isPrime(int n) {
		
		boolean isPrime = true;
		
		for (int i = 2; i < n; i++) {
			
			if (n%i == 0) {
				isPrime = false;
			}
			
		}
			
		if (isPrime) {
			 System.out.println("Es primo");
		}else {
			 System.out.println("No es primo");
		}
		
		return isPrime;
		
	}

}
