package com.methods;

//com.methods.MethodDemo2
//java.util.Scanner
//java
// util
// Scanner
public class MethodDemo2 {

	//instance varible..
	//local variable.. local varible must be inilize...
	// with return with argume and satic
	//instace but non static
	int p;
	static int x=15;
	
	
	
	public static int mul(int a, int b) {

		//static int p; local variable can not declare as static...
		//System.out.println(p); // error reason --> non static instace variable can not use in sattcic method...
		System.out.println("x ="+x);
		return a * b;
	}

	public static void main(String[] args) {

		int ans = MethodDemo2.mul(150, 2);
		System.out.println(ans);
		System.out.println(MethodDemo2.mul(45, 3));
		MethodDemo2 m2 = new MethodDemo2();
		System.out.println(m2.mul(10, 10));
		

	}

}
