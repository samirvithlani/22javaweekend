package com.oops.constructor;

class Ball {

	int x;

	public Ball() {

		System.out.println("****");
		x = 150;
	}

	public Ball(int y) {

		System.out.println(".....");
		x = y;
	}

	public void display() {

		System.out.println(x);
	}
}

public class ConstTest extends Ball {

	
	public ConstTest() {
		super(160);
	}
	
	public ConstTest(int x) {
		
		System.out.println("child param  1");
	}
	public ConstTest(int x,int y) {
		
		super();
	}
	public static void main(String[] args) {
				
		ConstTest c = new ConstTest(15); //child class default....
		c.display();

		
	}
}
