package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

public class Ejercicio43DividirNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite un numero: ");
		int num = sc.nextInt();

		System.out.println("Digite la posicion en la cual" + " desea dividir el numero: ");

		int posicionDivir = sc.nextInt();

		int cifras = 0;

		int aux = 0;
		int residuo = 0;
		int volteado = 0;

		int numeroPartido = 0;
		boolean isVolteado = false;
		int numeroVolteado = 0;
		while (num != 0) {

			cifras++;
			residuo = num % 10;
			volteado = (volteado * 10) + residuo;
			num /= 10;

			if (num == 0) {

				cifras = 0;
				aux = 0;
				residuo = 0;
				
				
				while (volteado != 0) {

					
					cifras++;
					residuo = volteado % 10;
					numeroVolteado = (numeroVolteado * 10) + residuo;
					volteado /= 10;

					if ((cifras + 1) == posicionDivir) {
						aux = numeroVolteado;
						isVolteado = true;
						
						if (isVolteado) {
							numeroPartido = volteado;
							
							System.out.println("El numero partdo: " + numeroPartido + "<--->"
									+ " el numero volteado: " + numeroVolteado) ;
							residuo = 0;
							numeroVolteado = 0;
							
							
							while(numeroPartido != 0) {
								
								residuo = numeroPartido % 10;
								numeroVolteado = (numeroVolteado * 10) + residuo;
								numeroPartido /= 10;
								
								System.out.println("Residuo: " + residuo + "<---> numero Partido: "
										+ numeroPartido + " >---> numero volteado:  " + numeroVolteado);
								
							}
							break;
						}
					}

				}
			}

		}

		System.out.println(
				"El numero divido en la posicion: " + posicionDivir + "" + " es: " + aux + "----" + numeroVolteado);

	}
}
