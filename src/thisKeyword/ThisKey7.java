package thisKeyword;

class Student1 {
	int rollNo; //global variable
	float fee; //global variable

	Student1(int rollNo, float fee) {
		System.out.println("Local Roll No.: " + rollNo);
		System.out.println("Local Fess: " + fee);
		System.out.println("Initial Global Roll No.: " + this.rollNo); //0
		System.out.println("Initial Global Fess: " + this.fee); //0.0

		this.rollNo = rollNo;
		this.fee = fee;
		System.out.println("After Update, Global Roll No.: " + this.rollNo);
		System.out.println("After Update, Global Fess: " + this.fee);
	}

	void display() {
		System.out.println(rollNo + " " + rollNo);
	}
}

class ThisKey7 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(101, 3500.5f);
		s1.display();
		Student1 s2 = new Student1(102, 4500.5f);
		s2.display();

	}

}
