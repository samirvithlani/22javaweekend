package com.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//single insert.. list index data --> set hashset -->
//key value -> map->
//java.util.Map --> Map[i] -->
//TreeMap[c] ,HashMap[C]
//java.util.TreeMap
// map does not allow duplicate key
public class MapDemo1 {

	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("one",101);
		map.put("ok",1000);
		map.put("india", 1);
		map.put("a",89);
		map.put("ok",7000);
		
		//Set<Entry<String,Integer>> x= map.entrySet();
		//Entry is an inner interface  of Map interface
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
//		Map<String, Stirng>
//		Map< Integer,String>
		
		
	}
}
