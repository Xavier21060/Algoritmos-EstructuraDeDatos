package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Realiza un programa que sume los 100 numeros siguiente a un numero
 * entero positivo que es introducido por teclado
 * @author usuario
 *
 */



public class SumaDeNumeros {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese un numero que sea mayor que cero: ");
		int numero = sc.nextInt();
		
		int i = numero;
		
		int suma = 0;
		int limite = i+100;
		
		while((numero > 0) ) {
			
			
			suma += i;
			i++;
			
			System.out.println("La suma de: " + i + " + " + suma + " = " + suma );
			if (i == limite) {
				System.out.println(" Se ha llegado a los 100 numeros posteriores del "
						+ "numero introducido por teclado: " + i);
				break;
			}
		}	
	}
	
}
