package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Message;

public class MainClass {
	
	//scope protoype

	public static void main(String[] args) {
		//it is a IOC-inverse of control
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");//created spring container to instantiate object
		
		Message message1 = (Message) applicationContext.getBean("mymessage");
		
	
		
	//	Mesage m = new Message() this object was created by spring container-ApplicationContext
		
	    System.out.println("this is my object message1"+message1);
		
	  //  Message m = new Message();
	    
	 //   System.out.println("using constructor"+m);
	    
		message1.show();//called without created object   
		
		
		//another reference
	Message message2 = (Message) applicationContext.getBean("mymessage");
		
		System.out.println(message2.getMessage());
		
		  System.out.println("this is my object for message2"+message2);
	}

}
