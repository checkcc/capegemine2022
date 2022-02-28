package com.demo.main;

import com.demo.bussinesslgoic.CurdDemo;
import com.demo.pojo.Employee;

public class MainClass {

		public static void main(String[] args) {
			CurdDemo crudOperation = new CurdDemo();
			// for inserting values in db
			 Integer result = crudOperation.addEmployee("ram", "kumar", "45000");
			// for reading values from

		//	crudOperation.readEmployee();
			/// creating  new record as object
			Employee updatedetails = new Employee();
			updatedetails.setFirstname("tom");
			updatedetails.setLastname("hanks");
			updatedetails.setSalary("8000");
			  // udpate the emply id 3
		//	Employee employee = crudOperation.updateEmployeById(updatedetails,3);	
		//	String firstname = employee.getFirstname();
		//	System.out.println("updated value is "+firstname);
			// System.out.println(" result is" + result);
		
		//	Employee gotid =crudOperation.findById(4);
		//	gotid.getId();
		//	System.out.println("is.."+gotid.getId());
		//	crudOperation.deleteEmployeRecordById(4);  //deleting record number 4
			System.out.println("Done....");
			
			
			//list of employee
			
		//	List<Employee> employeelist = crudOperation.getEmplist();
					
			//		for (Employee newlist : employeelist) {
					//	System.out.println("first name is" + newlist.getFirstname());
					//	System.out.println("last name is" + newlist.getLastname());
					//	System.out.println("sal" + newlist.getSalary());

					//}
					
			
				

		}

	}



