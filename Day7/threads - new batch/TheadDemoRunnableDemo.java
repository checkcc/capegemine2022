package com.demo.threads;

/***
 * 
 * CREATION OF THREADS USING RUNNABLE INTERFERACE
 * 
 * 
 */

//creating  thread by runnable interface
class SecondThread implements Runnable {

	Thread t; // refer thread as t as reference
	String ThreadName;

	SecondThread(String name) {

		ThreadName = name;

		System.out.println("creating  thread name" + name);

	}

	// write a logic here

	public void run() { // this method run() is given by java api

		try {

			for (int i = 8; i > 0; i--) {

				System.out.println("Thread " + ThreadName + "," + i);
				Thread.sleep(7000);// 7 seconds

			}

		} catch (InterruptedException e) {

			System.out.println("Thread " + ThreadName + " has been interrupted");
		}

	}

	public void start() { // this method is given by thread class which invoke the run() method
		System.out.println("thread is starting...." + ThreadName);

		if (t == null) {

			t = new Thread(this, ThreadName); // very first time if thread t i null, then we will create new thread
			t.start(); // and called the start method
		}

	}

}

public class TheadDemoRunnableDemo {

	public static void main(String[] args) {

		SecondThread t1 = new SecondThread("thread 1"); // first thread created
		t1.start();

		SecondThread t2 = new SecondThread("thread 2"); // second thread created
		t2.start();

	}

}
