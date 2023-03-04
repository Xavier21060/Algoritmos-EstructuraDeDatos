package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * Realizar un programa que permite calcular la ecuacion de segundo grado
 * @author Xavier
 *
 */
public class EcuacionSdoGrado {

	
	public static Double ecuacion(int a, int b) {
		
		
		Double result = null;
		
		String message = "";
		if (a == 0 ) {
			message = "Divisones por cero esta indefinida";
			System.out.println(message);
			if (b == 0 || a < 0 ) {
				return (double) 0;
			}
		}
		if (a != 0 ) {
			
			 if (a < 0 && b < 0) {
				
				 result = (double) (b/-a);
				 System.out.println(result);
			}else if (a < 0 && b > 0) {
				
				result = (double) (-b/-a);
				System.out.println(result);
			}else {
				result = (double) (-b/a);
				System.out.println(result);
			}
			
		}
		return result;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el valor de a");
		int a = sc.nextInt();
		
		System.out.println("Escribe el valor de b");
		int b = sc.nextInt();
		ecuacion(a, b);
	}
	
}

