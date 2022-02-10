package com.demo.java8.methodreference;

@FunctionalInterface
interface Messagable1 {

	void getMessage(String msg);

}

class Message1 {
	// creating constructor here
	Message1(String msg) {

		System.out.println(" from constructor");
		System.out.println(" =====================" + msg);// using method here
	}

}

public class MethodReferencUsingConstructor {

	public static void main(String[] args) {

		// interface
		Messagable reference = Message1::new; // using constructor here

		// calling here

		reference.getMessage("Hi");

	}

}
