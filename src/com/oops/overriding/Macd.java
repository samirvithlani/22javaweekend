package com.oops.overriding;

class MacdGloable {

	//access modifiers returntype name of function params
	public void burger() {

		System.out.println("burger called from macd g");
	}

}

public class Macd extends MacdGloable {

	public void burger() {

		System.out.println("burger called from macd ");
	}
	
	public static void main(String[] args) {
		
		Macd m1 = new Macd();
		m1.burger();
	}
}
