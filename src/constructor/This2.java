package constructor;

class Student1 {
	int rollNo;
	float fees;

	Student1(int rollNo, float fees) {
		this.rollNo = rollNo;
		this.fees = fees;
	}

	void display() {
		System.out.println(rollNo + " " + fees);
	}
}

class This2 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(100, 20000f);
		s1.display();
		Student1 s2 = new Student1(110, 50000f);
		s2.display();

	}

}
