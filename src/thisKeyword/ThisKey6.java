package thisKeyword;

class ThisKey6 {
	//global variable
	int variable = 25;

	void method(int variable) {
		System.out.println("Value of Instance variable: " + this.variable);
		System.out.println("Value of Local variable: " + variable);
	}

	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable: " + this.variable);
		System.out.println("Value of Local variable: " + variable);
	}

	public static void main(String[] args) {
		ThisKey6 t1 = new ThisKey6();
		t1.method(16);
		t1.method();

	}

}
