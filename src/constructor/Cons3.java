package constructor;

public class Cons3 {
	int roll;
	double salary;

	Cons3(int r, double s) {
		roll = r;
		salary = s;
	}

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String[] args) {

		Cons3 c1 = new Cons3(2345, 35000.98);
		c1.display();
		Cons3 c2 = new Cons3(4567, 50000.85);
		c2.display();
	}

}
