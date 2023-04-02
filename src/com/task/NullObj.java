package com.task;

public class NullObj {

	public static void main(String[] args) {
		
		
		String s = new String("raj");
		s=null; //eligblae to garbage Collector
		s.charAt(0);
		System.out.println(s);
		
		
	}
}
