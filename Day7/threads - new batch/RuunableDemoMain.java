package com.demo.threads;
/// using runnable interface in thread class

class RuunableDemo implements Runnable {
	Thread t;
	String ThreadName;

	// constructor
	RuunableDemo(String threadname) {
		ThreadName = threadname;
		System.out.println("creating " + threadname);
	}

	// write logic here
	public void run() {
		try {
			for (int i = 8; i > 0; i--) {
				System.out.println("Thread " + ThreadName + " ," + i);
				Thread.sleep(7000);/// this will catch the cpu time of windows os
			}
		} catch (InterruptedException e) {
			System.out.println("thread " + ThreadName + " has been Interrupted");
		}
	}

	//start method called the run method
	public void start() {
		System.out.println("thread is starting " + ThreadName);
		if (t == null) {
			t = new Thread(this, ThreadName);// new thread created and assign the name to thread class
			t.start();
		}
	}
}

public class RuunableDemoMain {

	public static void main(String ar[]) {

		ThreadDemo1 t1 = new ThreadDemo1(" thread 1");

		t1.start();

		ThreadDemo1 t2 = new ThreadDemo1(" thread 2");
		t2.start();

	}

}
