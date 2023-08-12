package com.predicate;

import java.util.function.Predicate;

public class PredicateDemo4 {

	public static boolean pred(String str,Predicate<String> predicate) {
		
		
		return predicate.test(str);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(pred("java", (x)->x.length()>3));
		System.out.println(pred("python",(x)->x.startsWith("j")));
		System.out.println(pred("", (x)->x.isEmpty()));
		
	}
}
