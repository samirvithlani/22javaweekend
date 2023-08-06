package com.collection.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueueDemo2 {

	public static void main(String[] args) {

		// Queue<Integer> q = new LinkedList<Integer>();
		Deque<Integer> dq = new LinkedList<Integer>();
		Queue<Integer> q = new ConcurrentLinkedDeque<Integer>();

	}
}
