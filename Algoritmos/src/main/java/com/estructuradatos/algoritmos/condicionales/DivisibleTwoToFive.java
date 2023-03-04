package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * Escribe un programa que diga si un numero es divisible por 2 y 5
 * @author usuario
 *
 */
public class DivisibleTwoToFive {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int numero = sc.nextInt();
		
		 isDivisible(numero);
		
		
		
		
	}
	
	
	public static int isDivisible(int num) {
		
		int num1 = num;
		
		boolean isDivisible = num1 %2 == 0 && num1%5 ==0 ? true :false;
		
		
		
		if (isDivisible) {
		
			System.out.println("El numero es divisible por 2 y 5");
			
		}else if (!((num1%5)==0) && num1%2 == 0) {
			
			System.out.println("El numero solo es divisible por 2");
		}else if (!(num1%2==0) && num1%5 == 0) {
			
			System.out.println("El numero solo es divisible por 5");

			
		}
	
		return num;
	}
	
}
