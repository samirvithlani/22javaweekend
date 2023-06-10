package com.lambda;

@FunctionalInterface
interface Calls{
	
	public void calling();
	
	
}
public class LambdaDemo1 {

	//anno function
	//functional interface
	
	public static void main(String[] args) {
		
		Calls c = ()->{
			
			System.out.println("Calling method called...");
		};
		c.calling();
		
		
	}
}
