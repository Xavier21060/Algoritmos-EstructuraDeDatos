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

	private static boolean isVolteado = false;
	private static Scanner sc;
	private static int[] posicionesDelDigito;
	private static int[] arreglo;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int numero, digito, contador = 0;

		int cociente;

		System.out.println("Digite un numero");
		numero = sc.nextInt(); // 1232

		System.out.println("Que numero desea conocer la posicion en " + "la que se encuentra el  numero");

		digito = sc.nextInt();

		cociente = numero;

		int residuo = cociente;
		int volteado = 0;

		while (cociente != 0 || !isVolteado) {

			/**
			 * Se utilizar para conocer el residuo, en este caso el residuo siempre es la
			 * ultima posicion del numero
			 */
			residuo = cociente % 10; // Para conocer los digitos del del numero de derecha a izquierda

			/**
			 * Cada se divide entre 10 y se le quita una posicio hasta que sea cero
			 */
			cociente /= 10;

			/**
			 * Se cambian las posiciones del numero
			 */
			volteado = volteado * 10 + residuo;

			contador++;
			/**
			 * cuando el cociente sea cero
			 */
			if (cociente == 0) {

				isVolteado = true;
				cantidaDeNumeros(volteado, digito);

			}

		}
		System.out.println("El numero tiene: " + contador + " digitos");

	
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

	}

	/**
	 * Funcion que retorna la posicion del digito que se encuentra en el numero
	 * 
	 * @param numeroVolteado
	 * @param digito
	 */
	private static void cantidaDeNumeros(int numeroVolteado, int digito) {
		int con = 0;

		int i = 0;
		while (numeroVolteado != 0) {
			int residuo = numeroVolteado % 10;

			numeroVolteado /= 10;
			con++;

			if (residuo == digito) {

				i++;

				System.out.println("Posicion: " + con);
				posicionesDelDigito = new int[i];
				
				arreglo = new int[posicionesDelDigito.length];
				
				for (int j = 0; j < arreglo.length; j++) {
					arreglo[j] = con;
					
				}
				
			}	

		}


	}
	
	private static int[] position(int arr[], int contador) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = contador;
			
			System.out.println(arr[i]);
		}
		
		return arr;
		
	}


}
