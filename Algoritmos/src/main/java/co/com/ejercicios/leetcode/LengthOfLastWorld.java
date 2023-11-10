package co.com.ejercicios.leetcode;

/**
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with
 * length 5.
 * 
 * Example 2:
 * 
 * Input: s = " fly me to the moon " Output: 4 Explanation: The last word is
 * "moon" with length 4.
 * 
 * Example 3:
 * 
 * Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is
 * "joyboy" with length 6.
 * 
 * @author usuario
 *
 */
public class LengthOfLastWorld {
	
	static String t = "Hello World";
	static String te = "   fly me   to   the moon  ";
	static String tex = "luffy is still joyboy";
	
	public static int lengthOfLastWord(String s) {
        
	
		
		String letter = "";
		boolean isPresent = false;
		
		for (int i = 0; i < s.trim().length(); i++) {
			
			if (s.charAt(i) == ' ') { //si en la letra en la posicion que esta recorriendo hay un espacion que obtenga la letra
				isPresent = true;
				letter= s.substring(i);

			}
		}
		
		if (!isPresent) {
			return  s.trim().length();
		}
	
		
		
		return s.trim().length() > 1 ? letter.trim().length() : s.trim().length();
    }
	
	
	public static void main(String[] args) {
		System.out.println("El tamaño de la palabra es: " +lengthOfLastWord("day    as    "));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
