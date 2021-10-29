package methodOverloading;

public class Overloading1 {
	/**
	 * Method Overloading: any method declare more than once in class body with
	 * anyone of below rules:
	 * 1. type of argument differ.
	 * 2. number of arguments/parameter should differ.
	 * 3. position of arguments/parameter should differ.
	 */

	static double res;

	static public void square() {
		System.out.println("No parameter Method");
	}

	public static void square(int num) {
		res = num * num;
		System.out.println("Method with integer Argument: " + res);
	}

	static public void square(double num) {
		res = num * num;
		System.out.println("Method with float Argument: " + res);
	}

	public static void main(String[] args) {
		Overloading1.square(26.5f);
		Overloading1.square(30);
		Overloading1.square();

	}

}
