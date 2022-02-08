package com.demo.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		
		Set<String> setdemo1 = new LinkedHashSet<String>();
		Set<String> setdemo = new HashSet<String>();
		
		setdemo.add("apple");
		setdemo.add("mango");
		setdemo.add("banana");
		setdemo.add("nuts");
		setdemo.add("apple");
		setdemo.add("apple");
		setdemo.add("apple");
		setdemo.add("apple");

		
		Iterator iterator = setdemo.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());

			}

		}
	}

}
