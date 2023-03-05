package com.oops.accesmodifiers;

public class ATest {

	private int x =10;
	int y =20;
	protected int p =20;
	void test() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		
		ATest a = new ATest();
		a.test();
		
		
	}
}
