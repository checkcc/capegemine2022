package com.demo.java8.lamdhademo;

/*
 * Following are the important characteristics of a lambda expression.

Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.

Optional parenthesis around parameter − No need to declare a single parameter in parenthesis.
 For multiple parameters, parentheses are required.

Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value.
 Curly braces are required to indicate that expression returns a value.
 * 
 * *
 */

@FunctionalInterface
interface Addable {
    //SAM
	int add(int a, int ab);

}

public class LambdaExpressionWithAndWithoutReturnTypeDemo {

	public static void main(String ar[]) {
		
		                   //calling lambda expression here only applicable when we use only functional interfaces
		Addable adddemo = (a,b)->(a+b);  //no return type
		
		System.out.println(adddemo.add(5, 5));
		
		
		
		Addable adddemo1 = (a,b) ->{   //with return keyword
			
		  return(a+b);
		
		};
		
		System.out.println(adddemo1.add(7, 8));

	}

}
