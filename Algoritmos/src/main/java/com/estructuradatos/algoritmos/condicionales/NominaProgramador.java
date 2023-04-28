package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * Escribe un programa que calcule la nomina de un empleada dada ciertas condiciones
 * 1).Cargo del empleado
 * 2). Dias laborados visitandos clientes externos
 * 3). Estado civil
 * @author usuario
 *
 */
public class NominaProgramador {

	private static Scanner sc;
	private static double result;
	
	static double sueldoProgramador(double sueldoBase, int diasViaje, String estadoCivil) {
		double valor = 0;
	
		setResult(0);
		if (diasViaje > 0 && diasViaje < 31) {
			 
			setResult(sueldoBase + (diasViaje * 30));
			
			switch (estadoCivil.toLowerCase()) {
			case "soltero":
				valor = getResult() * 0.25;
				break;

			case "casado":
				valor = getResult() * 0.2;
			default:
				break;
			}

		}
		return getResult() - valor;
	}
	
	public static void main(String[] args) {
		if (sc == null) {
			sc = new Scanner(System.in);
		}
		System.out.println("Cargo del programdor: ");
		System.out.println("1. Programador junior");
		System.out.println("2. Programador senior");
		System.out.println("3. Jefes de proyecto");
		
		System.out.println("Digite el cargo:");
		int cargo = sc.nextInt();
	
		double sueldo = 0;
	
		switch (cargo) {
			case  1:
				sueldo = 950;
				break;
			case 2:
				sueldo = 1200;
				break;
			case 3: 
				sueldo = 1600;
		}
		
		System.out.println("¿Cuantos días estuvo de viaje en temas laborales?");
		int diasViajes = sc.nextInt();
		
		System.out.println("¿Estado civil?");
		String estadoCivil = sc.next();
		
		System.out.println(sueldoProgramador(sueldo, diasViajes, estadoCivil));
	}

	public static double getResult() {
		return result;
	}

	public static void setResult(double result) {
		NominaProgramador.result = result;
	}

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		NominaProgramador.sc = sc;
	}
	
}
