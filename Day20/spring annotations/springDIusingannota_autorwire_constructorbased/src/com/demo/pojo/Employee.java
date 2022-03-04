package com.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Employee
//Address


@Component
public class Employee {

	int id;
	private String name;
	private String email;
	
	Address address;
	
	//parameterized constructor autowired
	@Autowired
	public Employee(Address add){
		System.out.println("inside the constructor");
		add.setAddress1("india");
		add.setCity("mumbai");
		
		System.out.println(add.getAddress1());
		
		System.out.println(add.getCity());
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}
   //DI

	public void setAddress(Address address) { // setter method address class
		this.address = address;
	}

	public void EmployeeAddress() {
		
		

	}

}
