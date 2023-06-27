package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla
 * todos los números positivos menores a uno leido por teclado 
 * que no sean divisible entre otro tanmbien leido por teclado
 * @author Xavier Sanchez
 *
 */
public class NumeroDivisible {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero menor que 100: ");
		
		int num = sc.nextInt();
		
		System.out.println("Digite un numero, el el cual desea que los nuemros no sean divisible ...");
		int isNotDivisible = sc.nextInt();
		
		if (num >= 100) {
			System.out.println("estoy en el if");
			for (int i = 1; i <num ; i++) {
				

				boolean divisble = i % isNotDivisible == 1;
				
				if (divisble) {
					System.out.println(i);

				}
			}
		}
		
		
	}

}
