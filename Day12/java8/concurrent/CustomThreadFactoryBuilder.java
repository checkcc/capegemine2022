package com.demo.java8.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class CustomThreadFactoryBuilder {

	private String nameprfix = null;
	private boolean daemon = false;
	private int priority = Thread.NORM_PRIORITY;

	// name of thread
	public CustomThreadFactoryBuilder setNameprfix(String nameprfix) {
		// need to write by developer
		if (nameprfix == null) {

			throw new NullPointerException();
		}

		this.nameprfix = nameprfix;
		return this;
	}

	public CustomThreadFactoryBuilder setDaemon(boolean daemon) {
		this.daemon = daemon;
		return this;
	}

	public CustomThreadFactoryBuilder setPriority(int priority) {

		// validate the priority set
		if (priority < Thread.MIN_PRIORITY) {
			throw new IllegalArgumentException(
					String.format("Thread priority (%s) must be >= %s", priority, Thread.MIN_PRIORITY));
		}

		if (priority > Thread.MAX_PRIORITY) {
			throw new IllegalArgumentException(
					String.format("Thread priority (%s) must be <= %s", priority, Thread.MAX_PRIORITY));
		}

		this.priority = priority;

		return this;
	}// 5
	
	
	
	public ThreadFactory build() {   //Interface ThreadFactory
		return build(this);
	}

	private static ThreadFactory build(CustomThreadFactoryBuilder builder) {
		
		
		final String  nameprfix= builder.nameprfix;
		final Boolean daemon =builder.daemon;
		final Integer priority = builder.priority;
		  // int or long  thread concurrent package
		final AtomicLong count = new AtomicLong(0);
	
		
		return new ThreadFactory() {
			@Override
			public Thread  newThread(Runnable runnable) {
				Thread thread = new Thread(runnable);
				
				
				if(nameprfix!=null) {
					
					thread.setName(nameprfix+ "-" + count.getAndIncrement());
					
				}
				
				if (daemon !=null) {
					
					thread.setDaemon(daemon);
				}
					
				
			
			
			if (priority !=null) {
				thread.setPriority(priority);
			}
			
		return thread;
						
			}
			
	};
		
		
	}

}
