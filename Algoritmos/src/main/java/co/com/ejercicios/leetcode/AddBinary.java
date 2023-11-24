package co.com.ejercicios.leetcode;

import java.math.BigInteger;

public class AddBinary {

	static String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";



	public static String addBinary(String a, String b) {
		BigInteger valorOfPotencia;
		BigInteger sumaBinary = BigInteger.ZERO;

		int aux = a.length() - 1;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(aux) == '1') {
				valorOfPotencia = new BigInteger("2").pow(i);
				sumaBinary = sumaBinary.add(valorOfPotencia);
			}
			aux--;
		}

		aux = b.length() - 1;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(aux) == '1') {
				valorOfPotencia = new BigInteger("2").pow(i);
				sumaBinary = sumaBinary.add(valorOfPotencia);
			}
			aux--;
		}

		System.out.println("Suma en decimal: " + sumaBinary);

		// Verificar si la suma es cero y devolver "0"
		if (sumaBinary.equals(BigInteger.ZERO)) {
			return "0";
		}

		int residuo;
		StringBuilder binario = new StringBuilder();

		// Convertir sumaBinary a binario
		while (sumaBinary.compareTo(BigInteger.ZERO) != 0) {
			residuo = sumaBinary.intValue() % 2;
			sumaBinary = sumaBinary.divide(BigInteger.valueOf(2));
			binario.insert(0, residuo);
		}

		return binario.toString().replace("-", "");
	}

	public static void main(String[] args) {

		int potenciaBinaria = 2;
		double valorOfPotencia = 0;
		int sumaBinary = 0;

		int aux = a.length() - 1;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(aux) == '1') {
				valorOfPotencia = Math.pow(potenciaBinaria, i);
				sumaBinary += valorOfPotencia;

			}
			aux--;
		}

		aux = b.length() - 1;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(aux) == '1') {
				valorOfPotencia = Math.pow(potenciaBinaria, i);
				sumaBinary += valorOfPotencia;
			}
			aux--;
		}

		int residuo = 0;
		String binario = "";

		while (sumaBinary != 0) {

			residuo = sumaBinary % 2;
			sumaBinary /= 2;
			binario = residuo + binario;

		}

		System.out.println(addBinary(a, b));

	}
}
