package com.oops.inheritance;

class Bank{

	//parent class
	int x =100;
	
	public void withdraw() {
		
		System.out.println("bank class...");
	}
	
}



public class BankTest extends Bank{

	//child class
	public void test() {
		
		System.out.println(x);
		withdraw();
		
	}
	public static void demo() {
		
		Bank b = new Bank();
		b.withdraw();
	}
	public static void main(String[] args) {

		//System.out.println(x);
		BankTest b = new BankTest();
		b.test();
		b.withdraw();
		demo();
		
		
		//b.x;
				
	}
}
