package com.estructuradatos.algoritmos.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapIteraror {


    public static void main(String[] args) {


        /**
         * Forms of iterators a Map
         */
        Map<String, String> players = new HashMap<String, String>();

        //put ==> Para hacer insercciones
        players.put("Leo Messi", "Barcelona");
        players.put("Luis suares", "Barcelona");
        players.put("Juan fernado Quintero", "Medelli");
        players.put("Radamel Falcao", "Atletico Madrid");
        players.put("Cristiano Ronaldo", "Real Madrid");
        players.put("James Rodriguez", "Real Madrid");
        players.put("Pepe", null);


        //Method entrySet() of interface Set
       Set<Map.Entry<String, String>> e = players.entrySet();
       for (Map.Entry<String, String> entry : e){
           System.out.println(entry.getKey() + "=" + entry.getValue());
           System.out.println("\n");
       }

       for(Map.Entry<String, String> entry : players.entrySet()) {

           System.out.print("Jugador: " + entry.getKey() );
           System.out.println(" Equipo: " + entry.getValue());
       }

       System.out.println("");
       System.out.println("Impresion de jugadores.");

       for (String playes : players.keySet()) {

           System.out.println("Jugadores: " + playes.toString());
       }


       //Impresion de los valores
       System.out.println("");
       System.out.println("Impresion de equipos");
       for (String juga: players.values()) {

           System.out.println("Equipo: " + juga);
       }

        /**
         * Los Mapas no tienen Iteradores lo que se hace es iterar sobre
         * Iteratore de la interface Collection
         */

        for (Iterator < Map.Entry<String, String> > entry = players.entrySet().iterator(); entry.hasNext();) {
            Map.Entry<String,String> iter = entry.next();
            String player = iter.getKey();
            String team = iter.getValue();
        }

        System.out.println("\nImplementacion de la interfaz BiConsumer");
        players.forEach((player, team) -> {
            System.out.println("\nPlayer: " + player + " Team: " + team);
        });





    }


}
