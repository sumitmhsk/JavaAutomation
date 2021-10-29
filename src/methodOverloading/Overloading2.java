package methodOverloading;

public class Overloading2 {

	public void square() {
		System.out.println("No parameter called");
	}

	public void square(int a) {
		int square = a * a;
		System.out.println("Interger parameter called: " + square);
	}

	public void square(float f) {
		float square = f * f;
		System.out.println("Float parameter called: " + square);
	}

	public static void main(String[] args) {
		Overloading2 m1 = new Overloading2();
		m1.square(6.8f);
		m1.square();
		m1.square(14);
	}
}
