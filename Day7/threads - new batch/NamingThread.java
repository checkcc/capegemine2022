package com.demo.threads;

class NamingThreadDemo extends Thread {

	// predefind method

	public void run() {

		System.out.println("running..");
	}

}

public class NamingThread {

	public static void main(String ar[]) {
		
		NamingThreadDemo t1 = new NamingThreadDemo();
		
		t1.start();
		t1.setName(" tom-thread");
		System.out.println("get the name of thread" + t1.getName());
		t1.setPriority(8);
		
		System.out.println("get prioity of thread" + t1.getPriority());


	}

}
