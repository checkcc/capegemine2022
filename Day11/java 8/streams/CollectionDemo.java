package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

class Product1 {

	private int id;
	String name;
	int price;

	public Product1(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectionDemo {

	public static void main(String ar[]) {

		ArrayList<Product1> arraylist = new ArrayList<Product1>();

		arraylist.add(new Product1(1, "samsung", 2000));
		arraylist.add(new Product1(2, "mi", 3000));
		arraylist.add(new Product1(2, "mi", 3000));
		arraylist.add(new Product1(2, "mi", 3000));
		arraylist.add(new Product1(3, "google", 7000));
		arraylist.add(new Product1(4, "iphone", 8000));

		// list ur assigment
		Set<Integer> result = arraylist.stream().map(prod -> prod.price).collect(Collectors.toSet());

		System.out.println("prod" + result);

		//

	}

}
