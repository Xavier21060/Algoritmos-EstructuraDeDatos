package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * 
 * Realizar un programa que pida un numero y a continuacion un digito El
 * programa nos debe dar la poscion o posiciones de izquierda a derecha que
 * ocupa el digito en el numero introducido
 * 
 * @author Xavier Snachez
 *
 */
public class PosicioDelDigito {

	private static int volteado = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero, digito, posicion = 0, contador = 0, cociente, residuo, isPresente = 0;

		System.out.println("Digite un numero");
		numero = sc.nextInt(); // 1232

		System.out.println("Que numero desea conocer la posicion en " + "la que se encuentra el  numero");

		digito = sc.nextInt();

		cociente = numero;
		while ((cociente != 0)) {

			residuo = cociente % 10; // Para conocer los digitos del del numero de derecha a izquierda

			cociente /= 10; // para que el cociente llegué a cero y poder sacar el resido que en este caso sería la ultima posicion

			volteado = (volteado * 10) + residuo;
			contador++;

			if (cociente == 0) {

				while (volteado != 0) {

					isPresente++;
					posicion = volteado % 10;

					volteado /= 10;

					if (posicion == digito) {
						System.out.println("Se encuentra en la posicion: " + isPresente);
					}

				}

			}

		}
		
		System.out.println("El numero tiene " + contador + " digitos");;

	}
}
