package com.estructuradatos.algoritmos.While;

/**
 * Mostrar los numeros multiplos de 5 de 0 100 en for
 */
public class MultiplosofFive {


    public static void main(String[] args) {

        System.out.println("Multiplos de 5 a 100 en un for");

        for (int i = 0; i <=100 ; i++) {

            if (i %5 == 0)  {
                int multiplos = i; //Guarda todos los los multiplos de 5 en una nueva variable
               System.out.println("Los multiplos de 5 a 100 son: " + multiplos);
            }

        }



        System.out.println("\nMultiplos de 5 en while");

        int i = 0;

        while (i >= 0 && i <= 100){

            i++; //Aumente una cantidad a i

            if (i%5 == 0) {
                System.out.println("Multiplos de 5 en while: " + i);
            }
        }


        System.out.println("\nMultiplos de 5 en un do-while");

        int j = 0;
        boolean isMultiply = j%5 == 0;

        do {
            j++;

            if (j%5 == 0) {
                System.out.println("Multiplos de 5 en un do-while: " + j);
            }
        }while ( j<=100);
    }

}

    class exampleFor {
        /**
         * Mostar los numeros del 320 al 160 contando
         * de 20 en 20 en un for
         */

        public static void main(String[] args) {
            System.out.println("\nDe 320 a 160 en un for");

            /***
             * i va empezar en 320 y sea mayor a 120 que le quite de 20 en 20
              */
            for (int i = 320; i>=160; i-=20){
                System.out.println("Los numeros de 320 a 160 son: " + i);
            }

            System.out.println("_----------------------------------------------------------------");
            System.out.println("\nDe 320 a 160 en un while");

            int inicio = 320; //Desde que numero va a empezar a disminuir
            int finall = 160; //Hasta que numero va a dejar de disminuir

            while (inicio > finall){
                inicio -= 20;
                System.out.println("Los numeros de 320 a 160 son: " + inicio);

            }

            System.out.println("_----------------------------------------------------------------");
            System.out.println("\nDe 320 a 160 en un do-while");

            int g = 320; //Representa el inicio desde donde vamos a empezar a disminuir
            int k = 160; //Representa el final hasta donde vamos a dejar de disminuir

            do {

                System.out.println("Los numeros de 320 a 160 son: " + g );
                g -=20;


            }while (g >= k);

        }
    }
