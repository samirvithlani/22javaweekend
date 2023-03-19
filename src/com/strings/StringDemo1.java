package com.strings;

public class StringDemo1 {

	
	
	//String
	//java.lang.String non-prem
	//index...
	//mutablity - we can modify 
	//immutablity - can not modify
	//immutable...
	//SCP -->
	public static void main(String[] args) {
		
		//heap
		String s ="  java  ";
		//String s1 ="samir";
		//String s2 = new String("raj");
		System.out.println(s); //java
		//s.concat("python");
		int len = s.length();
		System.out.println(len);
		s = s.trim();
		len = s.length();
		System.out.println(len);
		
		s = s.toUpperCase();
		System.out.println(s); //java python
		s= s.toLowerCase();
		System.out.println(s); //java python
		char c = s.charAt(1);
		System.out.println(c);
		boolean flag = s.contains("v");
		System.out.println(flag);
		System.out.println(s.startsWith("j"));
		System.out.println(s.endsWith("a"));
		

	}
}
