package unaryOp;

public class UnaryOp2 {

	public static void main(String[] args) {
		int a = 15;
		int b = a;
		System.out.println("a: " + a);// 15
		System.out.println("b: " + b);// 15
		/**
		 * pre: first perform the operation dn use the updated value post: first use the
		 * value dn perform the operation
		 */
		int p = ++a;
		System.out.println("p: " + p);// 16
		System.out.println("a: " + a);// 16
		int q = a++;
		System.out.println("p: " + p);// 16
		System.out.println("q: " + q);// 16

		int r = 17;
		System.out.println("r: " + r++);// 17
		System.out.println("r: " + r);// 18
		System.out.println("r: " + ++r);// 19
		System.out.println("r: " + r);// 19

		int s = 56;
		System.out.println("s: " + s--);// 56
		System.out.println("s: " + s);// 55
		System.out.println("s: " + --s);// 54
		System.out.println("s: " + s);// 54

	}

}
