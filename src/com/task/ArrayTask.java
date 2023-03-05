package com.task;

public class ArrayTask {

	
	static int a[];
	
	public void add() {
		
		a = new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		
		
	}
	public void display() {
		
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
	
		ArrayTask a = new ArrayTask();
		a.add();
		a.display();
	
	}
}
