package com.estructuradatos.algoritmos.While;


import java.util.Scanner;

/**
 * Realiza el control de aceso a una caja fuerte. la combinacion sera un numero de 4 cifras
 * el programa nos pedira la combinacion para abrirla si no acertamos, se nos mostrara el mensaje
 * "Lo siento esa no es la combinacion" y si acertamos se nos dira
 * "la caja se ha abierto satisfactoriamente"
 * Hay cuatro intentos para abrirla
 *
 */
public class CajaFuerte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*1). Generar un numero aletorio de 4 cifras*/
        System.out.println("El Numero aleatorio es: ");

        int [] aleatorio = new int[4]; //Que el numero aletorio es de 4 cifras.

        int numeroADigitar[] = new int[4];
        int intentos = 4; //El maximo de intentos para poder adivinar el numero aleatorio

        String mensaje = ""; // Mensaje a mostrar si se ha adivinado la clave o no

        for (int i = 0; i < aleatorio.length ; i++) {

           aleatorio[i] = (int) (Math.random()*10); //En un arreglo se guarda el numero aletorio generado por el metodo random de la clase Math

            System.out.print("Introduce un  digito: ");
            numeroADigitar[i] = sc.nextInt();

        }


        for (int i = 0; i <aleatorio.length ; i++) {

            try {
                System.out.print(aleatorio[i] + "-");

                if (numeroADigitar[i] == aleatorio[i]){
                    System.out.print("\nla caja se ha abierto satisfactoriamente" + aleatorio[i] + "-");

                }else{
                    System.out.println("Lo siento esa no es la combinacion");
                }

                System.out.print(aleatorio[i] + "-");


            }catch (ArrayIndexOutOfBoundsException e) {
                ArrayIndexOutOfBoundsException e2 = new ArrayIndexOutOfBoundsException(i);
                System.out.println(e.toString());

            }

        }


    }


}
