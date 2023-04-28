package com.estructuradatos.algoritmos.ciclos;

/**
 * Mostrar los numero multiplos de 5 de 0 a 100
 * @author usuario
 *
 */
public class MultiplyFive {
	
	public static void main(String[] args) {
		
		int inicio = 0;
		int finalMultiply = 100;
		
		while(inicio < finalMultiply) {
			
			inicio+=5;
			System.out.println(inicio);
		}
		
		System.out.println("\nMultiplos de 5 en ciclo for: \n");
		int i;
		
		for(i = 0; i<=100; i+=5) {
			
			System.out.println(i);
		}
		
		System.out.println("\nMultiplos de 5 en ciclo do-while: \n");
		
		int j = 0;
		do {
			j+=5;
			
			
				System.out.println(j);
	
		} while (j < 100);

	}
	
	 static class numeroMul{
		
		public static void main(String[] args) {
			System.out.println("clase externa");
			
			for (int i = 320; i < 160 ; i--) {
				System.out.println(i + "22");
				
			}
			
		}
	}
	

}
