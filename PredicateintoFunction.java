package com.basic.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateintoFunction {

	static void pred(int number, Predicate<Integer>predicate) {
		if(predicate.test(number)) {
			System.out.println("Number"+number);
		}
	}
	
	public static void main(String[] args) {
		pred(80, (i) -> i > 79);
	}
	
}
