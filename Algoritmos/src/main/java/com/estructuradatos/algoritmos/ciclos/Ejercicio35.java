package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * 
 * 
 * @author Xavier Sanchez
 *
 */
public class Ejercicio35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite la altura de la (X): ");
		int alturaIntrudica = sc.nextInt();

		int altura = 1;
		int i = 0;

		int espaciosinternos = alturaIntrudica - 1; //cuatro espacios internos
		int espaciosPorDelante = 0;

		if (alturaIntrudica >= 3 && alturaIntrudica % 2 == 1) {

			while (altura < alturaIntrudica / 2 + 1) {

				for (i = 1; i <= espaciosPorDelante; i++) {
					System.out.print(" ");
				}

				System.out.print("*");

				for (i = 1; i < espaciosinternos; i++) {
					System.out.print(" ");
				}

				System.out.print("*");
				System.out.println();

				altura++;
				espaciosPorDelante++;

				espaciosinternos -= 2;
			}

			espaciosinternos = 0;
			espaciosPorDelante = alturaIntrudica / 2;
			altura = 1;

			while (altura <= alturaIntrudica / 2 + 1) {

				for (i = 1; i <= espaciosPorDelante; i++) {
					System.out.print(" ");
				}

				System.out.print("*");

				for (i = 1; i < espaciosinternos; i++) {
					System.out.print(" ");
				}

				if (altura > 1) {
					System.out.print("*");
				}

				System.out.println();

				altura++;
				espaciosPorDelante--;

				espaciosinternos += 2;
			}

		}

	}

}
