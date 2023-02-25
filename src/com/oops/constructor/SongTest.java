package com.oops.constructor;

class Song{
	
	int price1;
	int ratings1=0;
	public Song() {}
	public Song(int price) {
		
		price1 = price;
		System.out.println("..."+price);
	}
	
	public Song(int price,int ratings) {
		
		price1 = price;
		ratings1 = ratings;
		System.out.println("*/*/*"+price + ratings);
	}
	
}
public class SongTest extends Song{

	
	public SongTest() {
		
		System.out.println("..");
	}
	public SongTest(int price) {
		super(150);
	}
	
	
	public static void main(String[] args) {
		
		
		
		SongTest s1 = new SongTest(15);
	}
	
}
