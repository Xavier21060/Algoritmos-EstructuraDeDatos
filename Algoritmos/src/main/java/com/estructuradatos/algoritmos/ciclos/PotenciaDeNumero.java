package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * 
 * Hacer un programa que muestre en tres columnas:
 * Cuadrado, cubo y resultado de 5 numeros introducidos por teclado
 * @author Xavier
 *
 */

public class PotenciaDeNumero {

	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		int cubo;
		int cuadrado;
		int resultado; 
		int numeroPrueba;
		
		String figura ="*";
		
		System.out.println("El numero a introducir deberia ser correcta y mayor de 0");
		numeroPrueba = sc.nextInt();
		
		while(numeroPrueba > 0) {
			
			System.out.println("Introduce un numero: ");
			int numero = sc.nextInt();
			
			if (numero > 0) {
				cuadrado = (numero)*numero;
				cubo = cuadrado*numero;
				System.out.printf("%4d %6d %8d\n", numero, cuadrado, cubo);
				Thread.sleep(200);
			}
			
			if (numero < 0) {
				System.out.println("Numero incorrecto, Feliz viaje!");
				break;
			}
			
		}
		
		
	}
	
}



	class Two{
		
		
		public static void main(String[] args) throws InterruptedException {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca un numero: ");
			int numero = sc.nextInt();
			
			for (int i = numero; i < numero +5; i++) {
				
				System.out.printf("%4d %6d %8d\n", i, i*i, i*i*i);
				Thread.sleep(i*100);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
