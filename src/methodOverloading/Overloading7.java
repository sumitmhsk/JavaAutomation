package methodOverloading;

public class Overloading7 {
	public int myMethod1(int num1, int num2) {
		System.out.println("First myMethod of class demo");
		return num1 + num2;
	}

	public int myMethod2(int var1, int var2) {
		System.out.println("Second myMethod of class demo");
		return var1 - var2;
	}

	public static void main(String[] args) {
		Overloading7 d1 = new Overloading7();
		d1.myMethod1(25, 35);
		d1.myMethod2(35, 10);
	}
}
