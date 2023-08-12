package com.predicate;

import java.util.function.Predicate;

public class PreicateDemo1 {

	public static void main(String[] args) {

//		Predicate<Integer> lessthn =(x)->
//		{
//			return false;
//			
//		};

		Predicate<Integer> lessth = x -> (x < 18);
		System.out.println(lessth.test(10));
		
		
		
		Predicate<String> isStartsWith = z->(z.startsWith("s"));
		System.out.println(isStartsWith.test("samir"));
	}
}
