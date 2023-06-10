package com.thread;

public class ThradLambdDemo2 {

	
	public static void main(String[] args) {
		
		
		Runnable thread = ()->{
			//run
			System.out.println(Thread.currentThread().getName() + " is running...");
			
		};
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);
		
		t1.setName("A");
		t2.setName("B");
		
		t1.start();
		t2.start();
		
	}
}
