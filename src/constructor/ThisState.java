package constructor;

public class ThisState {

	int salary;
	int empId;

	void display(int salary) {
		System.out.println("Salary: " + salary);
		System.out.println("Salary: " + this.salary);
		this.salary = 45000;
		System.out.println("Salary: " + this.salary);
	}

	public static void main(String[] args) {
		int salary = 28000;
		int empId = 101;
		System.out.println("Local salary: " + salary);
		System.out.println("Local EmpID: " + empId);
		ThisState t1 = new ThisState();
		System.out.println("Global EmpID: " + t1.empId);
		System.out.println("Global salary: " + t1.salary);
		t1.display(50000);
		System.out.println("t1:Global salary " + t1.salary);
		ThisState t2 = new ThisState();
		System.out.println("Global EmpID: " + t2.empId);
		System.out.println("Global salary: " + t2.salary);
		t2.display(780000);

	}

}
