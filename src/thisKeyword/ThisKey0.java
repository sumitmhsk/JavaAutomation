package thisKeyword;

public class ThisKey0 {
	static int age;
	int salary;
	int empId;

	void display(int salary) {
		System.out.println("Salary: " + salary);
		System.out.println("Salary: " + this.salary);
		this.salary = 35000;
		System.out.println("Salary: " + this.salary);
	}

	public static void main(String[] args) {
		int age = 30;
		System.out.println("Age: " + age);
		System.out.println("Global Age: " + ThisKey0.age);
		int salary = 25000;
		int empId = 200;
		System.out.println("Local Salary: " + salary);
		System.out.println("Local EmpId: " + empId);
		ThisKey0 t1 = new ThisKey0();
		System.out.println("T1: Global Salary: " + t1.salary);
		System.out.println("T1: Global EmpId: " + t1.empId);
		t1.display(45000);
		System.out.println("T1: Global Salary: " + t1.salary);
		ThisKey0 t2 = new ThisKey0();
		System.out.println("T2: Global Salary: " + t2.salary);
		System.out.println("T2: Global EmpId: " + t2.empId);
		t2.display(55000);
	}

}