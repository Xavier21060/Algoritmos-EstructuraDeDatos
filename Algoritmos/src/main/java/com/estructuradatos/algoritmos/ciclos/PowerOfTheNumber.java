package com.estructuradatos.algoritmos.ciclos;

import java.util.Scanner;

/**
 * Write a program that asks for a base and an exponent and that calculate the power
 */
public class PowerOfTheNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a base: ");
        int base = sc.nextInt();

        System.out.println("Write the power of the base: ");
        int power = sc.nextInt();

        if (power > 0) {
            int result = base;

            for (int i = 0; i < power-1; i++) {

                result *= base;
                System.out.println(result);
            }
            System.out.println(result);
        }
    }
}
