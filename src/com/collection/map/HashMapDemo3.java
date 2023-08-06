package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo3 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		List<String> l3 = new ArrayList<String>();
		
		l1.add("jay");
		l1.add("raj");
		l1.add("parth");
		
		l2.add("priya");
		l2.add("mansi");
		l2.add("neha");
		
		l3.add("java");
		l3.add("python");
		l3.add("c");
		
		HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		map.put(1, l1);
		map.put(2, l2);
		map.put(3, l3);
		
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			List<String> list = (List<String>) m.getValue();
			for(String s:list) {
				System.out.println(s);
			}
		}
		
	}
}
