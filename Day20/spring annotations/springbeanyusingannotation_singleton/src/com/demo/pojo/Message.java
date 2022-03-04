package com.demo.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Component: Indicates that an annotated class is a “component”. 
//Such classes are considered as candidates for auto-detection
//when using annotation-based configuration and classpath scanning.
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Message {
	String messsage;

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

}
