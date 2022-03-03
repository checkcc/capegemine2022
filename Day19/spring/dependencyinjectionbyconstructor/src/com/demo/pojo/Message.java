package com.demo.pojo;

public class Message {
	// property
	private String message;
	int id;

	public Message() {
		System.out.println("default constructor");
	}

	public Message(String message) {

		this.message = message;
	}
	
	public Message(int id) {

		this.id = id;
	}


	public void show() {

		System.out.println(" calling without contructor object creation====" + message+id);

	}

}
