package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.pojo.Message;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext   context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Message m =context.getBean(Message.class);
		
		m.setMesssage(" hi how ar u");
		System.out.println(m.getMesssage());

}
}