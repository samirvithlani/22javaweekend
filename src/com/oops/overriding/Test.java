package com.oops.overriding;

class A{
	
	
	public A testing() {
		
		return new A();
	}
}
//coverient 
class B extends A{
	
	public B testing() {
		
		return new B();
	}
	
}

public class Test {

}
