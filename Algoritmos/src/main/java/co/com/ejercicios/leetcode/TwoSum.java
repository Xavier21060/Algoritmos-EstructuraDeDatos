package co.com.ejercicios.leetcode;

import java.util.Arrays;

import javafx.util.converter.NumberStringConverter;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
 * nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6 Output: [1,2]
 * 
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6 Output: [0,1]
 * 
 * @author usuario
 *
 */
public class TwoSum {

	public static void main(String[] args) {

		int num[] = { 2, 7, 11, 15 }; //target  9

		int num2[] = { 3,2,4 }; //target  6
		
		int num3[] = {3,3};//target  6
		
		int num4[] = { 2,5,5,11 };//target  10
	
		int [] target = {9, 6, 6, 10};//target 
		
		

		int resul[] = twoSum(num4, target[3]);

		
		for (int i = 0; i < resul.length; i++) {
			System.out.print(" " + resul[i] );
		}

	}

	public static int[] twoSum(int[] nums, int target) {

		int output[] = new int[2];

		int index = 0;
		/**
		 * Que agarre la primera posicion y vaya iterando sobre las siguientes posiciones
		 * y las relacione
		 */
		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]+ nums[j] == target) {

					for (int k = 0; k < output.length; k++) { // para recorrer el tamaño del arrglo resultante
						
						index = i;
						i=j;
						output[k] = index;
					}

					return output;
				}

			}

		}
		return null;

	}

}
