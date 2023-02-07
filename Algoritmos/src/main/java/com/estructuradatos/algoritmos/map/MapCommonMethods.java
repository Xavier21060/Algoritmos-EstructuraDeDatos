package com.estructuradatos.algoritmos.map;

import java.util.HashMap;
import java.util.Map;

public class MapCommonMethods {

	//Ejemplo de un mapa que almacene el nombre de un jugador
	//En relacion con su equipo
	
	public static void main(String[] args) {
		
		Map<String, String> players = new HashMap<String, String>();
		
		//put ==> Para hacer insercciones
		players.put("Leo Messi", "Barcelona");
		players.put("Luis suares", "Barcelona");
		players.put("Juan fernado Quintero", "Medelli");
		players.put("Radamel Falcao", "Atletico Madrid");
		players.put("Cristiano Ronaldo", "Real Madrid");
		players.put("James Rodriguez", "Real Madrid");
		players.put("Pepe", null);
		//Used method pullAll(Map<? extends K, ? extends V> m)
//		Map<String, String> players2 = new HashMap<>();
//		players2.putAll(players);
//		
		//we add a value if  it's absent
		players.putIfAbsent("Pepe", "Manchester United"); //If the key  value is absent 
		System.out.println("The group of Pepe is " + players.get("Pepe"));
	
		//Obtener los valores de un mapa
		String teamFalcao = players.get("Radamel Falcao");
		System.out.println("Team's Falcao is : " + teamFalcao.toString());
		
		
		//si una clave esta incluida dentro del mapa 
		boolean containskey = players.containsKey("Radamel Falcao");
		
		if (containskey) {
			String team = "El equipo de radamel falcao es: ";
			System.out.println(team + " " + players.get("Radamel Falcao"));
		}
		
		
		//si existe un valor en especifico
		boolean containsValue = players.containsValue("Real Madrid");
		
		if (containsValue) {

			String s ;
			System.out.println("La llave del valor es: "  + players.entrySet().contains("Real Madrid"));
		}
		
		
	}
	
	
}
