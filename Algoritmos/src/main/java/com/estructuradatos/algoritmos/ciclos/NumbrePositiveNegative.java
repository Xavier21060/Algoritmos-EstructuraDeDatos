package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Write a program than reads a list of ten numbers and determines how many are positive and negative
 * @author usuario
 *
 */

public class NumbrePositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int positive = 0; //Count the positive numbers
		int negative = 0; //count the negative number
		int amountNumbers = 0; //counts the number of numbers entered by console
		int number;
		int i = 0;
		
		while (amountNumbers != 10) {
			
			System.out.println(i + ". Write a number: ");
			number = sc.nextInt();
			i++;
			
			if (number > 0) {
				positive ++;
			}else if (number < 0) {
				negative ++;
			}
			
			amountNumbers++;
			
		}
		
		System.out.println("Amount of numbers positive entered by keyboard are:  " + positive);
		System.out.println("Amount of numbers negative entered by keyboard are:  " + negative);
		System.out.println("Amount of numbers  entered by keyboard are:  " + amountNumbers);


		
		
		
	}
	
	
}
