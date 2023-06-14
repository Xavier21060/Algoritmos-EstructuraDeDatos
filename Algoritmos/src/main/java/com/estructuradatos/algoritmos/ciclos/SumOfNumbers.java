package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Write a program that allows you to allow a number of serie,  
 * as long as their sum does not exceed the value of 100.
 * when the sum is equal to 1000, the accumulated total, the counter and the average must be displayed
 * @author Xavier Sanchez
 *
 */
public class SumOfNumbers {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		int contadorDeNUmeros = 0;
		int media = 0;
		int sumaTotal = 0;
		
		int max = 50;
		
		
		System.out.println("Introduce un numero: ");
		number = sc.nextInt();
		
		if (number > 0) {
			
			while(sumaTotal < max) {
				
				contadorDeNUmeros++; //permite contabilizar la cantidad de numeros introducidos
				
				System.out.println("Digite nuevamente un numero");
				number = sc.nextInt();
				
				sumaTotal += number;
				if (sumaTotal > max) {
					sumaTotal -= number;
					break;
				}
				
			}
			
			
		}
		System.out.println("La suma total es: " + sumaTotal);
		System.out.println("La cantidad de numero introducido fue: " + contadorDeNUmeros);
		System.out.println("La media es: " + sumaTotal/contadorDeNUmeros);
		
		
		
		
		
		
		
	}
}
