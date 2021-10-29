package thisKeyword;

public class ThisKey2 {
	int x;
// Constructor with a parameter
	public ThisKey2(int x) {
		this.x = x;
	}
// Call the constructor
	public static void main(String[] args) {
		ThisKey2 t1 = new ThisKey2(10);
		System.out.println("Value of x: " + t1.x);

	}

}
