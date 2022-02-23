package ecommerce.com.bussinesslogic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Service {
	


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
