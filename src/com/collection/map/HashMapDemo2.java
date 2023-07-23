package com.collection.map;

import java.util.HashMap;
import java.util.Map;

class Person{
	
	int id;
	String name;
	int age;
	public Person(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
}
public class HashMapDemo2 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, Person> personsmap = new HashMap<Integer, Person>();
		Person p1 = new Person(101, "raj", 23);
		Person p2 = new Person(102, "jayraj", 25);
		Person p3 = new Person(109, "rajvi", 29);
		personsmap.put(1, p1);
		personsmap.put(3, p2);
		personsmap.put(9, p3);
		
		
		
		for(Map.Entry m:personsmap.entrySet()) {
			
			System.out.println(m.getKey());
			Person p = (Person) m.getValue();
			System.out.println("Id  Name  AGe");
			System.out.println(p.id + " "+p.name + " "+p.age);
			System.out.println("----------------------------");
		}
		
		
	}
}
