package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class Piramide {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Digite la altura que la piramide tendra: ");
		int altura = sc.nextInt();
		
		System.out.println("Digite el caracter con el cual desesa pintar la piramide: ");
		String caracter = sc.next();
		
		String espacios = "    ";
		
		for (int i = 1; i <= altura; i++) {

			for (int j = 1; j <=i; j+=1) {
				
				System.out.print(caracter);
				
			}
			System.out.println("");
			
			
		}

		
	}

}
