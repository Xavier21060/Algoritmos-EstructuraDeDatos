package co.com.ejercicios.leetcode;

/**
 * Given an integer x, return true if x is a palindrome and false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
 * and from right to left.
 * 
 * Example 2:
 * 
 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * Example 3:
 * 
 * Input: x = 10 Output: false Explanation: Reads 01 from right to left.
 * Therefore it is not a palindrome.
 * 
 * 
 * @author Xavier Sanchez
 *
 */
public class NumberPailindrome {

	public static boolean isPalindrome(int x) {

		boolean isPalindrome = false;

		int aux = x;

		int residuo = 0;

		int numeroVolteado = 0;

		while (x != 0) {
			isPalindrome = false;

			residuo = x % 10;

			x /= 10;
			numeroVolteado = (numeroVolteado * 10) + residuo;

			System.out.println(numeroVolteado);
			
			if (x == 0) {

				if (numeroVolteado > 0 && numeroVolteado  == aux) {
					isPalindrome = true;
				}
			}
		}
		if (aux == 0) {
			isPalindrome = true;
		}

		return isPalindrome;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
	}

}
