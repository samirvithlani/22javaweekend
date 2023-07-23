package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(22, "python");
		map.put(3, "cpp");
		map.put(42, "node");
		map.put(5, "php");
		map.put(2, "ajay");
		map.put(29, "ajay");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}
}
