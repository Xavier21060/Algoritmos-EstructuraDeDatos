package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * 
 * @Description 
 * Realizar un programa que pinte la letra (L) por pantalla hecha con aterisco
 * 
 * el programa pidira la altura por teclado 
 * 
 * la longitud de la base de la letra, será la altura ((h/2) +1 ))
 * 
 * 
 * @author Xavier Sanchez
 *
 */
public class Ejercicio31 {
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite la altura de la letra (L): ");
		int altura = sc.nextInt();
		
		
		int longitudBase = (altura/2) +1 ;
		System.out.println("La altura de la base es igual a: " + longitudBase);
		
		
		System.out.println();
		for (int i = 1; i <= altura; i++) {
			
			
			if (i == altura) {
				
				int k = i; //Tomamos la ultima posicion de i que va a hacer la altura
				
				
				for(; k > longitudBase; k--) {
					
					System.out.print("*");
				}
			}
			
			System.out.println("*");
		}
		
	}

}
