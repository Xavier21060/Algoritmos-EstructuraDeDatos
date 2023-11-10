package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Realizar un programa que calcule el 1). MAXIMO, 2). el MINIMO, 3). la MEDIA
 * de una serie de número intoducidos por teclado.
 * 
 * °El programa terminará cuando el usuario introduzca un número primo Este
 * ultimo numero no se tendra en cuenta en los calculos. El program tambien debe
 * indicar cuantos numeros ha introducido el usuario (sin contar el primo)
 * 
 * @author Xavier Sanchez
 *
 */
public class Ejercicio49MediaDeNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, media = 0, sumNum = 0, cantiNum = 0;

		int aux = 0;
		boolean isprimo;

		do {

			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();
			
			isprimo = true;

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					isprimo = false;
				}
			}

			if (!isprimo) {
				max = num > max ? num : max;
				min = num < min ? num : min;
			}
			cantiNum++;
		} while (!isprimo);

		System.out.println("Maximo: " + max);
		System.out.println("Minimi: " + min);
		System.out.println("Media: " + sumNum / cantiNum);

	}

}
