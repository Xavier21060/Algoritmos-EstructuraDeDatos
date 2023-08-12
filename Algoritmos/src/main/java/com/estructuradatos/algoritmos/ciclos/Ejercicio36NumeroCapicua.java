package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * @Description: Escribir un programa que diga si un numero introducido por
 *               teclado es capicua
 * 
 * @author Xavier Sánchez
 *
 */
public class Ejercicio36NumeroCapicua {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroCapicua = 0; 
		int residuo = 0; //Para calcular el residuo del numero o el ultimo digito del numero

		System.out.println("Digite un numero: ");
		int numero = sc.nextInt();

		int aux = numero;

		if (numero > 0) {

			while (numero != 0) { //Mientras el cociente de la division sea distinto de cero

				residuo = numero % 10; // vamos obteniendo el ultimo digito del número

				numero /= 10; // vamos obteniendo el cociente de la division

				numeroCapicua = (numeroCapicua * 10) + residuo; // Voltemos el numero para verificar que sea igual de hacia delante y hacia atrás

				if (numero == 0) {

					if (numeroCapicua == aux) {
						System.out.println("El numero es capicua.");
					} else {
						System.out.println("El numero " + aux + " no es capicua");
					}
				}

			}

		}

	}
}
