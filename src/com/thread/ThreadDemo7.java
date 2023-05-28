package com.thread;

class Call {

	public synchronized void callIsRunning(int flag) {

		System.out.println("call is running....");
		if (flag == 1) {

			System.out.println("new call is on wait...");
			System.out.println("running call is putting on hold...");
			try {
				wait();
				System.out.println("holded call recived...");
				System.out.println("call ended....");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void newCall() {

		System.out.println("new call recived...");
		System.out.println("new call is running...");
		System.out.println("new call is about to end..");
		System.out.println("new call ended");
		System.out.println("holdel call notified....");
		notify();

	}

}

class ruunigCall extends Thread {

	Call c;

	public ruunigCall(Call c) {
		this.c = c;
	}

	@Override
	public void run() {

		c.callIsRunning(1);
	}

}

class newCall extends Thread {

	Call c;

	public newCall(Call c) {

		this.c = c;
	}

	@Override
	public void run() {
		c.newCall();
	}

}

public class ThreadDemo7 {

	public static void main(String[] args) {

		Call c = new Call();
		ruunigCall r = new ruunigCall(c);
		newCall n = new newCall(c);

		r.start();
		n.start();

	}
}
