package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

import javax.crypto.ExemptionMechanismException;

/**
 * 
 * Write a program  than  asks for a base and a exponet and 
 * that calculates the power
 *
 */

public class PowerNumber {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base;
		int exponet;
		int power = 1;
		/**
		 * if 
		 */
		
		System.out.println("Wite the base of a number: ");
		base = sc.nextInt();
		
		System.out.println("Write the exponent of a number: ");
		exponet = sc.nextInt();
		
		if (exponet == 0) {
			power = 1;
			System.out.println("The power of " + base + "^" + exponet + " = " + power);
		}
		
		if (exponet > 0) {
			
			for (int i = 0; i < exponet; i++) {
				power*=base;
				System.out.println(power);
			}
			
		}if(exponet < 0) {
			
			for (int i = 0; i < - exponet; i++) {
				power *= base;
				System.out.println(power);
				
			}
			power = 1/power;
		}
		
	}
	
	
	
	
}
