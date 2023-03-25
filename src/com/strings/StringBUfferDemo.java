package com.strings;

public class StringBUfferDemo {

	public static void main(String[] args) {
		
		//stirng immmutable --> String BUffer,Stgring builder
		
		//StringBuilder ssss=  new StringBuilder();
		StringBuffer sb = new StringBuffer("java");
		//sb.append("python");
		//sb.delete(1, 3);
		//sb.deleteCharAt(1);
		//sb.reverse();
		sb.insert(1, "x");
		String s = "amit";
		StringBuffer sb1 = new StringBuffer(s);
		sb1.reverse();
		s = sb1.toString();
		System.out.println(s);
		//System.out.println(sb);
		
	}
}
