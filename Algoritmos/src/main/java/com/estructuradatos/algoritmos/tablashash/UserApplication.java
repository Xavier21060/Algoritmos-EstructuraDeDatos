package com.estructuradatos.algoritmos.tablashash;

import java.util.HashMap;
import java.util.Map;

public class UserApplication {
	
	public static void main(String[] args) {
		
		Map<User, User> users = new HashMap<>();
		
		User user1 = new  User(1, "Jhon", "jhon@mail.com");
		User user2 = new  User(1, "Jeniffre", "jennifer@mail.com");
		User user3 = new  User(1, "Maria", "maria@mail.com");
		User user4 = new  User(1, "Carlos", "carlosn@mail.com");
		
		
		users.put(user1, user1); //Inserting  the elements of an Object of type user
		users.put(user2, user2); //Inserting  the elements of an Object of type user
		users.put(user3, user3); //Inserting  the elements of an Object of type user
		users.put(user4, user4); //Inserting  the elements of an Object of type user
		
		System.out.println("Hashcode of user1: " + user1.hashCode());
		
		
	}

}
