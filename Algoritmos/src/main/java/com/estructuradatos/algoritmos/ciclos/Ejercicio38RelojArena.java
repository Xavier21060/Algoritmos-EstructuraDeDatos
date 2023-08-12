package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * 
 * Realizar un programa que pinte un reloj de arena hecho con aterisco
 * 
 * El programa debe de pedri la altura. Se debe comprobar que la altura sea un
 * numero imapar mayor o igual a 3
 * 
 * 
 * **** *** * *** ****
 * 
 * @author Xavier Sanchez
 *
 */
public class Ejercicio38RelojArena {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite la altura del reloj de arena: ");
		int alturaIntroducida = sc.nextInt();

		int espaciosExternos = 0;

		int altura = 3;
		int auxAltura = alturaIntroducida;

		if (alturaIntroducida >= 0 && alturaIntroducida % 2 == 1) {

			for (int i = 1; i <= (auxAltura / 2) + 1; i++) { // Esto controla la altura del rejoj

				for (int j = 0; j < alturaIntroducida; j++) { // Va a pintar la primera linea del reloj

					System.out.print("*"); // Va pintando el reloj con el aterisco (*****)

				}

				System.out.println();

				if (alturaIntroducida == 1) {
					break;
				}
				for (int j = 0; j <= espaciosExternos; j++) { // Este bucle pinta los espacios externos para que vaya
																// formando la estructura del reloj
					System.out.print(" ");
				}

				espaciosExternos++;
				alturaIntroducida -= 2; // Para que disminuya la las lineas pintadas del reloj

			}

			espaciosExternos = ((auxAltura / 2) - 1);
			

			for (int i = 0; i < (auxAltura / 2); i++) {

				for (int j = 0; j < espaciosExternos; j++) {

					System.out.print(" ");
				}

				for (int j = 0; j < altura; j++) {
					System.out.print("*");
				}

				System.out.println();

				altura += 2;
				espaciosExternos--;

			}

		}

	}

}
