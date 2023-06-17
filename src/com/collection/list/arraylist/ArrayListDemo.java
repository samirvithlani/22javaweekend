package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("cpp");
		al.add("node");
		al.add("ds");
		al.add("dsa");
		al.add(2, "c lang");
		
//		for(int i=0;i<al.size();i++) {
//			
//			System.out.println(al.get(i));
//		}
//	
		for(String s:al) {
			System.out.println(s);
		}
		
		System.out.println("/contains"+al.contains("node"));
		System.out.println(al.equals("dsa"));
		System.out.println("is empty..."+al.isEmpty());
//		String removedelm = al.remove(0);
//		System.out.println(removedelm+"removing...");
//		
//		System.out.println("removed?? "+al.remove("ds"));
//		
		
		
		//0  1 2 3 
		System.out.println(".....");
		List<String> slist = al.subList(0, 4);
		for(String s:slist) {
			System.out.println(s);
		}
		
		
		
		
		
		
	
		
		
		
	}
}
