package com.estructuradatos.algoritmos.ciclos;



import java.util.Scanner;

public class Power {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Write a base: ");
        int base = sc.nextInt();

        System.out.println("Write the exponent of the base: ");
        int exponent = sc.nextInt();
        int result =2;

        for (int i = 1; i <=exponent; i++)


        {

            System.out.println(result + "^" + i);

        }

    }

}
