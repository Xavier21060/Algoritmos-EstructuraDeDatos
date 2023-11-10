package co.com.ejercicios.leetcode;

/**
 * Dadas dos cadenas, haystack y needle, devuelve el índice de la primera
 * aparición de haystack en needle, o -1 si la aguja no forma parte del pajar.
 * 
 * 
 * 
 * Ejemplo 1:
 * 
 * Entrada: haystack = "sadbutsad", needle = "sad" Salida: 0 Explicación: "sad"
 * aparece en los índices 0 y 6. La primera aparición está en el índice 0, por
 * lo que devolvemos 0.
 * 
 * Ejemplo 2:
 * 
 * Entrada: pajar = "leetcode", aguja = "leeto" Salida: -1 Explicación: "leeto"
 * no apareció en "leetcode", por lo que devolvemos -1.
 * 
 * @author Xavier Sanchez
 *
 */

public class FindOfTheFirstOccurrece {

	private static String haystack = "butsad";
	private static String needle = "sad";

	private static String haystack1 = "leetcode";
	private static String needle1 = "leeto";

	private static String haystack2 = "mississippi";
	private static String needle2 = "issi";

	private static String haystack3 = "mississippi";
	private static String needle3 = "issip";

	private static String haystack4 = "abc";
	private static String needle4 = "c";

	
	

	public static void main(String[] args) {

		System.out.println(strStr(haystack4, needle4));

	}

	public static int strStr(String haystack3, String needle3) {

		int j = 0;

		int index = 0;
		int size = haystack.length();

		String letter = "";

		String aux = "";

		System.out.println("hay: " + haystack.substring(0, haystack.length()-1));
		
		if (needle.length() >= 0 || haystack.length() > 1) {
			for (int k = 0; k < size; k++) {

				if (haystack.charAt(k) != needle.charAt(j)) {
						
					j = 0;
			
				} else {

					letter += haystack.charAt(k);
					index = k;
					
					System.out.println(index + "--------------" + letter);
					j++;
				}

				if (needle.equals(letter)) {
					break;
				}

			}
		} else {
			letter = haystack;
		}

		return haystack.length() == needle.length() || needle.equals(letter) ? (index - (needle.length() - 1)) : -1;
	}

}
