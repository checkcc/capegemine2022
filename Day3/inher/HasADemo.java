package com.demo.inher;

/// this is an another component
class Engine {

	void start() {

		System.out.println("  engine start");

	}

	void stop() {

		System.out.println("  engine stop");

	}

}

class Bike {

	void speed() {

		System.out.println("  bike has speed");
	}

	void color() {

		System.out.println("  bike has color");
	}

}

///     IS-A relation ship
class Yahamha extends Bike {

	void speed() {

		System.out.println("  bike has speed  300 mile/hr");
	}

	void color() {

		System.out.println("  Yahamha has red in  color");
	}

	///// user defined
	void showBikeComponentDetails() {

		/// pluge in the engine component here

		Engine yahamhaengine = new Engine();//// created the object of Engine class and referenced here

		yahamhaengine.start();
		yahamhaengine.stop();

	}

}

public class HasADemo {

	public static void main(String ar[]) {

		Yahamha yahamhabike = new Yahamha();
		yahamhabike.showBikeComponentDetails();
	}

}
