package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class Ejercicio39FactorialNumero {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un número: ");
		int numero = sc.nextInt();
		
		int factorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
			
			
			System.out.println(i + "! = " + factorial);
			
		}
		System.out.println("El factorial de " + numero + " es: " + factorial);
		
		
	}
}
