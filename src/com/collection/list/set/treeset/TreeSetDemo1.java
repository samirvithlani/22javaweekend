package com.collection.list.set.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		// set interface... TreeSet HashSet
		// dynamic array index...
		//red black tree ds..
		// sendwich shop xyz --> pqr
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("python");
		set.add("cpp");
		set.add("x");
		set.add("node");
		set.add("no");
		set.add("php");
		
		
		System.out.println("is empty...."+set.isEmpty());
		
		System.out.println("contains...."+set.contains("cpp"));
		
		set.remove("node");
		
		System.out.println(set.size());
		
		
		
		
		
		
		for(String s:set) {
			System.out.println(s);
		}
	}

}
