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

class TableDemowithSynchBlock {
	//// this method is responsible for printing tables
	 void printTable(int n) {
		 synchronized (this) {
		 
		for (int i = 1; i <= 5; i++) {

			System.out.println(n * i);

		}
		try {

			Thread.sleep(9000);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		 }//sych block closed here

	}

}

/// 
class Mythread6 extends Thread {

	TableDemo t;

	Mythread6(TableDemo t) {

		this.t = t;

	}

	public void run() {
        System.out.println("Mythread3 ... is starting");
		t.printTable(5);// passing the value fo mul 5

	}
}

class Mythread7 extends Thread {

	TableDemo t;

	Mythread7(TableDemo t) {

		this.t = t;

	}

	public void run() {
		System.out.println("Mythread4 ... is starting");
		t.printTable(100);// passing the value fo mul 100

	}

}



public class SynchBlockDemo {

	public static void main(String[] args) {
		TableDemo obj = new TableDemo();

		Mythread6 t1 = new Mythread6(obj);

		Mythread7 t2 = new Mythread7(obj);
		
		//Mythread5 t3 = new Mythread5(obj);

		t1.start();

		t2.start();
		
	//	t3.start();


	}

}
