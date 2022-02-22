package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class CrudOperation {

	private static SessionFactory sessionFactory = null;
	Transaction transcation = null;
	Integer empployeeid = null;

	// business logic part for insert
	public Integer addEmployee(String firstname, String lastname, String salary) {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation

		transcation = session.beginTransaction();
		Employee employee = new Employee(firstname, lastname, salary);
		empployeeid = (Integer) session.save(employee);// this save() will form "insert into table " query
														// automaticall// in db"
		transcation.commit();
		return empployeeid;

	}

}

public class MainClass {

	public static void main(String[] args) {

		CrudOperation crudOperation = new CrudOperation();

		Integer result = crudOperation.addEmployee("ram", "kumar", "45000");

		System.out.println(" result is" + result);
		System.out.println("Done....");

	}

}
