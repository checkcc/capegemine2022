package com.demo.conditionalstatments;

public class IfStatmentDemo {

	public static void main(String[] args) {

		int amount = 500;
		int amount2 = 601;

		if (amount == 500) { // this conditioin will true

			if (amount2 == 600) { ///// than only it enter second conditons

				System.out.println("Yesm, this is amount2 600 rupess");

			} else {System.out.println("Yesm, this is NOT amount2 600 rupess");

			} // inner if or else block
		} else {

			System.out.println("Yesm, this is NOt amount 500 rupess");
		}

	}

}
