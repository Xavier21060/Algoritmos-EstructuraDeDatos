package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;


public class MediaOfNumbers {
	
	
	
	private static Scanner sc;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero: ");
		
		int number = sc.nextInt();
		
		System.out.println(contabilizarNumeros(number));
		
		
	}
	
	
	


	@SuppressWarnings("unused")
	public static  String contabilizarNumeros(int number) {
	
		sc = new Scanner(System.in);
		
		int cantidadTotalDeNumeros = 0; //contabilizar la totalidad de numeros
		int sumaDeNumeros = 0; //Para saber la media de todos los numeros introducidos
		int sumaDeNumerosImpares = 0; //Contabilizar la media de todos los numeros impares
		
		int numeroMayorPar = 0;
		int cantidaDeNumerosPares = 0;
		int sumaDeNumerosPares = 0;
		
		System.out.println("Digite un numero para iniciar el programa: ");
		 
		number = sc.nextInt();
		
		if (number > 0) {
			
			do {
				
				cantidadTotalDeNumeros++; //cantidad de numeros introducidos

				System.out.println("Digite otro numero");
				number = sc.nextInt();
				
				
				
				if (number % 2 == 0) {
					cantidaDeNumerosPares ++;
					sumaDeNumerosPares += number;

					if (number > numeroMayorPar) {
						numeroMayorPar = number;
					}
					
				}else if (number % 2 == 1) {
					
					sumaDeNumerosImpares += number;
					
					
				}
				
				sumaDeNumeros += number; // suma total de todos los numeros
				
				
				
			} while (number > 0);
		}
		
		int media = sumaDeNumeros/cantidadTotalDeNumeros;
		int mediaDePares = sumaDeNumerosPares/cantidaDeNumerosPares;
		
		
		
		return  "La media de todos los numeros: " + media + "\nla media de todo los numeros pares: " + mediaDePares + "\nel numero mayor par fue: " + numeroMayorPar
				+ "\nla cantidad de numeros introducios fue: " + cantidadTotalDeNumeros;
	}

}
