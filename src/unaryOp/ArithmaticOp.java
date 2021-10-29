package unaryOp;

public class ArithmaticOp {

	public static void main(String[] args) {
		// Variables declaration and initialization
		int num1 = 14, num2 = 16;
		// addition
		int sum = num1 + num2;
		System.out.println("The addition is: " + sum);
		// substraction
		int diff = num2 - num1;
		System.out.println("The Difference is: " + diff);
		// multiplication
		int multi = num1 * num2;
		System.out.println("The Multiplication is: " + multi);
		// division
		double div = num2 / num1;
		System.out.println("The Division is: " + div);
		// Modulus
		int rem = num2 % num1;//it gives remainder
		System.out.println("The Remainder is: " + rem);
	}
}
