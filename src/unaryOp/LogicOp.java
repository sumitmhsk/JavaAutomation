package unaryOp;

public class LogicOp {

	public static void main(String[] args) {
		// Variables Definition and Initialization
		boolean bool1 = true, bool2 = true;

		// Logical AND
		System.out.println("bool1 && bool2 = " + (bool1 && bool2));// true

		// Logical OR
		System.out.println("bool1 || bool2 = " + (bool1 || bool2)); // true

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));// false

	}
}