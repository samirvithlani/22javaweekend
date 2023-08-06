package com.collection.genrics;

import java.util.List;

public class GnericsDemo1 <T>  {

	public void adding(int x) {
		
		System.out.println(x);
	}
	public void adding1(T a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		
		GnericsDemo1 g1 = new GnericsDemo1();
		g1.adding(12);
		
		GnericsDemo1<Integer> g2 = new GnericsDemo1<Integer>();
		g2.adding1(12);
		GnericsDemo1<String> g3 = new GnericsDemo1<String>();
		g3.adding1("ram");
		
		
	}
}
