package com.collection.list.set.treeset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//hashset intrnal arch... hashMap --> hashmap-->
		HashSet<String> hs = new HashSet<String>();
		hs.add("parth");
		hs.add("neha");
		hs.add("jay");
		hs.add("jay");
		hs.add("raj");
		hs.add("ok");
		
		//hs.contains("")
		
		for(String s:hs) {
			
			System.out.println(s);
		}
		
		
	}
}
