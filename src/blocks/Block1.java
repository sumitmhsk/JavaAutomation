package blocks;

public class Block1 {

	static {
		System.out.println("Running static block of class");
	}

	public static void main(String[] args) {
		System.out.println("Starts main()");
		System.out.println("I am main() of class");
		System.out.println("Main() ends");
	}
}
