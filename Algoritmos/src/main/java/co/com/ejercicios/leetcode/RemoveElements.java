package co.com.ejercicios.leetcode;

import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import sun.util.locale.provider.AuxLocaleProviderAdapter;

/**
 * Dada una matriz de enteros (nums) y un entero (val), quitar todas las
 * apariciones de val en nums en el lugar . El orden de los elementos puede ser
 * cambiado. A continuación, devolver el número de elementos en nums que no son
 * iguales a val.
 * 
 * Tener en cuenta el número de elementos en nums que no son iguales a val ser
 * k, de ser aceptado, debe hacer las siguientes cosas:
 * 
 * El cambio de la matriz nums tal que la primera k elementos de nums contienen
 * los elementos que no son iguales a val. El resto de los elementos de nums no
 * son importantes, así como el tamaño de nums. Volver k.
 * 
 * Personalizado Juez:
 * 
 * El juez pondrá a prueba su solución con el siguiente código:
 * 
 * int[] nums = [...]; // matriz de Entrada int val = ...; // Valor de quitar
 * int[] expectedNums = [...]; // La respuesta esperada, con la longitud
 * correcta. // Se ordenan con valores no equivale a val.
 * 
 * int k = removeElement(nums, val); // Llama a su aplicación
 * 
 * afirmar k == expectedNums.longitud; sort(nums, 0, k); // Ordenar los primeros
 * k elementos de nums for (int i = 0; i < actualLength; i++) { afirmar nums[i]
 * == expectedNums[i]; }
 * 
 * 
 * Si todas las afirmaciones de pasar, a continuación, la solución va a ser
 * aceptado .
 * 
 * 
 * 
 * Ejemplo 1:
 * 
 * Entrada: nums = [3,2,2,3], val = 3 Salida: 2, nums = [2,2,_,_] Explicación:
 * Su función debe devolver k = 2, con los dos primeros elementos de nums ser 2.
 * No importa lo que deje más allá de la devuelve k (de ahí que se subraya).
 * 
 * 
 * Ejemplo 2:
 * 
 * Entrada: nums = [0,1,2,2,3,0,4,2], val = 2 Salida: 5, nums =[0,1,4,0,3,_,_,_]
 * Explicación: Su función debe devolver k = 5, con los primeros cinco elementos
 * del numérica que contiene 0, 0, 1, 3, y 4. Tenga en cuenta que los cinco
 * elementos pueden ser devueltos en cualquier orden. No importa lo que deje más
 * allá de la devuelve k (de ahí que se subraya).
 * 
 * @author usuario
 *
 */
public class RemoveElements {

	private static int num1[] = { 3, 2, 2, 3 };
	private static int num2[] = { 0, 1, 2, 2, 3, 0, 4, 2 };



	public static int removeElement(int[] nums, int val) {

		int j = 0;

		int aux = 0; //Para contar los elementos del arreglo final

		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] != val ) {
				
				nums[j] = nums[i]; //en la posicion cero guarde el valor del arreglo que es diferente de (val)		
				j++; //vaya aumentando la posicion
				aux++; //vaya contando los elementos que va insertando
				
			}
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + "= " + nums[i]);
		}

		return aux;
	}

	public static void main(String[] args) {

		System.out.println("\nEl tamaño final del arreglo es: " + removeElement(num2, 2));
		System.out.println("\n-----------------------------------------------------------");

	
	
		


	}

}
