package com.thread;

public class ThreadDemo extends Thread{

	
	@Override
	public void run() {
	
//		System.out.println(Thread.currentThread().getName() + "..is going to sleep");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		for(int i=1;i<=10;i++) {
			try {
				//Thread.sleep(500);
				System.out.println(i+"..Thread is running...."+Thread.currentThread().getName());
			//	Thread.sleep(500);
				//intreputedException
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
	
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		
		//set thread names...
		System.out.println("inside main thread....");
		t1.setName("A");
		t2.setName("B");
		
//		try {
//			System.out.println(Thread.currentThread().getName()+"..is going to sleep");
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t1.start();
		try {
			System.out.println(Thread.currentThread().getName()+"..is going to sleep");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		
	}
}
