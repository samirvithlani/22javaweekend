package com.lambda;

interface Greets{
	
	public String greeting(String g);
}
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		
		Greets g = (name)->{
			
			return name.toUpperCase().concat("good morning..");
		};
		String s = g.greeting("ram");
		System.out.println(s);
		
	}
}
