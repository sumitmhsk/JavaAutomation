package constructor;

public class Memory {

	static int salary;
	int empId;

	void display() {
		System.out.println("i am display1()...");
	}

	static void print() {
		System.out.println("i am print()...");
	}

	public static void main(String[] args) {
		System.out.println("static variable salary: " + Memory.salary);
		Memory.print();

		Memory m1 = new Memory();
		System.out.println("non-static variable empId: " + m1.empId);
		m1.display();

		Memory.salary = 50000;
		System.out.println("update static variable salary: " + Memory.salary);

		m1.empId = 210;
		System.out.println("non-static variable empId: " + m1.empId);

	}

}
