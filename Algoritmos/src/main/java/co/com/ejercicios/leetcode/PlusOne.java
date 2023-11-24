package co.com.ejercicios.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Se le da un gran número entero representado como una matriz de enteros
 * digits, donde cada digits[i] es el ith dígitos de la parte entera. Los
 * dígitos están ordenados de más importante a menos importante de izquierda a
 * derecha. El gran número entero no contiene ningún líder 0's.
 * 
 * Incremento de las grandes entero por uno y devolver la matriz resultante de
 * dígitos .
 * 
 * 
 * 
 * Ejemplo 1:
 * 
 * Entrada: dígitos = [1,2,3] Salida: [1,2,4] Explicación: La matriz representa
 * el número entero 123. Incrementar en uno da 123 + 1 = 124. Por lo tanto, el
 * resultado debe ser [1,2,4].
 * 
 * 
 * Ejemplo 2:
 * 
 * Entrada: dígitos = [4,3,2,1] Salida: [4,3,2,2] Explicación: La matriz
 * representa el número entero 4321. Incrementar en uno da 4321 + 1 = 4322. Por
 * lo tanto, el resultado debe ser [4,3,2,2].
 * 
 * 
 * Ejemplo 3:
 * 
 * Entrada: dígitos = [9] Salida: [1,0] Explicación: La matriz representa el
 * número entero 9. Incrementar en uno da 9 + 1 = 10. Por lo tanto, el resultado
 * debe ser [1,0].
 * 
 * @author usuario
 *
 */

public class PlusOne {

	static int digits[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	static int digits1[] = { 9, 9, 9, 9 };
	static int digits2[] = { 9 }; // digits = []
	static int digits3[] = { 4, 3, 2, 1 }; // [9,8,7,6,5,4,3,2,1,0]
	static int digits4[] = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7,
			0, 1, 1, 1, 7, 4, 0, 0, 9 };

	public static int[] plusOne(int[] digits) {

		BigInteger num = BigInteger.ZERO;
		int resul[];

		for (int i = 0; i < digits.length; i++) {

			num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));

			if ((digits.length - 1 == i) && (digits[digits.length - 1] == 0)) {
				num = num.add(BigInteger.ONE);

			} else if ((digits.length - 1 == i)) {
				num = num.add(BigInteger.ONE);
			}

		}

		resul = new int[String.valueOf(num).length()];
		int k = resul.length - 1;

		BigInteger residuo = BigInteger.ZERO;
		while (num.compareTo(BigInteger.ZERO) != 0) {
			residuo = num.remainder(BigInteger.TEN);
			num = num.divide(BigInteger.TEN);

			resul[k] = residuo.intValue(); //Va a empezar a insertar datos de la ultila posicion
			k--;
		}

		return resul;
	}

	public static int[] plusOne2(int[] digits) {

		// Iterate over the digits from right to left.
		for (int i = digits.length - 1; i >= 0; i--) {
			// If the current digit is not 9, add 1 to it and return the array.
			if (digits[i] != 9) {
				digits[i]++;
				return digits;
			} else {
				// Otherwise, set the current digit to 0 and continue iterating.
				digits[i] = 0;
			}
		}
		// If all digits are 9, create a new array with one more element than the
		// original array,
		// set the first element to 1 and the rest to 0, and return the new array.
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}

	public static void main(String[] args) {
	

		System.out.println(Arrays.toString(plusOne2(digits2)));

	}

}
