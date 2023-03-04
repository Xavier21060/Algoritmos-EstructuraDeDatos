package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * escribe un programa que ordene 3 numeros introducidos por teclado
 * @author usuario
 *
 */
public class OrdersNumbers {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int aux;
	
		orderNumbers(a, b, c);
	
		
	}
	
	
	
	static void orderNumbers(int num1, int num2, int num3){
		
		int aux = 0;
		
		if (num1 > num2 ) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		
		}
		
		if(num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
			
			
		}
		if (num1 > num2 ) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		
		}
		
		System.out.println("Los numeros ordenados son: " + num1  +"" + num2 + "" +num3);
		
	}

}
