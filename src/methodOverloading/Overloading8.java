package methodOverloading;

public class Overloading8 {

	public static void main(int args) {
		System.out.println("Main Method with int argument Executing");
		System.out.println(args);
	}

	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void main(String[] args) {
		System.out.println("Original main Executing");
		Overloading8.main(12);
		Overloading8.main('c');
		Overloading8.main(1236);
	}
}
