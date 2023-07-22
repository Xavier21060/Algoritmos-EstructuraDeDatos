package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Realize un programa que calcule las horas transcurridas entre dos horas de
 * dos días a la semana. NO SE TENDRA EN CUENTA LOS MINUTOS NI LOS SEGUNDOS.
 * 
 * El dia de la sema se puede pedir como numero del 1 al 7 o como cadena de
 * "LUNES <-> DO MINGO".
 * 
 * Se debe comprobarc que el usuario introduce los datos correctamente y que el
 * segundo día es posterior al primero
 * 
 * @author Xavier Sanchez
 *
 */

@SuppressWarnings("resource")

public class HorasTransacurridad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int dia = 1;

		String diaCadena = "";
		int diaEnHoras = 0;
		int i; // horas

		for (i = 0; i <= 168; i++) { // 168 corresponde a las horas totales que tiene la semana
			// i = horas del dia, empieza a las ceros horas y debe ser menor a las horas de
			// la seman que son 168 horas que tiene una semana

			dia= i/dia;
		
			
			if (dia >= 0 && dia <= 7) {
				switch (dia) {

				case 1:
					diaCadena = "Lunes";
					System.out.println("El dia lunes tiene: " + diaEnHoras);
					break;
				case 2:
					diaCadena = "Martes";
					break;
				case 3:
					diaCadena = "Miercoles";
					break;
				case 4:
					diaCadena = "Jueves";
					break;
				case 5:
					diaCadena = "Viernes";
					break;
				case 6:
					diaCadena = "Sabado";
					break;
				case 7:
					diaCadena = "Domingo";
					break;
					
					default:
						System.out.println("Dia incorrecto");
					break;
				}

				System.out.println(diaEnHoras + ". El dia de: " + dia + " es: " + diaCadena);

			}
			dia++;
			diaEnHoras++;
			

		}
		
		

	}
}
