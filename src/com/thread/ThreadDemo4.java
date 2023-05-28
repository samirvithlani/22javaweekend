package com.thread;

class Sending {

	public void sendMessage(String msg) {

		System.out.println("upper");
		synchronized (this) {

			System.out.println("sending messasge.." + msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("message " + msg + "..sent..");
		}
		System.out.println("lower");
	}

}

class Send1 extends Thread {

	Sending s;
	String msg;

	public Send1(Sending s, String msg) {

		this.s = s;
		this.msg = msg;
	}

	@Override
	public void run() {

		s.sendMessage(msg);
	}

}

class Send2 extends Thread {
	Sending s;
	String msg;

	public Send2(Sending s, String msg) {

		this.s = s;
		this.msg = msg;
	}

	@Override
	public void run() {

		s.sendMessage(msg);
	}

}

public class ThreadDemo4 {

	public static void main(String[] args) {

		Sending s = new Sending();
		Send1 t1 = new Send1(s, "hello");
		Send2 t2 = new Send2(s, "hi");

		t1.start();
		t2.start();

	}
}
