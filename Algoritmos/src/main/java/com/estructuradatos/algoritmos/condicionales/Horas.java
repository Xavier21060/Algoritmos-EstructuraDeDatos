package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * escribe un programa que dado una hora y diga cuantos segundos falta para llegar a 
 * @author usuario
 *
 */
public class Horas {
	
	private static Scanner sc = null;
	private static double HORA = 24;
	
	
	public static void main(String[] args) {
		
		horasAsegundos();
	}
	
	
	public static void horasAsegundos() {
		
		if (sc == null) {
			sc = new Scanner(System.in);
			
		}
		
		System.out.println("Introduce una hora del día");
		double hora = sc.nextDouble();
		
		double resultSeconds = 0;
		double formula;
		
		
		
		if (hora < HORA && HORA >= 0) {
			
			formula = HORA * 60;
			
			System.out.println("Minutos al dia: " + formula);
			
			HORA = formula;
		
			if (HORA == formula) {
				
				resultSeconds = hora * 60;
				System.out.println("Minutos de las horas: " + hora + " son: " + resultSeconds);
				double result = formula - resultSeconds;
				
				System.out.println("Minutos restantes para terminar el día: " + result);
				double secondsForterminateOfDay = result * 60;
				
				System.out.println("Segundo para terminar el día son: " + secondsForterminateOfDay);
			}
			
		}
				
		
		
	}

}
