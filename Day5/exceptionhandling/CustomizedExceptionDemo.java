package com.demo.exceptionhandling;

// Exception this my super class
class MyException extends Exception {

	MyException(String messge) {

		super(messge);// calling the super class constructor of EXception

	}

}

public class CustomizedExceptionDemo {

	public static void main(String ar[]) {
		try {
			
			throw new MyException(" this is my own exceptions");
			
			
		} catch (MyException e) {  // this is my own exceptions
			System.out.println("caught"+e);
		}

	}

}
