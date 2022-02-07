package com.demo.threads;


// this  logic println table of 

class Table {
	
	
         synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(7000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

//MyThread1

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5); //multiply of 5 table
	}

}
//MyThread2 
class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);  //multiply of 100 table
	}
}

public class TestSynchronization1 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		
		
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();  // invoke first
		t2.start();   //invoke second
	}
}