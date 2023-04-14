package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuantos digitos tiene un numero 
 * introduciodo por teclado  
 * @author usuario
 *
 */
public class DigitsNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type a number: ");
		int number = sc.nextInt();
		
		int counter = 0;
	
		int aux = number;
		
		while(number != 0) {
			
			number /=10;
			counter++;
		}
		
		System.out.println("The number " + aux + " has " + counter + " digit");
		
		
		
	}

}
