package com.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("amit");
		list.add("raj");
		list.add("parth");
		list.add("priya");
		list.add("neha");
		list.add("jay");
		list.add("rahul");
		
		//List<String> fillist = new ArrayList<String>();
		List<String> fillist = list.stream().filter(x->x.startsWith("r")).
				collect(Collectors.toList());
		
		fillist.stream().forEach(x->System.out.println(x));
		
		
		
//		for(String s: list) {
//			
//			if(s.startsWith("r")) {
//				fillist.add(s);
//			}
//		}
//		
//		for(String s: fillist) {
//			System.out.println(s);
//		}

	}
}
