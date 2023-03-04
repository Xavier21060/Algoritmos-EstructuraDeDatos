package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * REALIZAR UN PROGRAMA QUE CALCULE EL TIEMPO DE CAIDA DE UN OBJETO DESDE UNA ALTURA H
 * @author XAVIER
 *
 */
public class TimeOfFall {

	
	public static Double timeDeCaida(double altura) {
		
		double result = 0;
		
		if (altura > 0) {
			int consta = 2;
			double gravedad = 9.81;
			
			 
			
			result = Math.sqrt(consta*altura/gravedad);
			
			
		}
		
		System.out.println(result);
		return   result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce la altura de la cual el objeto va a caer: ");
		
		double altura = sc.nextDouble();
		timeDeCaida(altura);
	}
	
	
}
