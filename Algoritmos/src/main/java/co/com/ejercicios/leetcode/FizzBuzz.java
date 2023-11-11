package co.com.ejercicios.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

	static List<Integer> list;
	static List<String> list2;

	public static List<String> fizzBuzz(int n) {

		List<String> ar = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			ar.add(i, String.valueOf(list.get(i)));

			if (list.get(i) % 3 == 0 && list.get(i) % 5 == 0) {

				ar.add(i, "FizzBuz");
				ar.remove(i + 1);

			} else if (list.get(i) % 3 == 0) {
				ar.add(i, "Fizz");
				ar.remove(i + 1);
			} else if (list.get(i) % 5 == 0) {
				ar.add(i, "Buz");
				ar.remove(i + 1);
			}

		}

		return ar;
	}

	public static List<String> fizzBuzz2(int n) {


		list2 = new ArrayList<>(n);

		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j <= i; j++) {

				if (i %3 == 0 && i % 5 == 0 ) {
					
					list2.add(j-1, "FizzBuzz");
				
				}else if (i %3 == 0 ){
					
					list2.add(j-1, "Fizz");
				}else if(i % 5 == 0) {
					list2.add(j-1, "Buzz");
				}else {
					
					list2.add(j-1, String.valueOf(i));
				}

				
			}

		}

		return list2;
	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz2(15));

	}
}
