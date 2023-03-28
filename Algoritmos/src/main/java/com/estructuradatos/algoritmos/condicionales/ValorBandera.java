package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * Realize un programa que calcule el valor de una bandera por su area, segun unas condiciones:
 * 1). el 1 cm3 de la bandera tiene un valor de 0,01 euros
 * 2). Si la bandera tiene escudo:
 * 		con escudo : 2,50
 * 3). costes de envio 3,25
 * @author Xavier Sanchez
 *
 */
public class ValorBandera {
	
	private static Scanner sc;
	private static double precioPorCentimetro = 0.01;

	public static void main(String[] args) {
		double precioBandera  = 0;
		
		sc = new Scanner(System.in);
		
		System.out.println("Intrduzca la altura de la bandera: ");
		int altura = sc.nextInt();
		
		System.out.println("Intrduzca el ancho de la bandera: ");
		int ancho = sc.nextInt();
		
		int tamanoBandera = altura * ancho;
		precioBandera	= tamanoBandera * precioPorCentimetro;
		
		System.out.println(" Precio normal de la bandera: " + precioBandera);
		
		System.out.println("¿ La bandera tendrá escudo: ? [ si/ no]");
		String escudo = sc.next();
		
		double precioEscudo = 0;
		
		switch (escudo) {
		case "si":
			precioEscudo = precioBandera + 2.50 ; 
			break;
		case "no":
			precioEscudo = precioBandera + 0; 
			break;
		default:
			break;
		}
		
		System.out.println("precio normal2: " + precioEscudo);

		double precioBanderaEnvio = precioEscudo + 3.25;
		
		System.out.println("El precio de la bandera es : " + precioBanderaEnvio);
		
	}

	
	
}
