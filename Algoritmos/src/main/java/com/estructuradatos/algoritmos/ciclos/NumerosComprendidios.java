package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Escribir un programa que obtenga los numeros comprendidos entre dos numeros 
 * introducidos por teclado y validos como distintos
 * @author Xavier2106
 *
 */
public class NumerosComprendidios {
	
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer numero: ");
		
		int num1 = sc.nextInt();
		
		System.out.print("Escribe el segundo numero: ");
		int num2 = sc.nextInt();
		
		int menor = 0;
		int mayor = 0;
		
		if (num1 != num2) {
			
			if (num1 > num2) {
				menor = num2;
				mayor = num1;
			}else {
				menor = num1;
				mayor = num2;
			}
			
			int diferencia = mayor - menor;
			
			if (diferencia > 7) {
				
				for (int i = menor ; i < mayor; i+=7) {
					System.out.println("Los numeros compredidos entre: " + menor 
							+ " y: " + mayor + ", son: " + i);
				}
			}else {
				for (int i = menor += 1; i < mayor; i++) {
					System.out.println("Los numeros compredidos entre: " + menor 
							+ " y: " + mayor + ", son: " + i);
				}
			}
			
			
		}
		
	}

}
