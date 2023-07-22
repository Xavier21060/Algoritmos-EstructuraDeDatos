package com.estructuradatos.algoritmos.map;

import java.util.*;

public class ContarOfWords {


    public static void main(String[] args) {

        Map<String, Integer> miMap = new HashMap<String, Integer>();
        createMap(miMap);

        showMap(miMap);

    }

    public static void createMap(Map<String, Integer> map) {
    	 int cuenta  = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una Cadena: ");
        String entrada = scanner.nextLine();

        String [] tokens = entrada.split("");

        for (String token : tokens) {

            String words = token.toLowerCase();

            if(map.containsKey(words)) {

                 cuenta = map.get(words); //Obtiene la cuenta
                map.put(words, cuenta);
           

                cuenta++;
            }else {
                map.put(words, cuenta);
                cuenta++;
            }

        }

    }

    public static void showMap(Map<String, Integer> map) {

        Set<String> keys = map.keySet();

        TreeSet<String> orderKeys = new TreeSet<>(keys);

        System.out.println(
                "\nEl mapa contienes: %nClave\t\tValor%n"
        );

        for (String clave: orderKeys){
            System.out.printf("%-10s%10s%n", clave, map.get(clave));

        }

        System.out.printf("Tamaño: %d%n¿vacio?: %b%n", map.size(), map.isEmpty());




    }

}
