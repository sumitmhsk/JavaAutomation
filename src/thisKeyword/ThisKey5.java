package thisKeyword;

class ThisKey5 {

	int variable = 10;

	void method(int variable) {
		System.out.println("Value of variable: " + variable);
		variable = 10;
		System.out.println("Value of variable: " + variable);
	}

	void method() {
		int variable = 40;
		System.out.println("Value of variable: " + variable);
	}

	public static void main(String[] args) {
		ThisKey5 t1 = new ThisKey5();
		t1.method(20);
		t1.method();
		System.out.println(t1.variable);
	}
}
