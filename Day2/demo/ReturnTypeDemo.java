package com.demo;

class Multiply {
	// method declaration
	
	int Mul() {
		// this my local varible
		int num1 = 10;
		int num2 = 20;
        int  result = num1*num2;
        return result;
	}
	

}

// client program
public class ReturnTypeDemo {
	public static void main(String ar[]) {
		
		Multiply m1  = new Multiply();// this is object
		
		int temp = m1.Mul();
		
		System.out.println(" from main outout is  "+temp);

	}

}
