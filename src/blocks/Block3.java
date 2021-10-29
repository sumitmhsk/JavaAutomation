package blocks;

public class Block3 {

	Block3() {
		System.out.println("Zero parameter constructor");
	}

	{
		System.out.println("Running non-static block");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		Block3 b1 = new Block3();
		System.out.println("***********************");
		Block3 b2 = new Block3();
		System.out.println("main() ends");
	}
}
