package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Employee;

@RestController
public class EmnloyeeContoller {

	// GET reqeust
	@GetMapping(value = "/messge") // this is called endpoint or uri
	String show() {
		String message = " hi how are you";

		return message;

	}
            ///single person detsils
	
	@GetMapping(value = "/getempldetsils")
	Employee getEmployeeDetailById(Employee emp) {
        System.out.println("*************INSIDE  getEmployeeDetailById*********** ");
		emp.setAddress("hyderbad");
		emp.setEmail("A@gmail.com");
		emp.setEmpname("Ram");
		emp.setId(1);
		return emp;

	}

}
