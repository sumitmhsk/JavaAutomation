package unaryOp;

public class UnaryOp1 {

	public static void main(String[] args) {
		int a = 70, b;
		b = a++;
		int x = a, y;
		y = ++x;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);

		int p = 101, q = 30, res;
		res = p++ + --q;
		System.out.println("Result: " + res);
		System.out.println("P " + p);
		System.out.println("Q " + q);
		System.out.println("********************");

		int res1 = ++p + q++;
		System.out.println("Result: " + res1);
		System.out.println("P " + p);
		System.out.println("Q " + q);
		System.out.println("********************");
	}
}
