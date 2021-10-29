package constructor;

class B {
	int i = 10;
	B() {
		System.out.println("Running constructor B");
		i = 25;
	}
}

public class Cons1 {

	public static void main(String[] args) {
		System.out.println("main() of starts...");
		B b1 = new B();
		System.out.println("Class B Global variable: "+b1.i);
		System.out.println("***********************");
		B b2 = new B();
		System.out.println("Class B Global variable: "+b2.i);
		System.out.println("main() of ends...");

	}

}
