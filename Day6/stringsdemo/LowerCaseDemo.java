package com.demo.stringsdemo;

public class LowerCaseDemo {
	public static void main(String ar[]) {

		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@", 2);

		for (String a : arrOfStr)
			System.out.println(a);
	}

}
