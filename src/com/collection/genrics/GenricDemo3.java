package com.collection.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo3 <T>{

	
	public void demo(List<?> list) {
		
		for(Object x: list) {
			System.out.println(x);
		}
		
	}
	public static void main(String[] args) {
		
		GenricDemo3<Integer> g3 = new GenricDemo3<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(200);
		
		
		g3.demo(l1);
		
		GenricDemo3<String> g4 = new GenricDemo3<String>();
		List<String> l2 = new ArrayList<String>();
		l2.add("java");
		l2.add("c");
		
		g4.demo(l2);
		
	}
	
}
