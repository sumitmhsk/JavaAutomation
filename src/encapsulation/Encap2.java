package encapsulation;

public class Encap2 {
	int age = 35;

	public int display() {
		System.out.println("My age is: " + age);
		return age;
	}

	public void display1(int age) {
		System.out.println("My age1 is: " + age);
	}

	public static void main(String[] args) {
		Encap2 e1 = new Encap2();
		e1.display();
		e1.display1(20);
		// System.out.println(p1.displayAge(25));
	}
}
