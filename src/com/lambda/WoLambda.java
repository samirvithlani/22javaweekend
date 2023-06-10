package com.lambda;

@FunctionalInterface
interface Prints{
	
	public void printing();
}

public class WoLambda implements Prints {

	public static void main(String[] args) {
		
		Prints p = new WoLambda();
		p.printing();
		
	}

	@Override
	public void printing() {
		
		System.out.println("printing called...");
		
	}
}
