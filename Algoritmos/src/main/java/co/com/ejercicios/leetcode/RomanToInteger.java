package co.com.ejercicios.leetcode;


import java.util.HashMap;

import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000
 * 
 * 
 * (I) can be placed before V (5) and X (10) to make 4 and 9. (X) can be placed
 * before L (50) and C (100) to make 40 and 90. ( C) can be placed before D
 * (500) and M (1000) to make 400 and 900.
 * 
 * Example 1:
 * 
 * Input: s = "III" Output: 3 Explanation: III = 3.
 * 
 * Example 2:
 * 
 * Input: s = "LVIII" Output: 58 Explanation: L = 50, V= 5, III = 3.
 * 
 * Example 3:
 * 
 * Input: s = "MCMXCIV" Output: 1994 Explanation: M = 1000, CM = 900, XC = 90
 * and IV = 4.
 * 
 * 
 * 
 * @author Xavier Sanchez
 *
 */
public class RomanToInteger {

	private static final Map<Character, Integer> roman = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	
	private static int romanToInt2(String s) {
		int sum = 0;
		int n = s.length();
		int value = 0;
		int value2 = 0;

		for (int i = 0; i < s.length()-1; i++) {
			
			value = roman.get(s.charAt(i));
			value2 =  roman.get(s.charAt(i + 1));
			if (value < value2) {
				sum += value2 - value;	
				i++;
			} else {
				sum += roman.get(s.charAt(i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(romanToInt2("MCMXCIV"));
	}
}
