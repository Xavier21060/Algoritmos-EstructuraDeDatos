package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class Ejericicio50Cartelera155 {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite la altura de la cartelera: ");
		
		int altura = sc.nextInt();
		
		System.out.println("Digite los espacios entre los numeros: ");
		int espacios = sc.nextInt();
		
		
		if(altura >= 5) {
			
		
			int anchura = 9 + (espacios *2);
			
			int espaciosIn = 0;
			
			while(anchura > 0) {


				
				System.out.print("*");
				
				espaciosIn = espacios;
				
				if (true) {
					for (int i = anchura; i > anchura - espacios; i--) {
						System.out.print("°");
					}
				}
				
				
				anchura--;
			}
			
		
			
			
			
			
			
			
		}
		
		
		
	}

}
