package com.thread;

class Printer implements Runnable {

	@Override
	public void run() {

		synchronized (this) {

			for (int i = 1; i <= 5; i++) {

				System.out.println("printing papers...." + Thread.currentThread().getName());
			}
		}

	}

}

public class ThreadDemo6 {

	public static void main(String[] args) {

		Printer p = new Printer();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);

		t1.setName("JAVA");
		t2.setName("PYTHON");
		t1.start();
		t2.start();

	}
}
