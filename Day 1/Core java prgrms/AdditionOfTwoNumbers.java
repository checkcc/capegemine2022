package com.demo;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
	public static void main(String args[]) {
		
		// Creates a reader instance which takes
        // input from standard input - keyboard
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		 // nextInt() reads the next integer from the keyboard
		int number1=reader.nextInt();
		
		System.out.println("Enter second number ");
		int number2=reader.nextInt();
		
		int result = number1+number2;
		
		System.out.println("Result of two number is  "+result);
	}

}
