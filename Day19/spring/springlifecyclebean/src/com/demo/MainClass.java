package com.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//it is a IOC-inverse of control
		
		ConfigurableApplicationContext cap   = new ClassPathXmlApplicationContext("beans.xml");

    // It will close the spring container
    // and as a result invokes the
    // destroy() method
    cap.close();
}
}