package com.demo.exceptionhandling;
///ArithmeticException
public class ExceptionDemoWithoutTryAndCatch {
	
	public static void main(String ar[]) {
		
		int number =10;
		
		int b=0;
		
		
		int temp =number/b;///this line got exception  by default JVM will catch the exception and terminate the prg
		System.out.println(temp);
		System.out.println("ended");   //why this line is not printed
		
		
	}

}
