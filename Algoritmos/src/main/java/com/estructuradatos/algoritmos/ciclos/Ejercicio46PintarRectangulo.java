package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * 
 * Realizar un programa que pinte por pantalla un rectangulo hueco , hecho con
 * aterisco
 * 
 * Se debe pedir al usuario la anchura y altura Que la altura y anchura sean
 * mayores que 2
 * 
 * @author Xavier Sánchez
 *
 */
public class Ejercicio46PintarRectangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite la anchura del rectangulo: ");
		int anchura = sc.nextInt();

		System.out.println("Por favor, digite la altura del rectangulo: ");
		int altura = sc.nextInt();

		int espacios = anchura - 2;

		/**
		 * Si tanto la altura como la anchura sea mayores que 2 prosiga con el proceso
		 * de pintar el rec tangulo
		 */
		if (altura >= 2 && anchura >= 2) {

			// que pinte la linea superior del rectangulo
			for (int i = 1; i <= anchura; i++) {
				System.out.print("*");
			}

			System.out.println();

			/**
			 * que empieze en la posicion 2, ya que en la linea superior del rectagulo ya
			 * hay una altura que cuenta
			 */

			for (int i = 2; i < altura; i++) {
				System.out.print("*");

				for (int j = 0; j < espacios; j++) {
					System.out.print("+");
				}
				System.out.print("*");
				System.out.println();

			}

			for (int i = 1; i <= anchura; i++) {
				System.out.print("*");
			}
		}

	}

}
