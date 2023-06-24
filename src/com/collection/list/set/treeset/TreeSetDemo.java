package com.collection.list.set.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(5);
		ts.add(7);
		ts.add(94);
		ts.add(45);
		ts.add(32);

		NavigableSet<Integer> ns = ts.descendingSet();
		// it is not range fro 7 to 100 7 and 100 is an element...
		// SortedSet<Integer> ss = ts.subSet(7, 100);
		// SortedSet<Integer> ss = ts.subSet(7, true, 100, true);

		System.out.println("floor.."+ts.floor(5));	
		System.out.println("celling.."+ts.ceiling(6));
		
		System.out.println("first..."+ts.first());
		//ts.last();
		//System.out.println("pool first..."+ts.pollFirst());
		//ts.pollLast();
//		ts.rem
		
		SortedSet<Integer> ss = ts.headSet(45,true);
		ss = ts.tailSet(7);
		
		System.out.println("lower..."+ts.lower(1));
		System.out.println("higher"+ts.higher(98));
		for (int i : ss) {
			System.out.println(i);
		}

//		for(int i:ns) {
//			System.out.println(i);
//		}

	}
}
