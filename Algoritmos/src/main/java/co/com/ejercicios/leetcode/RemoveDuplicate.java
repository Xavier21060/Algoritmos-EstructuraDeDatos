package co.com.ejercicios.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

/**
 * Dada una matriz de números enteros ordenados en orden no decreciente, elimine
 * los duplicados en el lugar de modo que cada elemento único aparezca solo una
 * vez. El orden relativo de los elementos debe mantenerse igual. Luego devuelve
 * el número de elementos únicos en números.
 * 
 * 
 * Considere que la cantidad de elementos únicos de (nums) es (k); para ser
 * aceptado, debe hacer lo siguiente:
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_] Explanation: Your function
 * should return k = 2, with the first two elements of nums being 1 and 2
 * respectively. It does not matter what you leave beyond the returned k (hence
 * they are underscores).
 * 
 * Example 2:
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements
 * of nums being 0, 1, 2, 3, and 4 respectively. It does not matter what you
 * leave beyond the returned k (hence they are underscores).
 * 
 * 
 * @author Xavier Sanchez
 *
 */
public class RemoveDuplicate {

	private static int[] num1 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
	private static int num2[] = { 1, 2 };
	private static int num3[] = { 1, 1 };
	private static int num4[] = { 1, 1, 1 };



	public int removeDuplicates(int[] nums) {

		int aux = 1;

		int size = nums.length;
		
		

		for (int i = 0; i < size; i++) {// agarre la primera posicion

			if ((i+1) < size) {
				int cur = nums[i];
				int var = nums[i + 1];
				
				if (cur != var) {
					 nums[aux] = var;
					 aux++;	
				} 
			}
		}
			
		return aux;
	}

	public static void main(String[] args) {

		RemoveDuplicate duplicate = new RemoveDuplicate();


		System.out.println("\nElementos duplicados en el arreglo: " + duplicate.removeDuplicates(num4));
		

		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i]);
		}
	}

}
