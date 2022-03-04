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
	
	//using properties based
	@Autowired
	Address address; // has-relation ship

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
 //logic part
		address.setAddress1("block 102");  //set the values
		address.setCity("delhi");                 //set the values

		System.out.println(address.getAddress1());   //get it
		System.out.println(address.getCity());   //get it

	}

}
