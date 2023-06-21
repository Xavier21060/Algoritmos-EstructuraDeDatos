package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Escribir un programar que lea un numero (n) e imprima
 * una priramide con (n -> filas)
 * n -> numero de filas que se preguntaran
 * 
 * 			 1
 *         1 2 1
 *       1 2 3 2 1
 *      1 2 3 4 3 2 1  
 * @author usuario
 *
 */
public class PiramidesDeNumeros {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite la altuta de la piramide: ");
		
		int alturaIntroducida = sc.nextInt(); //representa la altura de la piramide
		int altura = 1;
		
		
		
		while(altura <= alturaIntroducida) {
		
			//pinta piramide     2 3 4
			for (int i = 1; i < altura; i++) { // 1 121 12321 1234321
				System.out.print(i);
			}
			
			//hace el retroceso
			//       0     0
			for (int i = altura; i > 0; i--) { // 1 si 
				
				System.out.print(i);
			}
			System.out.println();
			
			altura++; //se aumenta la altura
			
		}
		
		
		System.out.println( "\n\n::::::::::::::::::::::::::::PIRAMIDE CON FOR::::::::::::::::::::::");
		
		
		System.out.println("DIGITE LA ALTURA: ");
		int n = sc.nextInt(); //Representa una variable para dar a conocer la altura de la piramide
		int iteraciones = 0;
		
		
		for (int i = 1; i <= n; i++) { //1-2-3-4
			
			int j; 
			
			for ( j = 1; j <= i; j++) { //1
				System.out.print("" + j ); // 1 121=k 123k=21   1234
			
				int k;
				
				if (j == i) {
				
					for (k = j; k > 1; k--) { //1-2-3-4
						System.out.print(k-1); // 121 12321 1234321
						
					}
				}
							
		
			}
			
			
			System.out.println();
				
			
		}
	}
	
}
