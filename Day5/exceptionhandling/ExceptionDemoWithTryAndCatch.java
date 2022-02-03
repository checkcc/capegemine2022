package com.demo.exceptionhandling;

///ArithmeticException
public class ExceptionDemoWithTryAndCatch {
	
	public static void main(String ar[]) {
		
		int number =10;
		int b=0;
		
		try {
			int temp =number/b;
			System.out.println(temp);
		}
		catch(Exception e) {
			
			System.out.println(" caused due to divide by zero  "+e);
			
		}
		
		
		System.out.println("ended");  
		
		
	}

}
