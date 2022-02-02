package com.demo.inher;

/* 
 * Abstract class in Java
A class which is declared as abstract is known as an abstract class.
 It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 *  * 
 * 
 * 
 * 
 * 
 * */



abstract class ABC {

	// contructor

	ABC() {

	}

	// non abstract method

	void show() {
		
		System.out.println(" this show   abc class");

	}

	// non abstract method

	abstract void show1();
	
	
	//static methods
	static void show3() {

	}

}

// this is my concreate class
class xyz extends ABC{
  //overrid is happening here

	void show1() {
		System.out.println(" this show1  is the version of  xyz class not abc class");
	}
	
	
	
}


public class AbstractClassDemo {

	public static void main(String[] args) {

		ABC a = new xyz();
		a.show1();
	}

}
