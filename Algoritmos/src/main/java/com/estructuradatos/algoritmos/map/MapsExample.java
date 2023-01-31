package com.estructuradatos.algoritmos.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExample {

	
	public static void main(String[] args) {
	
		Map<String, String> hashMap = new HashMap<String, String>();
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		
		//Los elementos en un mapa de tipo HashMap, no respetan el orden de inserción.
        hashMap.put("uno", "Andres");
        hashMap.put("dos", "Jaime");
        hashMap.put("tres", "Felipe");
        hashMap.put("cuatro", "Sebastián");
        hashMap.put("cinco", "Eduardo");
        hashMap.put("seis", "Rodrigo");
        hashMap.put("siete", "Yadira");
        hashMap.put("ocho", "Sofia");
        hashMap.put("nueve", "Oyuki");
        hashMap.put("diez", "Concepción");
        hashMap.put("once", "Silvia");
        hashMap.put("doce", "Adriana");
        hashMap.put("trece", "Jacinto");
        hashMap.put("catorce", "Javier");
        hashMap.put("quince", "Arturo");
        hashMap.put("dieciseis", "Irma");
  
        System.out.println("hashMap: " + hashMap);
        System.out.println("");
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("People " + entry.getKey()+ " " + entry.getValue());
        }
        
        //Los elementos en un mapa de tipo LinkedHashMap, mantienen el orden de inserción.
        linkedHashMap.put("uno", "Andres");
        linkedHashMap.put("dos", "Jaime");
        linkedHashMap.put("tres", "Felipe");
        linkedHashMap.put("cuatro", "Sebastián");
        linkedHashMap.put("cinco", "Eduardo");
        linkedHashMap.put("seis", "Rodrigo");
        linkedHashMap.put("siete", "Yadira");
        linkedHashMap.put("ocho", "Sofia");
        linkedHashMap.put("nueve", "Oyuki");
        linkedHashMap.put("diez", "Concepción");
        linkedHashMap.put("once", "Silvia");
        linkedHashMap.put("doce", "Adriana");
        linkedHashMap.put("trece", "Jacinto");
        linkedHashMap.put("catorce", "Javier");
        linkedHashMap.put("quince", "Arturo");
        linkedHashMap.put("dieciseis", "Irma");
        
		
		
		
		
	     for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
	         System.out.println("People " + entry.getKey()+ " " + entry.getValue());
	     }	
	}
}
