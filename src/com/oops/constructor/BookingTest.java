package com.oops.constructor;
class Book{
	
	public Book(int price) {
		//
		System.out.println("param"+price);
		
		
	}
	public Book() {
		System.out.println("default const of book....");
	}
	
}


public class BookingTest extends Book {

	
	public BookingTest(int x) {
		//System.out.println(); erorr...
		super(x);
		System.out.println("booking test....");
	}
	
	public static void main(String[] args) {
		
		
		BookingTest b1 = new BookingTest(12);
		
		
	}
}
