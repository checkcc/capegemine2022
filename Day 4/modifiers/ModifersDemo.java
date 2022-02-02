package com.demo.modifiers;


class ABC{
	
	
}

public class ModifersDemo {

	// default case
	void show() {

		System.out.println("hi this default case");

	}
	
	// public modifer case
	public void show1() {

		System.out.println("hi this public modifier case");

	}
	
	// private modifer case
	private void show2() {

		System.out.println("hi this private modifier case");

	}



	public static void main(String[] args) {

		ModifersDemo d = new ModifersDemo();

		d.show();
		d.show2();

	}

}
