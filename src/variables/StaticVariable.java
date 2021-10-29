package variables;

public class StaticVariable {

	static double salary = 25000;
	static int accNum = 25316;

	public static void main(String[] args) {
		int deptNum = 100;
		System.out.println("Department number is: " + deptNum);
		System.out.println("Std Salary: " + StaticVariable.salary);
		salary = 50000.56;
		System.out.println("Average Salary: " + salary);

		System.out.println("Account number is: " + accNum);
		System.out.println("Account number is: " + StaticVariable.accNum);

	}

}
