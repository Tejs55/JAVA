package com.basic.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class SimplePredicate {

	public static void main(String[] args) {
		
		Predicate<String>graterThan = i -> (i .equals("hello"));
		System.out.println(graterThan.test("Hello"));
	}
	
}
