package com.oops.abstracction;

//abstact class is not 100 % abstract....
//abstract 0 to 100
abstract class Meta {

	public abstract void mark();
	void mark2() {}

}

public class WhatsApp extends Meta {
	public void mark() {
		System.out.println("mark called by whatsapp");
	}

	public static void main(String[] args) {

		//WhatsApp w = new WhatsApp();
		//	w.mark();
		
		//Reference of parent class and child class memory or objecyt
		Meta m = new WhatsApp();
		m.mark();
		
	}

}
