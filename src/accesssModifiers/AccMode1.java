package accesssModifiers;

public class display {
	int age = 50;

	void print1() {
		System.out.println("I am main");
	}
}

public class AccMode1 {

	public static void main(String[] args) {
		display d1 = new display();
		d1.print1();

	}

}
