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


		//Para recorrer cada posicion del array
		for (int i = 0; i < nums.length; i++) {

			/**
			 * Verifica si en la posicion (i), se encuentra el target
			 * si esa asi devuelve la posicion
			 */
			if (nums[i] == target || nums[i] != target && nums[i] > target) { 

				return i;
			} 
		}
		
	
		/**
		 * En los casos que no encuentre target y sea mayor que la ultima posicion devuela una posicion más
		 * que sería el tamaño del arreglo
		 */
		return nums.length;
	}

	

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };

		System.out.println(searchInsert(nums, 1));
	}

}
