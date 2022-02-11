package com.demo.java8.optionalClasses;

import java.util.Optional;
import java.util.OptionalInt;

/*Java introduced a new class Optional in jdk8.
It is a public final class and used to deal with 
NullPointerException in Java application. 
You must import java.util package to use this class. 
It provides methods which are used to check the presence of value for particular variable.*/

class OptionalClass {

	public Integer Sum(Optional<Integer> a, Optional<Integer> b) {
		
		System.out.println(a.isPresent());
		System.out.println(b.isPresent());
		
		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer a1 = a.orElse(0);
		
		// Optional.get - gets the value, value should be present
		Integer b1 = b.get();
		

		return a1+b1;

	

	}

}

public class OptionalDemo {

	public static void main(String ar[]) {

		OptionalClass d = new OptionalClass();
		
		Integer value1 = null;  //passing null

		Integer value2 = new Integer(10); //passing some values here lik3 10  45 78
		
		
		Optional<Integer> a =Optional.ofNullable(value1);  //checking null is  passing is throwing exception or not
		
		Optional<Integer> b =Optional.of(value2);
		
		System.out.println(d.Sum(a, b));

	}

}