package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		// unorderd
		Queue<String> q = new PriorityQueue<String>();
		q.add("raj");
		q.add("jay");
		q.add("jay");
		q.add("parth");
		q.add("neha");
		q.add("amit");
		q.add("amit");

		for (String s : q) {
			System.out.println(s);
		}

		String x = q.remove();
		System.out.println("removing...." + x);
		// q.remove("raj");
		for (String s : q) {
			System.out.println(s);
		}
	}
}
