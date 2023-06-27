package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el factorial de
 * un numero entero leido por teclado
 * 
 * Ej: factorial de 6!
 * 6! = 720
 * @author Xavier Sanchez
 *
 */
public class FactorialDeUnNumero {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("De que numero, desea conocer su factorial: ");
		int num = sc.nextInt();
		int factorial = 1; //Para que se pueda multiplicar
		
		
		
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial *i;
		}
		
		System.out.println("El factorial del numero: " + num + ""
				+ " es: " + factorial);
	}
	
	
}
