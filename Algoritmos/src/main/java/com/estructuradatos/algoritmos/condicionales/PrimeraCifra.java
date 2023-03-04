package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class PrimeraCifra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero: ");
		int n = sc.nextInt();

		// numCifra(n);

		System.out.println(firstCifra(n));

	}

	private static int firstCifra(int n) {

		int numeroCifra = numCifra(n);

		int cifra = 0;
		int aux = 0;

		if (n >= 0 && n <= 9) {
			return n;
		}

		if (numeroCifra > 0 && numeroCifra <= 5) {

			if (numeroCifra == 2) {

				cifra = n / 10;
				return cifra;
			}

			else if (numeroCifra == 3) {

				cifra = n / 100;
				return cifra;
			} else if (numeroCifra == 4) {
				cifra = n / 1000;
			} else if (numeroCifra == 5) {
				cifra = n / 1000;
			}
			
		} else {
			System.out.println("Lo siento no cumple las condiciones. ");
		}

		System.out.println("El primer digito del numero digitado es: ");
		return cifra;
	}

	static int numCifra(int n) {

		int axu = n; // En la variable auxiliar guardo el nuemro al cual se le va a calcular el
						// numero de cifras

		int numCrifas = 0; // para contar el nuemro de cifras

		while (axu != 0) { // Mientras el la variable aux sea distinto de cero se va a seguri iterando el
							// ciclo

			axu = axu / 10;

			numCrifas++;

		}

		System.out.println("El numero de cifras es: " + numCrifas);
		return numCrifas;

	}

}
