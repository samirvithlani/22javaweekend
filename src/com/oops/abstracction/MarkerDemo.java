package com.oops.abstracction;

@FunctionalInterface
interface Calling {
	// functional interface...
	void call(int x);

}

public class MarkerDemo {

	public static void main(String[] args) {

		Calling c = (a) -> {
			System.out.println("call..."+15);
		};
		c.call(15);

	}
}
