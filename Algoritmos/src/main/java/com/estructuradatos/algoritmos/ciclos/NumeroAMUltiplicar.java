package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Mostrar la tabla de multiplicar de unu numero introducido por teclado
 * @author Xavier2106
 *
 */


public class NumeroAMUltiplicar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero; //numero de la tabla a multiplicar
		
		System.out.println("Introduce el numero al cual desea realizar la multiplicacion");
		numero = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(numero + "*" + i + " = " + numero*i ); //Que el numero lo multiplique por todas las iterciones de i
		
			
		}
		
	}
	
	
}
