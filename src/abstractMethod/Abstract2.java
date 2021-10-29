package abstractMethod;

abstract class animal {
	public abstract void animalSound();
	public void sleep() {
		System.out.println("zzzz");
	}	
}

class pig extends animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class cat extends pig {
	public void animalSound() {
		System.out.println("The cat says: meow meow");
	}
}

public class Abstract2 {

	public static void main(String[] args) {
		cat c1=new cat();
		c1.animalSound();
		c1.sleep();
		pig p1=new pig();
		p1.animalSound();
		p1.sleep();
		System.out.println("************************");
		animal a1=new cat();
		a1.animalSound();

	}

}
