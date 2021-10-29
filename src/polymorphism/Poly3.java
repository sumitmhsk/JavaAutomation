package polymorphism;

class Vehicle {

	void run() {
		System.out.println("Vehicle is moving");
	}
}

class Car2 extends Vehicle {

	void run() {
		System.out.println("Car is running safely");
	}
}

public class Poly3 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.run();

	}

}
