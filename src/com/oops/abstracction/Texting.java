package com.oops.abstracction;
interface Text{
	
	//public final static int x;
	int x=10;
	//public abstract void texts();
	
	void texts();
}
abstract class Call{
	
	public abstract void calling();
}

interface Msg{
	public abstract void msg();
}
public class Texting implements Text,Msg{
	
//public class Texting extends Call,Msg implements Text {

	//default
	public void texts() {
		System.out.println(x);
		System.out.println("..");
	}
	
	
	public static void main(String[] args) {
		
		Text t = new Texting();
		t.texts();
		Msg m = new Texting();
		m.msg();
		
	}


	

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}
}
