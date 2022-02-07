package com.demo.threads;

class FirstThread extends Thread {

	Thread t; // refer thread as t as reference
	String ThreadName;

	FirstThread(String name) {

		ThreadName = name;

		System.out.println("creating  thread name" + name);

	}

	// write a logic here

	public void run() {   // this method  run()  is given by java api

		try {

			for (int i = 8; i > 0; i--) {

				System.out.println("Thread " + ThreadName + "," + i);
				Thread.sleep(7000);// 7 seconds

			}

		} catch (InterruptedException e) {

			System.out.println("Thread " + ThreadName + " has been interrupted");
		}

	} 
	
	
	public void start() {   // this method is given by thread class which invoke the run()  method
		System.out.println("thread is starting...."+ThreadName);
		
		if (t==null) {
			
			t = new Thread(this,ThreadName);  //very first time if thread t i null, then we will create new thread
			t.start(); // and called the start method 
		}
		
	}

}

public class TheadDemo {

	public static void main(String[] args) {
		
		FirstThread t1 =  new FirstThread("thread 1");   //first thread created
		t1.start();

		
		
		FirstThread t2 =  new FirstThread("thread 2");   //second thread created
		t2.start();


	}

}
