package com.basic.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateChanging {

	public static void main(String[] args) {
		Predicate<Integer>graterThanTen = (i) -> i > 10;
		
		Predicate<Integer>lowerThanTwenty = (i) -> i < 20;
		
		boolean result = graterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
		
		boolean result2 = graterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);
		
	}
	
}
