package com.collection.stream;

import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.generate(() -> "royal").limit(10);
		String[] test = stream.toArray(String[]::new);
		for(String s:test) {
			System.out.println(s);
		}

	}
}
