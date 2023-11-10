package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * @Description: Realizar un programa que diga los digitos que aparecen y los
 *               que no aparecen en numero introducido porteclado
 * @author Xavier Sanchez
 *
 */

public class Ejercicio48DigitosDeUnNumero {

	public static void main(String[] args) {

		exercise();

	}

	static void exercise() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite un numero: ");
		long num = sc.nextLong();

		long digitosEncontrados = 0;
		long digitosNoEncontrados = 0;

		long residuo = 0;

		boolean encontrado;

		int increment = 0;

		long aux = 0;
		
		int saveCero = 1;

		do {

			aux = num; //el numero introducido lo guarde en auxiliar

			encontrado = false; //para verificar que el numero fue encontrado

			while (aux > 0) { //mientras el numero introducido sea mayor que cero, va seguir iterando

				residuo = aux % 10;

				aux /= 10;

				if (increment == residuo) {
					if(increment ==0 && residuo ==0) {
						saveCero = (int) residuo;
					}
					encontrado = true;
				}
			}

			if (encontrado) {
				digitosEncontrados = (digitosEncontrados * 10) + increment;
			} else if (!encontrado) {
				digitosNoEncontrados = (digitosNoEncontrados * 10) + increment;
			}
			increment++;
		} while (increment < 10); //increment para la iteracion de los numero del 0 al 9

		System.out.print("Digistos encontrados en el numero: " );
		System.out.println(saveCero == 0 ? saveCero + "" + digitosEncontrados: digitosEncontrados);
		System.out.println("Digitos no encontrados en el numero: " + digitosNoEncontrados);

	}
}
