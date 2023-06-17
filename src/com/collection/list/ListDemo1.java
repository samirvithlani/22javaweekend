package com.collection.list;

import java.util.ArrayList;
import java.util.List;

//java.util
public class ListDemo1 {

	
	public static void main(String[] args) {
		
		
		//method ->
		//its sotre data in dynamic array
		///list allow duplicate elements
		//list is hetrog...
		//list store data in homogenius manner
		//list is orderd
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add(1, "node");
		list.add("js");
		
		//System.out.println(list.get(0));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		String rem = list.remove(0);
		System.out.println("removing.."+rem);
		boolean flag = list.remove("js2");
		System.out.println(flag);
		System.out.println("after removing list...");
		
		
		for(String s:list) {
			
			System.out.println(s);
		}
		
		System.out.println("contains..."+list.contains("python"));
		List<String> slist = list.subList(0,2);
		for(String s:slist) {
			
			System.out.println(".."+s);
		}
		
		String str = list.toString();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
