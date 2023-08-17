package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class Ejercicio41CantidadPares {

	
	public static void main(String[] args) {
		
		int cantidadPares = 0;
		int cantidadImpares = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite un numero: ");
		int numero = sc.nextInt();
		
		
		int residuo = 0;
		
		while(numero != 0) {
			
			residuo = numero % 10;
			
			numero /= 10; 
			
			if (residuo % 2 == 0) {
				cantidadPares++;
			}else {
				cantidadImpares++;
			}
			
		}
		mostrar(cantidadPares, cantidadImpares);
		
		
	}
	
	
	public static void mostrar(int pares, int impares) {
		
		System.out.println("La cantidad de digitos pares son: " + pares);
		System.out.println("La cantidad de digitos impares son: " + impares);

	}
}
