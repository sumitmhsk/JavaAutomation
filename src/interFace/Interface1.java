package interFace;

interface Bank {
	float rateOfInterest();
}

class SBI1 implements Bank {
	public float rateOfInterest() {
		return 5.12f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.3f;
	}
}

class Interface1 {

	public static void main(String[] args) {
		SBI1 s1 = new SBI1();
		System.out.println("SBI ROI: " + s1.rateOfInterest());
		PNB p1 = new PNB();
		System.out.println("PNB ROI: " + p1.rateOfInterest());
		Bank b1 = new PNB();
		System.out.println("Bank ROI: " + b1.rateOfInterest());

	}
}
