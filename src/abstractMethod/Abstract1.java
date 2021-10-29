package abstractMethod;

abstract class Demo {
	//Global
	//Constructor
	//normal or non-abstract or concrete method
	//abstract method
}
abstract class Demo1 {
	abstract void call1();
	abstract void call2();
	void display() {
	}
}

abstract class Demo2 {
	abstract void call1();
	abstract void call2();
}
abstract class Demo3 {
	void display() {
	}
}
public class Abstract1 extends Demo2 {
	void call1() {
	}
	void call2() {
	}

	public static void main(String[] args) {
		Abstract1 a1=new Abstract1();
		a1.call1();
	}

}
