package variables;

public class NonStaticVariables {
	int empID = 0;
	double salary;

	public static void main(String[] args) {
		NonStaticVariables obj = new NonStaticVariables();
		System.out.println("Employee ID: " + obj.empID);
		System.out.println("Net Salary: " + obj.salary);
		obj.empID = 1000;
		obj.salary = 25000.532;
		System.out.println("Employee ID: " + obj.empID);
		System.out.println("Net Salary: " + obj.salary);

		NonStaticVariables obj2 = new NonStaticVariables();
		System.out.println("Employee ID: " + obj2.empID);
		System.out.println("Net Salary: " + obj2.salary);
	
	}

}