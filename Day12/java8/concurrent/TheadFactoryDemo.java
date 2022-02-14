package com.demo.java8.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class TheadFactoryDemo {
	public static void main(String[] args) {
		
	ThreadFactory customthreadfactory = new CustomThreadFactoryBuilder()
			.setNameprfix("demaonpool").setDaemon(false)
			.setPriority(Thread.MAX_PRIORITY)
			.build();
		
		
	ExecutorService executor = Executors.newFixedThreadPool(2,customthreadfactory);
	
	SimpleTask SimpleTask1 = new SimpleTask(5000);
	SimpleTask SimpleTask2 = new SimpleTask(5000);
	
	
	executor.execute(SimpleTask1);
	executor.execute(SimpleTask2);
	
	
	}

}
