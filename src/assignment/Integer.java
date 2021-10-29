package assignment;

public class Integer {

	public static void main(String[] args) {
		print(4);
	}

	static void print(double d) {
		if (d < 0) {
			System.out.println("The given number is negative: " + d);
		} else {
			System.out.println("The given number is positive: " + d);
		}
	}
}