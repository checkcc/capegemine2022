package com.demo.java8.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class CallClass implements Callable {

	@Override
	public Object call() throws Exception {

		Random generator = new Random();

		Integer randomgenerator = generator.nextInt(4);

		Thread.sleep(randomgenerator * 2000);

		return randomgenerator;
	}

}

public class CallableDemo {
	public static void main(String ar[]) {

		FutureTask[] numbertask = new FutureTask[5];

		for (int i = 0; i < 5; i++) {

			Callable callss = new CallClass();

			numbertask[i] = new FutureTask(callss);

			Thread t = new Thread(numbertask[i]);

			t.start();

		}

		for (int i = 0; i < 5; i++) {

			try {
				System.out.println(numbertask[i].get());
			} catch (InterruptedException e) {

				e.printStackTrace();
			} catch (ExecutionException e) {

				e.printStackTrace();
			}

		}

	}

}
