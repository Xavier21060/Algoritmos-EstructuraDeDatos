package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Realizar un programa que nos diga cuantos digitos tiene un numero digitado por teclado
 * 
 */

public class DigitosNumero {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int cantidadDeDigitos = 0;
	
		
		System.out.println("Introduce el numero que desea calcular su cantidad de digitos tiene: ");
		numero = sc.nextInt();
		
		int n = numero; //Guardo el el numero en otra variable
		
		while(n !=0) {
		
			n =  n/10; //EL numero se le va ir quitando el residuo
				
			cantidadDeDigitos++;
		}
		System.out.println("Numero introducido: " + numero + " tiene numero de digitos: " +cantidadDeDigitos );
		
		
	}
	
	
}
