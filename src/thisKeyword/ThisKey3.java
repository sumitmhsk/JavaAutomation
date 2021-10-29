package thisKeyword;

class A {
	void m() {
		System.out.println("I am Constructor of m");
	}

	void n() {
		System.out.println("I am Constructor of n");

		this.m();
	}
}

class ThisKey3 {

	void Method1() {
		System.out.println("I am Method1");
	}

	void Method2() {
		System.out.println("I am Method2");
	}

	public static void main(String[] args) {
		ThisKey3 t2 = new ThisKey3();
		t2.Method2();
		A a1 = new A();
		a1.m();

	}

}
