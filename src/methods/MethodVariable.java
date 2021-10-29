package methods;

public class MethodVariable {

	static double salary = 10000.67;
	int empId = 1001;

	public static void main(String[] args) {

		int age = 30;

		MethodVariable m1 = new MethodVariable();
		System.out.println("EmpId: " + m1.empId);
		System.out.println("age: " + age);
		System.out.println("Salary: "+MethodVariable.salary);//10000.67
	}
}
