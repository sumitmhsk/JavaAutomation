package methods;

public class Method5 {

	// static global variables
	static int age;
	static double salary;

	// static method with return value no argument
	public static int test1() {
		System.out.println("I am test1 method.");
		// logic
//			int pin=201201;
//			return pin;
		return 201201;
	}

	// static method without return value no argument
	static void test2() {
		System.out.println("I am test2 method");
		// return; this will be written by java compiler at compile
	}

	// static method with return value along with argument
	static double test3(boolean b1) {
		System.out.println("I am test3 method");
		return 50.24;
	}

	// static method without return value along with argument
	static private void test4(float f) {
		System.out.println("I am test4 method");
	}

	public static void main(String[] args) {
		Method5 m1=new Method5();
		m1.test2();
		m1.test4(15.4f);
		m1.test3(false);
		m1.test1();
	}

}