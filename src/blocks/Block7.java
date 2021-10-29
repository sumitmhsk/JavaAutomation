package blocks;

public class Block7 {

	static int age = 25;
	double salary = 35000.45;

	static {
		age = 30;
	}

	{
		salary = 40000.17;
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		System.out.println("age: " + Block7.age);
		System.out.println("******************");
		Block7 b1 = new Block7();
		System.out.println("salary: " + b1.salary);
		System.out.println("********************");
	}
}
