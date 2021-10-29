package inherritance;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}

class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}

class Inheritance5 extends A2,B2{

	Inheritance5() {
		super();
	}

	public static void main(String[] args) {
		Inheritance5 fr = new Inheritance5();
		fr.msg();
	}
}
