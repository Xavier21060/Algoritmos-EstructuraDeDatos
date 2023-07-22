package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * @Description
 * Escribe un programa que, dado un numero entero positivo 
 * °Decir cuales son los numeros pares del número introducido por teclado
 * °Los dígitos pares deben mostrarse en orden, de izquierda a derecha
 * 
 * @author Xavier Sánchez
 *
 */
public class Ejercicio32 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digito un numero: ");
		
		int numero =  sc.nextInt(); //Guardamos el numero que es digitado por pantalla
		
		int numerosPares = 0; //Para mostrar los numeros pares de derecha a izquierda
		
		int residuo = 0; //Para calcular el residuo de un numero, en este caso la ultima cifra de un numero
		
		int sumaDeDigitosPares = 0; // Para sumar todos los numero pares
		
		int cantidadDigitosPares = 0; //Para conocer la cantidad de digitos pares que hay en número
		

		int numeroVolteadoPar = 0;//Para mostrar los numeros pares de izquierda a derecha
		
		int aux = 0;
		while(numero != 0) {
			
			residuo = numero % 10;
			numero /= 10; // vamos obteniendo el cociente de cada numero
			
			
			
			/**
			 * si la ultima cifra obtenida, su residuo es igual a cero
			 * quiero decir que es un nuemro par y se saca su logica
			 */
			if (residuo %2 == 0) { 
				sumaDeDigitosPares += residuo;
				cantidadDigitosPares++;
				numerosPares = (numerosPares * 10) + residuo;
				 aux = numerosPares;
				
			}
			
			if(numero == 0) {
				
				
				while(numerosPares != 0) {
					
					int residuoPar = numerosPares %10;
					numerosPares /=10;
					numeroVolteadoPar = (numeroVolteadoPar * 10) + residuoPar ;
				}
			}
			
			

		}
		
		System.out.println("Los numeros pares desordenados son: " + aux);
		System.out.println("La cantidad de digitos pares son: " + cantidadDigitosPares);
		System.out.println("la suma de los digitos pares son: "  + sumaDeDigitosPares);
		System.out.println("Los numero pares ordenados son: " + numeroVolteadoPar);
		
	}

}
