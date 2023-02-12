package com.methods;

public class MethodDemo {

	// pre define and user define...
	// 4 type
	// static non static
	// with return type with argument
	// with return type with argument
	// with return type with argument
	// with return type with argument
	
	//instance varibale but non static...
	//instance non static variable can not be used in static method
	int p=150;
	//instace static variable can be userd in sattic as well non static method both.....
	static int x =15;

	public void test() {
		
		System.out.println("non static without argument without return type..."+p);
		System.out.println(x);
	}
	public int sum(int a,int b) {
		
		System.out.println("with return with args but non static");
		//local variable....
		//up to method...
		int ans =  a+ b;
		//return ans;
		return a + b;
	}
	
	public String getData() {
		
		return "hello this is string function....";
		
	}
	//with args without return type...

	public static void main(String[] args) {

		// method.... what we have to create an object of that class...

		//System.out.println(p); error,,
		// reference....
		// all non static method must be call with object only...
		MethodDemo m = new MethodDemo();
		m.test();
		//scanner class => 
		//a,b
		int ans = m.sum(150,250);
		System.out.println("ans = "+ans);
		
		String data = m.getData();
		System.out.println(data);
		System.out.println(m.sum(15,85));
		
		

	}
}
