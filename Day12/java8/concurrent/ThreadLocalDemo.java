package com.demo.java8.concurrent;

class ThreadLocalD implements Runnable {

	private ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();

	@Override
	public void run() {
		threadlocal.set((int) (Math.random() * 100D)); //allocation random number 

		try {

			Thread.sleep(7000);
		}

		catch (InterruptedException e) {
		}

		System.out.println(threadlocal.get());

	}

}

class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {

		ThreadLocalD m = new ThreadLocalD();

		Thread t1 = new Thread(m);

		Thread t2 = new Thread(m);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

}
