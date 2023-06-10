package com.thread;

public class ThreadWLambda {

	public static void main(String[] args) {
		
		
		Runnable r = ()->{
			
			//run method
			System.out.println("thread is running....");
		};
		r.run();
		Runnable r1 =()->{
			
			System.out.println("thread is running....");
		};
		r1.run();
	}
}
