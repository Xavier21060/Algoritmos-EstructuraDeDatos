package co.com.ejercicios.leetcode;

import java.util.Arrays;

import sun.text.normalizer.CharTrie.FriendAgent;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"] Output: "fl"
 * 
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
 * common prefix among the input strings.
 * 
 * 
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 200 0 <= strs[i].length <= 200
 * 
 * @author usuario
 *
 */
public class LongestCommonPrefix {

	private static String strs[] = {"mineral","mina","", "mimpo", "minesota", "mito"};
	private static String strs1[] = { "dog", "racecar", "car" };
	private static	String[] array = {"ab", "a"};
	

	public static String longestCommonPrefix(String[] strs) {
		String prefix = "";
		
		Arrays.sort(strs);
		int tamaño = strs[0].length();

		int size = strs.length;

	
		
		for (int i = 0; i < tamaño; i++) { // Agarra la primera posicion del arreglo ==> flower

			String pa = strs[size - 1];
			if (strs[0].charAt(i) == strs[size - 1].charAt(i)) {

				prefix += strs[0].charAt(i);
			
			} else {
				break;
			}
		}

		return prefix;
	}

	public static void main(String[] args) {
		System.out.println("Aca es: " + longestCommonPrefix(array) + "\n");

	}

}
