package polymorphism;
//method overiding
class Hillstations {
	void location() {
		System.out.println("Location is: ");
	}

	void famousfor() {
		System.out.println("Famous for: ");
	}
}

class Manali extends Hillstations {
	void location() {
		System.out.println("Manali is in Himachal Pradesh");
	}

	void famousfor() {
		System.out.println("It is famous for Hadimba Temple and adventures");
	}
}

class Mussoorie extends Hillstations {
	void location() {
		System.out.println("Manali is in Uttarakhand");
	}

	void famousfor() {
		System.out.println("It is famous for education institutes");
	}
}

class Gulmerg extends Hillstations {
	void location() {
		System.out.println("Manali is in Jammu and Kashmir");
	}

	void famousfor() {
		System.out.println("It is famous for skiing");
	}
}

public class Poly6 {

	public static void main(String[] args) {
		Hillstations h1 = new Hillstations();
		h1.location();
		h1.famousfor();

		Hillstations m1 = new Manali();
		m1.location();
		m1.famousfor();

		Hillstations mu1 = new Mussoorie();
		mu1.location();
		mu1.famousfor();

		Hillstations g1 = new Gulmerg();
		g1.location();
		g1.famousfor();
	}
}
