package constructor;

public class This3 {
	int variable = 10;

	public static void main(String[] args) {
		This3 obj = new This3();
		obj.method(30);
		obj.method();
		System.out.println(obj.variable);
	}

	void method(int variable) {
		System.out.println("Value of variable: " + variable);
		variable = this.variable;
		System.out.println("Value of variable: " + variable);
		System.out.println("Global Value of variable: " + this.variable);
	}

	void method() {
		System.out.println("Value of variable: " + variable);
	}

}
