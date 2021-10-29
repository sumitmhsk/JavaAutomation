package abstractMethod;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
class AbstractSuper1 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		AbstractSuper1 obj = new AbstractSuper1();
		obj.myMethod();
	}
}
