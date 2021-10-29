package thisKeyword;

class ThisKey8 {
	int a;
	int b;
	// Parameterized constructor
	ThisKey8(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		//Displaying value of variables a and b
		System.out.println("A = " + a + "B = " + b);
	}

	public static void main(String[] args) {
		ThisKey8 t1 = new ThisKey8(25, 65);
		t1.display();
		System.out.println(t1.a + " " + t1.b);
		ThisKey8 t2 = new ThisKey8(105, 210);
		t2.display();
		System.out.println(t2.a + " " + t2.b);
	}

}
