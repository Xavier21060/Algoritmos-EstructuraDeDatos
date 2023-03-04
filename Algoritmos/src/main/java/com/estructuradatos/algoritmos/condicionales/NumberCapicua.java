package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/** 
 * Escribe un programa que diga si un numero positivo introducido por teclado es capicua
 * @author usuario
 *
 */
public class NumberCapicua {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero: ");
		int n = sc.nextInt();
		
		System.out.println(isCapicua(n));
		
	}
	
	public static boolean isCapicua(int n) {
		
		String numString = String.valueOf(n); //Se transforma el numero en un String
		
	
		for(int i = 0, j = numString.length()-1; j <=i; i++, --j) {
			
			if (numString.charAt(i) != numString.charAt(j)) {
				return true;
			}
			
		}
	
		
		return false;
		
	}
	
	
	 
	
}
