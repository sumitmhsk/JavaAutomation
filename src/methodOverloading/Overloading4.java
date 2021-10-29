package methodOverloading;

public class Overloading4 {

	static int salary;
	int empId;

	void display() {
		System.out.println("I am display method");
	}

	static void print() {
		System.out.println("I am Print method");
	}

	public static void main(String[] args) {
		// access static members--->static variable and method
		System.out.println("Static variable salary: " + Overloading4.salary);
		Overloading4.print();

		// access non-static members--->non-static variable and method
		Overloading4 m1 = new Overloading4();
		System.out.println("Non-static variable salary: " + m1.empId);
		m1.display();
		
		//update static member
		Overloading4.salary=35000;
		System.out.println("Updated static variable salary: " + Overloading4.salary);
		
		//Non-static update static member
		m1.empId=205;
		System.out.println("Updated non-static variable salary: " + m1.empId);
		
		Overloading4 m2 = new Overloading4();
		System.out.println("Non-static variable salary: " + m2.empId);
		m2.display();
	}
}
