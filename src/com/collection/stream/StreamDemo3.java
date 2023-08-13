package com.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("amit");
		list.add("raj");
		list.add("parth");
		list.add("priya");
		list.add("neha");
		list.add("jay");
		list.add("rahul");
		
//		for(String s: list) {
//			System.out.println(s.toUpperCase());
//		}
		
		//list.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		//list.stream().filter(x->x.startsWith("r")).forEach(x->System.out.println(x));
		list.stream().filter(x->x.startsWith("r")).map(x->x.toUpperCase()).
		forEach(x->System.out.println(x));
		
		
	}
}
