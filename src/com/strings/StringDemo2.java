package com.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1 = "java";
		int in = s1.indexOf("j");
		System.out.println(in);
		in = s1.lastIndexOf("j");
		System.out.println(in);
		
		String s = String.valueOf(65);//65
		System.out.println(s+20);//"65"
		int x = s1.compareTo("java");
		System.out.println(x);
		System.out.println(s1.equals("java"));
		
		String address ="X,404,Ixora ELegance,South Mumbai,120034";
		String add [] = address.split(" ");
		
		String ss = s1.substring(1,3);
		System.out.println("sub string->"+ss);
		
		s1 = s1.replace("", "#");
		byte b[]=s1.getBytes();
		for(byte b1:b) {
			System.out.println(b1);
		}
		
		System.out.println(s1);
		
		
		for(String s2:add) {
			System.out.println(s2);
		}
		
				
	}
}
