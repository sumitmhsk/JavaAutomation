package constructor;

public class Cons4 {

	Cons4(int r, double s) {
		System.out.println("Double parameter constructor");
	}

	Cons4(char A) {
		System.out.println("single parameter constructor");
	}

	void display() {
		double salary = 0;
		int roll = 0;
		System.out.println(roll + " " + salary);
	}

	public static void main(String[] args) {

		Cons4 c1 = new Cons4(2345, 35000.98);
		c1.display();
		Cons4 c2 = new Cons4(4567, 50000.85);
		c2.display();
	}

}
