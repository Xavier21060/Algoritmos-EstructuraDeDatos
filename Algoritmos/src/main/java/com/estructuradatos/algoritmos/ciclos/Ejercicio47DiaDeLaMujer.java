package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Con motivo de la celabración del día de la mujer, el 8 de marzo, nos han
 * encargado que PINTE un (8) por pantalla usando la leta M.
 * 
 * 1). Se pide al usuario la altura, que debe ser un numero entero impar mayor o
 * igual que 5 2). La anchura de la figura siempre será de 6
 * 
 * MMMMMM M M MMMMMM M M MMMMMM
 * 
 * 
 * 
 * @author Xavier Sánchez
 *
 */
public class Ejercicio47DiaDeLaMujer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor introduzca el caracter para pintar el día de la mujer: ");
		String caracter = sc.nextLine();

		if (caracter.equals("M")) {

			System.out.println("Por favor, digite la altura de la figura: ");
			int altura = sc.nextInt();

			final int ANCHURA = 6;

			if (altura >= 5 && altura % 2 == 1) {

				for (int i = 1; i <= ANCHURA; i++) {
					System.out.print(caracter);
				}

				System.out.println();

				for (int i = 2; i <= altura; i++) {
					System.out.print(caracter);

					for (int espacion = 0; espacion < 4; espacion++) {

						int mitad = (altura / 2) + 1; // para calcular la mitad del 8

						if (i == mitad) {
							System.out.print(caracter);
							continue;
						} else if (i == altura) { // para terminar de cerrar el 8
							System.out.print(caracter);
							continue;
						}
						System.out.print(" ");
					}
					System.out.print(caracter + "\n");
				}
			}
		}
	}

}
