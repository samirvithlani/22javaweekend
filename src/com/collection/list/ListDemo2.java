package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(150);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(200);
		l2.add(250);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.addAll(l1);
		l3.addAll(l2);
		
		for(int i:l3) {
			System.out.println(i);
		}
			
		
		
		
	}
}
