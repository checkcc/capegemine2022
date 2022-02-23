package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class CrudOperation {

	private static SessionFactory sessionFactory = null;
	Transaction transcation = null;
	Integer empployeeid = null;
	Session sessiong = null;

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

	// read the list of employees from table // business logic part for insert
	public void readEmployee() {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transcation
		transcation = session.beginTransaction();
		Query query = session.createQuery("FROM Employee");
		List<Employee> employeelist = query.list();
		for (Employee newlist : employeelist) {
			System.out.println("first name is" + newlist.getFirstname());
			System.out.println("last name is" + newlist.getLastname());
			System.out.println("sal" + newlist.getLastname());

		}
	}

	// for update

	public Employee updateEmployeById(Employee empobject, int id) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transcation
		transcation=session.beginTransaction();
		
		Employee employe = (Employee)session.get(Employee.class, id);
	
		employe.setFirstname(empobject.getFirstname());  // values are coming from client that isMainClas
		employe.setLastname(empobject.getLastname());
		employe.setSalary(empobject.getSalary());
		session.update(employe);
		transcation.commit();
		return employe;

	}
	
	/// this method is used for only retrive the id from db
	public Employee findById(int empid) {
	
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		// begin transcation
		transcation=sessiong.beginTransaction();
		Employee findbyid = (Employee)sessiong.load(Employee.class, empid);
		return findbyid;  //return the id  from the db
	}
	
	//we need common sesion

   void deleteEmployeRecordById(int empid) {
	
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		transcation=sessiong.beginTransaction();
		Employee deleteobj = findById(empid); //fetching existing id from the database with the help of findByIdMethod()
		sessiong.delete(deleteobj);
		transcation.commit();
	   
   }
   
   //
   void deleteAllEmployeRecord() {
	
	   
   }

}

public class MainClass {

	public static void main(String[] args) {
		CrudOperation crudOperation = new CrudOperation();
		// for inserting values in db
		// Integer result = crudOperation.addEmployee("ram", "kumar", "45000");
		// for reading values from

		crudOperation.readEmployee();
		/// creating  new record as object
		Employee updatedetails = new Employee();
		updatedetails.setFirstname("tom");
		updatedetails.setLastname("hanks");
		updatedetails.setSalary("8000");
		  // udpate the emply id 3
		Employee employee = crudOperation.updateEmployeById(updatedetails,3);	
		String firstname = employee.getFirstname();
		System.out.println("updated value is "+firstname);
		// System.out.println(" result is" + result);
	
		Employee gotid =crudOperation.findById(4);
		gotid.getId();
		System.out.println("is.."+gotid.getId());
		crudOperation.deleteEmployeRecordById(4);  //deleting record number 4
		System.out.println("Done....");

	}

}
