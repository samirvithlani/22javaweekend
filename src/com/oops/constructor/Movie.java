package com.oops.constructor;

public class Movie {

	//it is speciaf function which has same name as class name,
	//use: use of constructor are to initilize insrance varibale and instance of class
	//type of default cons, param const
//	public Movie() {
//	
//		//zero param const.....
//		System.out.println("default const....");
//		
//	}
	int a;
	
	
	public Movie(int x) {
	
		a =x;
	} 
	public static void main(String[] args) {
		
		Movie m1 = new Movie(15);
		Movie m2 = new Movie(150);
		
		System.out.println(m1.a);
		
		System.out.println(m2.a);
		
		
	}
}
