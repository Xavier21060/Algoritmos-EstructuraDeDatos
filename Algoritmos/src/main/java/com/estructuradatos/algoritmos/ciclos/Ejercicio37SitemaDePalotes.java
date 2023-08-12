package com.estructuradatos.algoritmos.ciclos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SALOAD;

public class Ejercicio37SitemaDePalotes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite un numero: ");
		int numero = sc.nextInt();

		Map<Integer, String> sistema = new HashMap<Integer, String>();

		sistema.put(0, " ");
		sistema.put(1, "|");
		sistema.put(2, "||");
		sistema.put(3, "|||");
		sistema.put(4, "||||");
		sistema.put(5, "|||||");
		sistema.put(6, "||||||");
		sistema.put(7, "|||||||");
		sistema.put(8, "||||||||");
		sistema.put(9, "|||||||||");

		Iterator<Integer> iter = sistema.keySet().iterator();
		Iterator<Entry<Integer, String>> iter2 = sistema.entrySet().iterator();

		int digitoNumero = 0;
		int numeroAlReves = 0;
		int cifra = 0;

		while (numero != 0) {

			digitoNumero = numero % 10;

			numero /= 10;

			numeroAlReves = (numeroAlReves * 10) + digitoNumero;

			cifra++;

			if (numero == 0) {

				while (numeroAlReves != 0) {

					digitoNumero = numeroAlReves % 10;

					numeroAlReves /= 10;

					init(sistema, digitoNumero);

				}
			}

		}

	}

	static void init(Map<Integer, String> map, int numero) {

		Integer key;
		String values = "";
		String salto = "-";
		Iterator<Integer> iterator = map.keySet().iterator();

		while (iterator.hasNext()) {

			values = map.get(numero);
			System.out.print(values + salto);

			break;

		}

	}
}
