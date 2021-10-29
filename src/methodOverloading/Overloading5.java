package methodOverloading;

public class Overloading5 {
	void display(int a, double d) {
		System.out.println("Method A");
	}

	void display(int a, double d, double b) {
		System.out.println("Method B");
	}

	void display(int a, float f) {
		System.out.println("Method C");
	}
	
	public static void main(String[] args) {
		Overloading5 a1=new Overloading5();
		a1.display(10, 12.54);
		a1.display(25, 15.4f);
		a1.display(18, 65.12, 45.50);

	}
}