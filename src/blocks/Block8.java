package blocks;

public class Block8 {
	int age = 30;
	double salary = 36000.26;

	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		Block8 b = new Block8();
		b.print();
		System.out.println("main() ends...");
	}
}
