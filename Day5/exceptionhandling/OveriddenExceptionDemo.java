package com.demo.exceptionhandling;


import java.io.*;
//rule 2
class Parent1 {

	// defining the method
	void msg()  throws ArithmeticException   {
		System.out.println("parent method");
	}
}

 class TestExceptionChild1 extends Parent1 {

	// overriding the method in child class	// gives compile time error
	/*
	 * void msg() throws IOException { System.out.println("TestExceptionChild");
	 * //overriden method does not throw exceptuion }
	 */
	 
	/*
	 * void msg() throws Exception { System.out.println("TestExceptionChild");
	 * //overriden method does not throw exception of checked but we can use un
	 * checked exception }
	 */
	 
	public static void main(String args[]) {
		Parent1 p = new TestExceptionChild1();
	
		try {
		p.msg();
		}catch(Exception e) {}
	}
}