package com.demo.bussinesslgoic;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
    import com.demo.pojo.Employee;

public 	class CurdDemo {

		private static SessionFactory sessionFactory = null;
		Transaction transcation = null;
		Integer empployeeid = null;
		Session sessiong = null;

		// business logic part for insert
		public Integer addEmployee(String firstname, String lastname, String salary) {
			// intilize the session
			Session session = null;
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
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
				System.out.println("sal" + newlist.getSalary());

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
		String deleteAllEmployeRecord() {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			sessiong = sessionFactory.openSession();
			transcation = sessiong.beginTransaction();
			Query query = sessiong.createQuery("DELETE FROM Employee");
			Integer result = query.executeUpdate();
			transcation.commit();

			if (result > 0) {
				return "Sucessfully deleted all records";
			} else {
				return "No record found";
			}
		}

		  //displsy multiple records
	   List<Employee> getEmplist(){
		   
			sessionFactory = new Configuration().configure().buildSessionFactory();
			sessiong = sessionFactory.openSession();
		   Query query = sessiong.createQuery("FROM Employee");
			List<Employee> employeelist = query.list();
		   return employeelist;
		  
	   }
	   
	   
	   public boolean deleteUserStoreDomain(List<Long> ids) {
		    if (ids != null && !ids.isEmpty()) {
		        Number result = sessiong.createQuery("delete from Employee where id in :ids").setParameter(ids.size(), ids, null)
		        .executeUpdate();
		             
		        return result.intValue() > 0;
		    }
		    else {
		        return false; 
		    }   
		}
	 
	}



