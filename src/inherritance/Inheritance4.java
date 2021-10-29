package inherritance;

class vehicle {
	public void wheels() {
		System.out.println("I have wheels");
	}
}

class bike extends vehicle {
	public void countwheels() {
		System.out.println("I have two wheeler");
	}
}

class car1 extends vehicle {
	public void countwhlc() {
		System.out.println("I have four wheeler");
	}
}

class scooter extends vehicle {
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}
	public class Inheritance4 {

		public static void main(String[] args) {
			scooter s1 = new scooter();
			s1.wheels();
			s1.countwls();
			car1 c1 = new car1();
			c1.wheels();
			c1.countwhlc();
			bike b1 = new bike();
			b1.wheels();
			b1.countwheels();

		}
	}

