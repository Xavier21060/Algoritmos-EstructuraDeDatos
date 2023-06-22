package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Escribir un programa que muestre y cuente y sume los multiplos de tres
 * que hay entre 1 y un numero introducido por teclado
 * 
 * @author Xavier Sanchez
 *
 */
public class MultiplosDeTres {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hasta que numero quiere limitar los multiplos: ");
		int numero = sc.nextInt();
		
		int contadorDeMultiplosDeTres = 0;
		int sumaDeMultiplosDeTres = 0;
	
		
		
	
		
		
		
		while(numero > 1) {
			
			int aux = numero; //100-99-98-97-96
			
			boolean multiplo = numero % 3 == 0; // f-v-f-f-v
			
			if (multiplo) {
				
				//99 = 99/3 =33 96/
				aux = numero /3; 
				
				sumaDeMultiplosDeTres += aux;
				contadorDeMultiplosDeTres ++;
				
				System.out.println("La suma de multiplos: " + sumaDeMultiplosDeTres);
				System.out.println("Es multiplo de tres: " + numero);
				System.out.println("Cantidad de numero que son multiplos de tres: " + contadorDeMultiplosDeTres);
				
			}
			numero --;
			
			
			
			
		}
		
		
		
	}

}
