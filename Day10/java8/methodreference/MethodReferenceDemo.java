package com.demo.java8.methodreference;

@FunctionalInterface
interface Messagable {

	void getMessage(String msg);

}

class Message {

	void Show(String msg) {

		System.out.println(" from method");
		System.out.println(" =====================" + msg);// using method here
	}

}

public class MethodReferenceDemo {

	public static void main(String[] args) {

		Message m = new Message();// creating obj

		// interface
		Messagable reference = m::Show; // reference of interface here

		// calling here

		reference.getMessage("Hi");

	}

}
