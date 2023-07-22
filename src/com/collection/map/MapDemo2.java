package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"amit");
		map.put(9,"parth");
		map.put(34,"ajay");
		map.put(44,"priya");
		map.put(42,"priya");
		//map.putIfAbsent(9, "parsh");
		
		String value = map.get(99);
		System.out.println("value = "+value);
		
		System.out.println("con..."+map.containsKey(90));
		System.out.println("con value = "+map.containsValue("priya"));
		
//		String remval = map.remove(422);
//		System.out.println("removing.."+remval);
		
		
		//map.remove(42, "priya");
		Set<Integer> keys = map.keySet();
		
		for(int k :keys) {
			System.out.println(k);
		}
		
		Collection<String> c = map.values();
		for(String s: c) {
			
			System.out.println("value.."+s);
		}
		
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
	}
}
