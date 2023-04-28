package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 *  realiza un programa que pida un numero por
 *  tecaldo y luego muestre ese numero al revez
 * @author xavier
 *
 */
public class NumeroVolteado {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduce un numero: ");
		int numeroIntroduciodo = sc.nextInt();
		
		int numero = numeroIntroduciodo;
		int volteado = 0;
		
		while(numero > 0) {
			
			volteado = (volteado * 10) + (numero % 10);
			System.out.println("volteado: " + volteado);
			
			numero /= 10;
			System.out.println("numero: " + numero);
		}
		
		
		System.out.println("EL numero introducido: " + numeroIntroduciodo + " si le damos  "
				+ "la vuelta, tenemos: " + volteado);
		
	}
	


}
