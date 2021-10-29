package ifelse;

public class BiggestNum {

	public static void main(String[] args) {
		print(25, 65, 87);
	}

	static void print(int a, int b, int c) {

		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");

		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");

		else
			System.out.println(c + " is the largest Number");
	}
}