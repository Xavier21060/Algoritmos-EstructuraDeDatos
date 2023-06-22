package com.estructuradatos.algoritmos.ciclos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Realizar un programa que pida un numero por teclado y muestre ese numero al revés
 * entrada : 21
 * 			Intercambian las posiciones de los numeros
 * salida : 12
 * @author Xavier Sanchez
 *
 */
public class NumeroAlRevez {
	
	
	public static void main(String[] args) {
		
		/**
		 * Dividir el numero introducido por teclado hasta que el cociente sea igual a cero por 10 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite un numero");
		
		
		int numero = sc.nextInt();
		
		int numeroAlReves = 0;
		int auxq = 0;
		
		List<Integer> addNumber = new ArrayList<Integer>();
		
		
		while(numero !=0 ) {
			
			auxq = numero;
			auxq  %= 10;
			numero /=10;
			
			
			if (numero >= 0) {
				addNumber.add(auxq);
			}
			
			
			
		
			System.out.println("Residuo: " + auxq);
			System.out.println("Cociente : " + numero);
		
			
		}
		
		
		if (numero >= 0) {
			
			numeroAlReves = auxq;
			System.out.println("Xavier: " + addNumber);
		}
		
		
		System.out.println("El nuemro al revés es: " + numeroAlReves);


		System.out.println("\nDE OTRA MANERA");
		
		System.out.println("Digite nuvamente un numero: ");
		int numeroIntro = sc.nextInt();
		
		int n = numeroIntro;
		int volteado = 0;
		while(n > 0) {
			
			volteado = (volteado * 10)  + (n %10);
			n/=10;
		}
		
		System.out.println("EL NUMERO VOLTEADO FUE: " + volteado);
		
		
	}
	

}
