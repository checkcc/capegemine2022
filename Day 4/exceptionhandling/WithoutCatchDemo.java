package com.demo.exceptionhandling;

///ArithmeticException
public class WithoutCatchDemo {

	public static void main(String ar[]) {

		int number = 10;
		int b = 0;

		try {
			int temp = number / b;
			System.out.println(temp);
		}

		finally {

			System.out.println("from finally");

		}

		System.out.println("ended");

	}

}
