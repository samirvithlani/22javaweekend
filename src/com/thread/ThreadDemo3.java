package com.thread;

class VotinngBooth {

	public synchronized void doVote(String name) {

		for(int i=1;i<=3;i++) {
			System.out.println(name + "..is voaitng...");
		}
	}
}

class Thread1 extends Thread {

	VotinngBooth v1;

	public Thread1(VotinngBooth v1) {

		this.v1 = v1;
	}

	@Override
	public void run() {
		v1.doVote("amit");
	}
}

class Thread2 extends Thread {

	VotinngBooth v1;

	public Thread2(VotinngBooth v1) {

		this.v1 = v1;
	}

	@Override
	public void run() {

		v1.doVote("raj");

	}

}

public class ThreadDemo3 {

	public static void main(String[] args) {

		VotinngBooth v = new VotinngBooth();
		Thread1 t1 = new Thread1(v);
		Thread2 t2 = new Thread2(v);
		
		t1.start();
		t2.start();

	}
}
