package inherritance;

class fruits {
	int fruitAge;

	fruits() {
		System.out.println("Fruit class Constructor...");
		fruitAge = 10;
	}

	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

class orange extends fruits {
	int fruitAge;

	orange() {
		// super(); //compiler will write default super()
		System.out.println("Orange class Constructor...");
		fruitAge = 25;
	}

	public void shape() {
		System.out.println("Orange shape is round");
		System.out.println("Orange Fruit: " + fruitAge);
		System.out.println("Fruit fruitage: " + super.fruitAge);
		super.taste();
	}
}

public class Inheritance7 {

	public static void main(String[] args) {
		System.out.println("*****************");
		orange o1 = new orange();
		o1.shape();
		System.out.println("******************");

	}

}
