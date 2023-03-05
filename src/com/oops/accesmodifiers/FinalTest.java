package com.oops.accesmodifiers;
class Phone{
	
	public final void drama() {
		
		
	}
	
}

final class Result{}


public class FinalTest extends Phone{

	
//	public void drama() {
//		
//	}
	
	
	final int x =10;
	
	void test() {
		//x= 20;
		final int y = 10;
	}
	public final int test2() {
		System.out.println("xxxx");
		return 100;
	}
	public final int test2(int x) {
		System.out.println("xxxx");
		return 100;
	}

	public static void main(String[] args) {
		
		FinalTest finalTest = new FinalTest();
		int y = finalTest.test2();
		y = 250;
		System.out.println(y);
		
	}
}
