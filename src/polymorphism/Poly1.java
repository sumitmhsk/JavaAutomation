package polymorphism;

public class Poly1 {

	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of num: " + c);
	}

	static void sum(int a, int b, int d) {
		int e = a + b + d;
		System.out.println("Addition of three num: " + e);
	}

	public static void main(String[] args) {
		Poly1.sum(25, 35);
		Poly1.sum(10, 25, 35);
	}
}
