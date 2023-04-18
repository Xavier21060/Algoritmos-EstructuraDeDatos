package com.estructuradatos.algoritmos.ciclos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPositiveAndnegative {


    public static void main(String[] args) {

        List<Integer> number =  listNumner();

        showNumber(number);




    }
    public static List<Integer> listNumner(){
        Scanner sc = new Scanner(System.in);
        List<Integer> number = null;

        if ( number == null || number != null) {
            number = new ArrayList<>();
            for (int i = 0; i <= 10; i++) {

                System.out.println("Digite un numero: ");
                number.add(sc.nextInt());

            }
        }
        return number;
    }

    public static List<Integer> showNumber(List<Integer> number){

        List<Integer> counterNumber = number;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i<= number.size()-1; i++){

            if (counterNumber.get(i) > 0){
                positive++;

            } else if (counterNumber.get(i) < 0) {
                negative++;
            }

        }

        System.out.println("Hay " + positive + " numeros positivos");
        System.out.println("Hay " + negative + " numeros negativos");

        return  counterNumber;



    }

}
