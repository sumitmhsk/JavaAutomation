package blocks;

public class Block2 {

	static {
		System.out.println("Running static block-1 of class2");
	}

	public static void main(String[] args) {
		System.out.println("Starts main()");
		System.out.println("I am main() of class2");
		System.out.println("Main() ends");
	}
	

	static {
		System.out.println("Running static block-2 of class2");
	}
}
