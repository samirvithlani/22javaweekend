package com.collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(101, "java");
		tmap.put(102, "js");
		tmap.put(10, "cpp");
		tmap.put(1, "c");
		tmap.put(111, "python");
		
		Entry<Integer, String> entry = tmap.firstEntry();
		//System.out.println(entry.getKey()+"--"+entry.getValue());
		
		//tmap.lastEntry();
		//tmap.firstKey();
		//tmap.lastKey();
		
		//tmap.pollFirstEntry(); //it will remove...
		//tmap.pollLastEntry();
		
		System.out.println("celing.."+tmap.ceilingEntry(9));
		System.out.println("floor"+tmap.floorEntry(9));
		
		
		
		NavigableMap<Integer, String>nmap =tmap.descendingMap();
		
		SortedMap<Integer, String> smap = tmap.tailMap(10);
		smap = tmap.tailMap(10, false);
		
		smap = tmap.headMap(111);
		smap = tmap.headMap(111, true);
		

		
		for(Map.Entry m : smap.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
	}
}
