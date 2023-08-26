package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * @description: Escribe un programa que cambie un digito dentro de un numero
 *               dado, dando la posicion y el valor nuevo
 * @author Xavier Sanchez
 *
 */
public class Ejercicio45CambiarNUmero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite un numero: ");
		int num = sc.nextInt(); // el nummero digitado por tecklado

		System.out.println("Introduzca el numero que desea insertar: ");
		int numeroInsertar = sc.nextInt();// para conocer el numero que se desa insertar

		int residuo = 0; // para obtener la ultima de un numero
		int aux = 0;
		int cifras = 0; // para contabilizar los digitos que tiene un numero
		int volteado = 0; // para darle la vuelta a un numero
		int numeroFinal = 0;

		int segundaParteDelNumero = 0;

		while (num != 0) {

			cifras++;

			residuo = num % 10;

			num /= 10;

			volteado = (volteado * 10) + residuo;

		}

		System.out.println("Digite la posicion en la cual desea agregar el numero:");
		int posicion = sc.nextInt(); // la posicion en la cual se desea agegar el nunmero

		if (posicion > 0 && posicion <= cifras) {

			residuo = 0;

			aux = 0;

			int numeroVolteado = 0;

			cifras = 0;
			while (volteado != 0) {

				cifras++;

				residuo = volteado % 10;

				volteado /= 10;

				numeroVolteado = (numeroVolteado * 10) + residuo;

				if (cifras == posicion) {

					aux = numeroVolteado;
					segundaParteDelNumero = volteado;

				}

				if (volteado == 0) {

					cifras = 0;

					residuo = 0;
					while (aux != 0) {

						cifras++;

						residuo = aux % 10;

						aux /= 10;

						if (cifras == 1) {

							numeroFinal = (aux * 10) + numeroInsertar;
						}

					}
				}
			}
			System.out.println("Final: " + numeroFinal);

			residuo = 0;

			volteado = numeroFinal;

			int numeroResultante = 0;

			while (segundaParteDelNumero != 0) {

				residuo = segundaParteDelNumero % 10;

				volteado = (volteado * 10)  + residuo;

				segundaParteDelNumero /= 10;


			}
			System.out.println ( " <---> " + volteado + " <---> " );

			System.out.println("El numero resultante del proceso es: " + numeroResultante);

		} else {
			System.out.println("la posicion no es la correcta. ");
		}
	}

}
