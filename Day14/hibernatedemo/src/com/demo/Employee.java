package com.demo;

/* *
 * There are following main rules of persistent classes, however, none of these rules are hard requirements −

All Java classes that will be persisted need a default constructor.

All classes should contain an ID in order to allow easy identification 
of your objects within Hibernate and the database. This property maps to the primary key column of a database table.

All attributes that will be persisted should be declared private and 
have getXXX and setXXX methods defined in the JavaBean style.

A central feature of Hibernate, proxies, depends upon the persistent
 class being either non-final, or the implementation of an interface that declares all public methods.

All classes that do not extend or implement some specialized 
classes and interfaces required by the EJB framework.

The POJO name is used to emphasize that a given object is an ordinary Java Object,
 not a special object, and in particular not an Enterprise JavaBean.
 * 
 * 
 * 
 * 
 */

public class Employee {
	
	private  int id;

	private String firstname;
	private String lastname;
	private String salary;
	
	public Employee(){
		
		
	}
	
	public Employee(String firstname, String lastname, String salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
