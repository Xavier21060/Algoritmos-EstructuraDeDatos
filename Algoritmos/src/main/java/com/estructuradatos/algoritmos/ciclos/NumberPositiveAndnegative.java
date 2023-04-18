package com.estructuradatos.algoritmos.ciclos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPositiveAndnegative {


    public static void main(String[] args) {

        List<Integer> number = null;
        listNumner(number);


    }
    public static List<Integer> listNumner(List<Integer> number){
        Scanner sc = new Scanner(System.in);

        if ( number == null) {
            number = new ArrayList<>();
            for (int i = 0; i <= 10; i++) {

                System.out.println("Digite un numero: ");
                number.add(sc.nextInt());

            }
        }
        return number;
    }

    public static  List<Integer> showNumber(){

    }

}
