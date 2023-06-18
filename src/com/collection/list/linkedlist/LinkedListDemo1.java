package com.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("java");
		ls.add(0, "c");
		ls.addFirst("cpp");
		ls.addLast("python");
		ls.add("php");
		ls.addLast("python");
		ls.add("php");
		

		
//		String rem = ls.remove();
//		System.out.println("removing..."+rem);
		
//		String rem = ls.remove(0);
//		System.out.println("removing..."+rem);
		
//		System.out.println("is removed???"+ls.remove("c"));
		
//		ls.removeFirst();
//		ls.removeLast();
		
		
		//ls.clear();
		//System.out.println("removed???"+ls.removeFirstOccurrence("python"));
		//System.out.println("..."+ls.poll());
		//System.out.println(ls.pop());
//		System.out.println(".."+ls.element());
//		System.out.println("././"+ls.peek());
		
		//ls.contains("");
		int i = ls.indexOf("python");
		i = ls.lastIndexOf("python");
		System.out.println(i);
		for(String s:ls) {
			System.out.println(s);
		}
		
	}
}
