package com.demo.java8.methodreference;

import java.util.function.BiFunction;

/*
 * @FunctionalInterface
public interface BiFunction<T,U,R>
Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
This is a functional interface whose functional method is apply(Object, Object).
 * 
 * 
 * 
 * andThen(Function<? super R,? extends V> after)
   Returns a composed function that first applies this function to its input, 
   and then applies the after function to the result.R
   
   	apply(T t, U u)
 * 
 * 
 * */

class AddDemo {

	public static int add(int a, int b) {

		return a + b;
	}
}

public class MethodReferenceStaticDemo {

	public static void main(String ar[]) {

		BiFunction<Integer, Integer, Integer> adder = AddDemo::add;// using method reference

		int result = adder.apply(45, 45);

		System.out.println(result);

	}

}
