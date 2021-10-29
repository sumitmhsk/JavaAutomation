package inherritance;

class Grandfather {
	Grandfather() {
		System.out.println("I am class Grandfather Constructor...");
	}

	void myHome() {
		System.out.println("I am at Home of Grandfather");
	}
}

class Father extends Grandfather {
	Father(double d) {
		System.out.println("I am class Father Constructor...");
	}

	void myCar() {
		System.out.println("I am Car of Father");
	}
}

class Child1 extends Father {
	Child1(int i) {
		super(15.24);
		System.out.println("I am class Child1 Constructor...");
	}

	void myBike() {
		System.out.println("I am Bike of Child1");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		System.out.println("***********************");
		Child1 c1 = new Child1(26);
		c1.myBike();
		c1.myCar();
		c1.myHome();
		System.out.println("***********************");
		Father f1 = new Child1(79);
		f1.myHome();
		f1.myCar();
		System.out.println("***********************");
		Grandfather g1 = new Child1(32);
		g1.myHome();
		System.out.println("***********************");
		Grandfather g2 = new Father(52.74);
		g2.myHome();

	}

}
