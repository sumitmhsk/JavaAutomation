package inherritance;

class fourWheeler {
	//default constrcutor
	public void wheels() {
		System.out.println("I have 4 wheeler..");
	}
}
//child class of fourwheeler and parent of maruti
class car extends fourWheeler {
	//default constructor with default super()
	public void type() {
		System.out.println("I am a car");
	}
}
//child class of car class
class maruti extends car {
	//default constructor with default super()
	public void company() {
		System.out.println("I am Maruti");
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		maruti fr = new maruti(); // object of child class
		fr.wheels();
		fr.type();
		fr.company();
	}
}
