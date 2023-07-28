package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

import sun.text.normalizer.CharTrie.FriendAgent;

/**
 * 
 * @author Xavier Sánchez
 *
 */
public class Ejercicio34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite el primero numero: ");
		int firtsNUmber = sc.nextInt();

		System.out.println("Digite el segundo numero: ");
		int secondNumber = sc.nextInt();

		int digitoParesFormados = 0;

		int digitoImparesFormados = 0;

		int residuoFirtsNumber = 0;
		int residuosecondNumber = 0;

		while (firtsNUmber != 0 && secondNumber != 0) {

			/**********************************************
			 * Para obtener el ultimo digito de un numero *
			 **********************************************/
			residuoFirtsNumber = firtsNUmber % 10;

			/**********************************************
			 * Para obtener el ultimo digito de un numero *
			 **********************************************/
			residuosecondNumber = secondNumber % 10;

			firtsNUmber /= 10;
			secondNumber /= 10;

			if ((residuoFirtsNumber % 2 == 0) || (residuosecondNumber % 2 == 0)) {

				if (residuoFirtsNumber % 2 == 0) {
					if (residuosecondNumber % 2 == 0) {
						digitoParesFormados = (((digitoParesFormados * 10) + residuoFirtsNumber) * 10)
								+ (residuosecondNumber);
					} else {
						digitoParesFormados = (((digitoParesFormados * 10) + residuoFirtsNumber));
					}

				} else if (residuosecondNumber % 2 == 0 || residuoFirtsNumber % 2 == 0) {

					if (residuosecondNumber % 2 == 0) {
						digitoParesFormados = (((digitoParesFormados * 10) + residuosecondNumber));
					}
				}

				System.out.println("Digitos pares formados entre los dos numeros son: " + digitoParesFormados);

			}
			if ((residuoFirtsNumber % 2 == 1) || (residuosecondNumber % 2 == 1)) {

				if (residuoFirtsNumber % 2 == 1) {
					if (residuosecondNumber % 2 == 1) {
						digitoImparesFormados = (((digitoImparesFormados * 10) + residuoFirtsNumber) * 10)
								+ residuosecondNumber;
					} else {
						digitoImparesFormados = (((digitoImparesFormados * 10) + residuoFirtsNumber));
					}
				} else if (residuosecondNumber % 2 == 1 || residuoFirtsNumber % 2 == 1) {

					if (residuosecondNumber % 2 == 1) {
						digitoImparesFormados = (((digitoImparesFormados * 10) + residuosecondNumber));

					}

				}

				System.out.println("Digitos Impares formados entre los dos numeros son: " + digitoImparesFormados);

			}

			System.out.println(firtsNUmber + " \n" + secondNumber);

			System.out.println(residuoFirtsNumber + " **** " + residuosecondNumber);

		}

		System.out.println("Digitos pares formados entre los dos numeros son: " + digitoParesFormados);
		System.out.println("Digitos Impares formados entre los dos numeros son: " + digitoImparesFormados);

	}
}
