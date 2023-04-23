package com.estructuradatos.algoritmos.ciclos;


/**
 * Realiza un programa que sume los 100 numeros siguientes a un numero entero introducido por teclado
 * 
 * @author usuario
 *
 */
public class SumaOfTheFirst100Number {

	
	public static void main(String[] args) {
		
		System.out.println(sumaDe100Numeros(-7));
	}
	
	
	public static int sumaDe100Numeros(int n) {
		
		int aux = n + 100; //Los 100 numeros siguientes al numero introducio es decir se le suman 100 numeros
		int suma = 0;
		
		if (n > 0) {
			for (int i = n; i < aux; i++) {
				suma += i;
			}
			
			
		}else {
			
			System.out.println("El numero no es mayor que cero");
					
		}
		
		return suma;
	}
}
