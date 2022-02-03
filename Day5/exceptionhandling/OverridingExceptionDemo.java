package com.demo.exceptionhandling;

import java.io.*;
//rule 1
class Parent {

	// defining the method
	void msg() {
		System.out.println("parent method");
	}
}

 class TestExceptionChild extends Parent {

	// overriding the method in child class	// gives compile time error
	/*
	 * void msg() throws IOException { System.out.println("TestExceptionChild");
	 * //overriden method does not throw exceptuion }
	 */
	 
	 void msg() throws ArithmeticException {
		System.out.println("TestExceptionChild");   //overriden method does  not throw exception of checked but we can use un checked exception
	}
	 
	 
	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}