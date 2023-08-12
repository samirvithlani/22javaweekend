package com.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		
		Predicate<Integer> isGrtthn = i ->(i>20);
		Predicate<Integer> isEven = i ->(i%2==0);
		
		boolean res = isGrtthn.and(isEven).test(26);
		boolean res1 = isGrtthn.or(isEven).test(7);
		System.out.println(res1);
	}
}
