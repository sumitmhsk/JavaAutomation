package thisKeyword;

class Student {
	int rollNo;
	float fees;
	
	Student(int rollNo, float fees) {
		rollNo = rollNo;
		fees = fees;
	}
	void display() {
		System.out.println(rollNo +" "+ fees);
	}
	
}

class ThisKey1 {

	public static void main(String[] args) {
		Student s1=new Student(100,560.2f);
		s1.display();
		Student s2=new Student(110,481.3f);
		s2.display();

	}

}
