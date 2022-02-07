package com.demo.threads;

/*
 * 
 * //Thread Synchronization
//There are two types of thread synchronization mutual exclusive and inter-thread communication.

//Mutual Exclusive
//Synchronized method.
//Synchronized block.
//Static synchronization.
//Cooperation (Inter-thread communication in java)
 * 
 * 
 *  without any lock mechanism (synch)
 */

//synch method demo

class TableDemo {
	//// this method is responsible for printing tables
	synchronized  void printTable(int n) {
		for (int i = 1; i <= 5; i++) {

			System.out.println(n * i);

		}
		try {

			Thread.sleep(9000);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/// 
class Mythread3 extends Thread {

	TableDemo t;

	Mythread3(TableDemo t) {

		this.t = t;

	}

	public void run() {
        System.out.println("Mythread3 ... is starting");
		t.printTable(5);// passing the value fo mul 5

	}
}

class Mythread4 extends Thread {

	TableDemo t;

	Mythread4(TableDemo t) {

		this.t = t;

	}

	public void run() {
		System.out.println("Mythread4 ... is starting");
		t.printTable(100);// passing the value fo mul 100

	}

}

class Mythread5 extends Thread {

	TableDemo t;

	Mythread5(TableDemo t) {

		this.t = t;

	}

	public void run() {
		System.out.println("Mythread5 ... is starting");
		t.printTable(2);// passing the value fo mul 2

	}

}

public class WithoutSynchMethodDemo {

	public static void main(String[] args) {
		TableDemo obj = new TableDemo();

		Mythread3 t1 = new Mythread3(obj);

		Mythread4 t2 = new Mythread4(obj);
		
		//Mythread5 t3 = new Mythread5(obj);

		t1.start();

		t2.start();
		
	//	t3.start();


	}

}
