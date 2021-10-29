package blocks;

public class Block6 {
	
	Block6() {
		this(10);
		System.out.println("Zero parameter constructor...");
	}
	
	Block6(int i) {
		System.out.println("int-parameter constructor...");
	}
	
	static {
		System.out.println("Running static block...");
	}
	
	{
		System.out.println("Running non-static block");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		Block6 b1 = new Block6();
		System.out.println("***************");
		Block6 b2 = new Block6();
		System.out.println("main() ends...");
	}
	
	static {
		System.out.println("Running static block2...");
	}
	
	{
		System.out.println("Running non-static block2");
	}

}
