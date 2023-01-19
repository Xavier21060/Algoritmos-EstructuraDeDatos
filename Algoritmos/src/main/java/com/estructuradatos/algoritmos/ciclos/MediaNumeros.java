package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Hacer un programa que calcule la media de un conjunto de numeros positivos introducidos por teclado
 * el programa terminara cuando se introduzca un numero negatigo
 * @author usuario
 *
 */

public class MediaNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numerosIntroducir;
		int cantidadNumeros = 0;
		int sumaNumeros = 0;
		int media = 0;
		
		System.out.println("Introduce un numero");
		numerosIntroducir = sc.nextInt();

		int i = 0;
		
		while(numerosIntroducir > 0) {
			i++;
			
			if (numerosIntroducir > 0) {
				System.out.println(i + ". Introduce un numero: ");
				numerosIntroducir = sc.nextInt();
				
				cantidadNumeros++; //Cuente todos los numero introducidos
				System.out.println("NUmero introducido " + numerosIntroducir);
				sumaNumeros += numerosIntroducir;
				
				media = sumaNumeros /cantidadNumeros;
				
			}
			
		}
		System.out.println("Cantidad de numeros introducidos fueron: " + cantidadNumeros);
		System.out.println("La suma de numeros: " + sumaNumeros);
		System.out.println("La media de los numeros: " + media);
		
	}
	
	
}
