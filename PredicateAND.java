package com.basic.FunctionalInterface.Predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateAND {

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		public boolean test(String t){
			return t.length() > 10;
		}
	};
	
	public static void predicate_and() {
		Predicate<String>nonNullPredicate = Objects::nonNull;
		String nullString = null;
		
		boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
		System.out.println(outcome);
		
		String lengthGTThan10 = "Welcome to the machine";
		boolean outcome2 = nonNullPredicate.and(hasLengthOf10).test(lengthGTThan10);
		System.out.println(outcome2);
	}
	
	public static void main(String [] args) {
		predicate_and();
	}
	
}
