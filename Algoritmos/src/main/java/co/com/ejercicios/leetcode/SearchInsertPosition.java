package co.com.ejercicios.leetcode;

/**
 * Dada una matriz ordenada de los distintos números enteros y de un valor
 * objetivo, volver al índice si el destino se encuentra. Si no, volver al
 * índice en el que sería si se inserta en orden.
 * 
 * Usted debe escribir un algoritmo con O(log n) tiempo de ejecución de la
 * complejidad.
 * 
 * 
 * 
 * Ejemplo 1:
 * 
 * Entrada: nums = [1,3,5,6], destino = 5 Salida: 2
 * 
 * 
 * Ejemplo 2:
 * 
 * Entrada: nums = [1,3,5,6], destino = 2 Salida: 1
 * 
 * 
 * Ejemplo 3:
 * 
 * Entrada: nums = [1,3,5,6], destino = 7 Salida: 4
 * 
 * 
 * @author Xavier Sanchez
 *
 */
public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {

		int j = 0;

		boolean isPresent = false;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target || nums[i] != target && nums[i] > target) {

				isPresent = true;

				j = i;

				return i;
			} 
		}
		
	
		return nums.length;
	}

	

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };

		System.out.println(searchInsert(nums, 4));
	}

}
