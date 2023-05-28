package com.thread;

public class ThreadDemo5 implements Runnable {

	public static void main(String[] args) {
		ThreadDemo5 t1 = new ThreadDemo5();
		ThreadDemo5 t2 = new ThreadDemo5();
		
		t1.run();
		t2.run();
		
				
		
	}

	@Override
	public void run() {
	
		System.out.println(Thread.currentThread().getName());
		
	}
}
