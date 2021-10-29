package blocks;

public class Block5 {
	Block5() {
		System.out.println("Zero parameter Constructor");
	}
	/*static block*/
	static {
		System.out.println("Running static block");
	}
	
	/* non-static block */
	{
		System.out.println("Running non-static block");
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		Block5 b = new Block5();
		System.out.println("******************");
		Block5 b3 = new Block5();
		System.out.println("main() ends....");
		

	}

}
