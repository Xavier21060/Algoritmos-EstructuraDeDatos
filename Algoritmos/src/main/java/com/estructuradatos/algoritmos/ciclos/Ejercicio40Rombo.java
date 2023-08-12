package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Ejercicio40Rombo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite la altura que desea que tenga el rombo: " );
		int alturaIntroducida = sc.nextInt();
		
		int alturaAux = alturaIntroducida;
		
		int espaciosExternos = alturaIntroducida /2 ;
		int espaciosInternos = 0;
		
		int primerCuadrateRombo = (alturaIntroducida / 2) +1;
		int segundoCuadranteRombo = alturaIntroducida /2;
		
		if (alturaIntroducida >= 3 && alturaIntroducida % 2 == 1) {

			for (int i = 0; i < primerCuadrateRombo; i++) {
				
				for (int j = 0; j < espaciosExternos; j++) {
					System.out.print("-");
					
				}

				System.out.print("*");
				for (int j = 1; j < espaciosInternos; j++) {
					
					System.out.print(" ");
					
				}
				if (espaciosInternos > 0) {
					System.out.print("*");

				}
				System.out.println();
				
				
				espaciosExternos--;
				espaciosInternos+=2;
				
				
			}
			
			
			
		}else {
			
			System.out.println("No se puede introducir numeros pares.");
		}
	
		
		
		
	}

}
