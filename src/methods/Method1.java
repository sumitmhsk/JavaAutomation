package methods; //Static method

public class Method1 {

	static void addTwoNum(int a, int b) {
		int res = a + b;
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("Result: " + res);
	}

	public static void main(String[] args) {
		int x = 10, y = 35, res;
		res = x + y;

		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Result: " + res);

		Method1.addTwoNum(10, 25);
		Method1.addTwoNum(65, 25);
		Method1.addTwoNum(10, 85);
		Method1.addTwoNum(150, 250);

	}
}