package com.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c#");
		list.add("node");
		list.add("cpp");
		list.add("c");
		list.add("python");
		
		list.stream().forEach(x->System.out.println(x));
		
	}
}
