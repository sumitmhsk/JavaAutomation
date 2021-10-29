package methods;

public class Method2 {
	
	static double salary=25000.26;
	static int empId=1001;


	public static int printEmpID() {
		System.out.println("PrintEmpID is running...");
		return empId;
	}
	
	public static void printEmpSal() {
		System.out.println("PrintEmpSal is running..."+salary);
	}
	
	public static void main(String[] args) {
		int age=25;
		System.out.println("Age: "+age);
		System.out.println("Salary: "+Method2.salary);
		System.out.println("Employee ID: "+Method2.empId);
		Method2.printEmpSal();
		//int id=Method2.printEmpID();
		//System.out.println("empId: "+empId);
				//or
		System.out.println("empId: "+Method2.empId);
		
		

	}

}
