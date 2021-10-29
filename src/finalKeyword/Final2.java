package finalKeyword;

public class Final2 {
	final int empID = 101;
	double salary = 23000.54;

	void run() {
		System.out.println("Employee ID: " + empID);
	}

	public static void main(String[] args) {
		Final2 f2 = new Final2();
		f2.run();
		System.out.println(f2.salary);
	}
}
