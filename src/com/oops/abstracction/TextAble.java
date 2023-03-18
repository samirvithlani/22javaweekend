package com.oops.abstracction;

interface Texts{
	
	String greet(String g);
}

public class TextAble {

	public static void main(String[] args) {
		
		
		Texts t = (g)->{
			
			return g.toUpperCase();
		};
		String x = t.greet("sam");
		System.out.println(x);
	}
}
