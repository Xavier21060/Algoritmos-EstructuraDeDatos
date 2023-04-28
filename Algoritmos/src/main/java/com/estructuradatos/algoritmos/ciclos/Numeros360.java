package com.estructuradatos.algoritmos.ciclos;

/**
 * Mostrar lso numeros que vayan de 320 a 160 de 20 em 20
 * @author usuario
 *
 */
public class Numeros360 {
	
	public static void main(String[] args) {
		
		int j = 320;
		
		for(int i = j; i >= 160; i-=20) {
			System.out.println(i);
		}
		
		
		System.out.println("\nEl mismo ejercicio en ciclo while: ");
		
		int k =  320;
		int q = 160;
		
		while(k > q) {
			k-=20;
			System.out.println(k);
		}
	}

}
