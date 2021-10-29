package methodOverloading;

class Overloading3 {

	static int adder(int a, int b) {
		return a + b;
	}

	static int adder(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println(Overloading3.adder(16, 20));
		System.out.println(Overloading3.adder(10, 60, 15));

	}

}
