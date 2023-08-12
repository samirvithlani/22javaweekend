package com.predicate;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static boolean pred(int no, Predicate<Integer> predicate) {

		System.out.println(predicate.test(no));
		if (predicate.test(no)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		pred(10, (i) -> i >= 10);
		pred(100, (i) -> (i % 2 == 0));
		
		System.out.println(pred(99,(x)->x%3 ==0));

	}
}
