package forloop;

public class DoWhile2 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("Printing numbers from 10 to 0");
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
	}

	double addTwoNum(double a, int b) {
		return (a + b);
	}
}
