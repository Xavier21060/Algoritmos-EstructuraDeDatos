package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * Escribe un programa que diga la ultima cifra de un numero
 * @author usuario
 *
 */
public class CifrasDeNumber {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero:");
		int n = sc.nextInt();
		
		System.out.println("La ultima cifra del numero introducido es:");
		System.out.println(cifra(n));
	}
	
	public static int cifra(int n) {
		
		int aux = 0;
		
		if (n >= 0 && n <=9) {
			
			return n;
		
		}else if (n >= 10 && n <=200) {
			
			aux = n%10; //Obtiene el residuo del numero introducido por teclado
		}
		
		return aux;
		
	}

}
