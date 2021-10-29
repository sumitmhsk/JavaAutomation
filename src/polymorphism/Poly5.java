package polymorphism;

class animal {
	void eat() {
		System.out.println("Animal eat");
	}
}

class herbivores extends animal {
	void eat() {
		System.out.println("herbivores eats plants");
	}
}

class omnivores extends animal {
	void eat() {
		System.out.println("omnivores eats plants and meat");
	}
}

class carnivores extends animal {
	void eat() {
		System.out.println("carnivores eats meat");
	}
}

public class Poly5 {
//method overiding
	public static void main(String[] args) {
		animal a1 = new animal();
		a1.eat();
		animal h1 = new herbivores();//upcasting
		h1.eat();
		animal o1 = new omnivores();//upcasting
		o1.eat();
		animal c1 = new carnivores();//upcasting
		c1.eat();
	}
}
