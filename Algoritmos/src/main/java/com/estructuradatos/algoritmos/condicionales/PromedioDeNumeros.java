package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * Hacer un programa que calcule el promedio de tres numeros
 * @author usuario
 *
 */
public class PromedioDeNumeros {

	
	public static double promedio(int cantidadNumero) {
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		double promedio = 0;
		
		
		
		if (cantidadNumero == 3) {
			
			int numero[] = new int[cantidadNumero];
			
			for(int i = 0; i < cantidadNumero; i++) {
				
				numero[i] = sc.nextInt();
				suma += numero[i];
				
			}
			
			if (suma != 0) {
				
				promedio = suma / cantidadNumero;
			}
			
		}
		System.out.println("El promedio de los numeros es: " + promedio);
		return promedio;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite la cantidad de numeros: ");
		int cantidadNumero = sc.nextInt();
		
		if (cantidadNumero == 3) {
			promedio(cantidadNumero);
		}
		
		
		
	}
	
	
	
	
	
	
	
}
