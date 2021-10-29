package singletonClass;

class Demo1234 {
	// Rule 1: Constructor is private
	private Demo1234() {
		System.out.println("I am zero parameter");
	}

	// Rule2: static instance
	static Demo1234 d1 = new Demo1234();
	String name = "Pune";

	// Rule3: static method with return type as class
	static Demo1234 getInstance() {
		return d1;
	}

	void print() {
		System.out.println("I am print() of Singleton class");
	}
}

public class Single1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1234 d1 = Demo1234.getInstance();
		d1.print();
		System.out.println(d1.name);
		d1.name = "Banguluru";
		System.out.println("d1 ref: " + d1.name);
		Demo1234 d2 = Demo1234.getInstance();
		System.out.println("d2 ref: " + d2.name);
		System.out.println(d1.toString());
	}
}
