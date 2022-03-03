package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Message;

public class MainClass {

	public static void main(String[] args) {
		//it is a IOC-inverse of control
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");//created spring container to instantiate object
		
		Message message = (Message) applicationContext.getBean("constrId2");
	    
		message.show();//called without created object   //this is my userdefined method
	}

}
