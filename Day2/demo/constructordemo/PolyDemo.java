package com.demo.constructordemo;

// concepts of constructor overloading

class AeaOfRect {
	// constructor have not return type
	// constructors are always have it class name

	// this is my constructor
	AeaOfRect(int side) {

		int areaofside = side * side;

		System.out.println("  area of square" + areaofside);

	}
	
	//two parameters
	AeaOfRect(int length,int breadth) {

		int areaofrect = length * breadth;

		System.out.println("  calling from react" + areaofrect);

	}

}

public class PolyDemo {

	public static void main(String ar[]) {

		AeaOfRect areaOfsquare = new AeaOfRect(45);
		AeaOfRect areaOfRectangle = new AeaOfRect(45,45);

	}

}
