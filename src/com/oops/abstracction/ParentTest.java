package com.oops.abstracction;
interface Parent{
	
	void loan();
	
}
interface Child extends Parent{

	void dloan();
}


public class ParentTest implements Child{

	
	public static void main(String[] args) {
		
		
	}
	public void loan() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dloan() {
		// TODO Auto-generated method stub
		
	}
}
