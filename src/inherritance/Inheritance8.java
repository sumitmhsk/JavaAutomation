package inherritance;

class fruitB {
	int fruitAge;

	fruitB() {
		System.out.println("I am Fruit B Constructor");
		fruitAge = 10;
	}

	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

class mango extends fruitB {
	int fruitAge;

	mango() {
		System.out.println("I am Mango class Constructor");
		fruitAge = 25;
	}

	public void shape() {
		System.out.println("Mangos are round in shape");
	}

	public void taste() {
		System.out.println("Mangos are sour in taste");
	}
}

public class Inheritance8 {

	public static void main(String[] args) {
		System.out.println("**************************");
		mango m1 = new mango();
		m1.shape();// mangos are round
		m1.taste();// mangos are sour
		System.out.println("Value of FruitAge: " + m1.fruitAge);// 25

		fruitB f1 = new fruitB();
		f1.taste();// fruits are sweet
		System.out.println("Value of FruitAge: " + f1.fruitAge);// 10
		System.out.println("*************************");

	}

}
