package com.oops.overriding;

public class CovDemo {

	
	public void demo() {
		System.out.println("nothing");
	}
	public int test() {
		
		return 100;
	}
	
	public CovDemo test1() {
		
		//CovDemo c1  = new CovDemo();
		return new CovDemo();
		//return c1;
	}
	
	
	public static void main(String[] args) {
		
		CovDemo c = new CovDemo();
		CovDemo c1 = c.test1();
		
		
	}
}
