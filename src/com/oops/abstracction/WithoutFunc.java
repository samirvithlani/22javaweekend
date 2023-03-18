package com.oops.abstracction;

interface Message{
	
	//sms
	public void msg();
	
}

public class WithoutFunc implements Message {

	
	public void msg() {
		
		System.out.println("msg..");
		
	}
	public static void main(String[] args) {
		
		
		Message m = new WithoutFunc();
		m.msg();
		
	}

}
