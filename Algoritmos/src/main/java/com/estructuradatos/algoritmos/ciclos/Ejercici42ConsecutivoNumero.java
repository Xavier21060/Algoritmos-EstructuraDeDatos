package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class Ejercici42ConsecutivoNumero {
	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite un numero: ");
		numero = sc.nextInt();
		
		for (int i = numero; i < (numero +100) ; i++) {
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime) {
				System.out.println("Es primo: " + i);
			}else {
				System.out.println("No es primo: " + i);
			}
			
		}
		
		
	}
}
