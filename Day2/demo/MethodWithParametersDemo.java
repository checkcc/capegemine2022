package com.demo;

class AdditionDemo {

	double AreaOfReatanle(double length, double breadth) {

		double result = length * breadth;// logic of area

		//return result;
		
		return  length * breadth;

	}

	String NameDemo(String name) {
		return name;

	}

}

public class MethodWithParametersDemo {

	public static void main(String ar[]) {

		/// create an object

		AdditionDemo a1 = new AdditionDemo();

		double temp = a1.AreaOfReatanle(5.6, 7.5);

		System.out.println(" area of reactable " + temp);
		System.out.println(" area of reactable second way " + a1.AreaOfReatanle(5.6, 7.5));
		
     	String temp2 = a1.NameDemo("Ram");
		
		System.out.println(" String demo " +temp2);

	}

}
