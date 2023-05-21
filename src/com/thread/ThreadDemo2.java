package com.thread;

public class ThreadDemo2 extends Thread{

	@Override
	public void run() {
	
		for(int i=1;i<=5;i++) {
			System.out.println("running thread" +Thread.currentThread().getName() + "-"+i);
		}
	}
	public static void main(String[] args) {
		
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo2 t3 = new ThreadDemo2();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
		
		
	}
}
