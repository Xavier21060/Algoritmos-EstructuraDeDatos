package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Show the multiplication table of a number entered  by keyboard
 * @author usuario
 *
 */
public class Multiplicationtables {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number tha you want the multipliaction table generate");
		int number = sc.nextInt();
		
		
		for(int i = 0; i <=10; i++) {
			
		
			int result = number*i;
			
			System.out.println(result);
			
			
		}
	}
}
