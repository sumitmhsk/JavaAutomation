package polymorphism;

class bike {
	int speedlimit = 90;
}

class Honda3 extends bike {
	int speedlimit = 120;
}

public class Poly2 {
	public static void main(String[] args) {
		bike b1 = new Honda3();
		System.out.println("Speed of my bike: " + b1.speedlimit);
	}

}
