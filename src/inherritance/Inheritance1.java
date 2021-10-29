package inherritance;

class fruit {
	fruit() {
		System.out.println("Fruit class cons...");
	}

	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

class apple extends fruit {
	apple() {
		System.out.println("Apple class cons...");
	}

	public void shape() {
		System.out.println("Apple is round");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		apple fr = new apple();
		fr.taste();
		fr.shape();
	}
}
