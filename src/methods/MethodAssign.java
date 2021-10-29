package methods;

public class MethodAssign {
	static double salary=25000;
	int age=35;
	
	public void method() {
		System.out.println("i am age: ");
	}
	
	static void display() {
		System.out.println("I am display method");
	}
	
	int add(int a,int b) {
		System.out.println("I am addition of: ");
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println("I am salary: "+MethodAssign.salary);
		MethodAssign m1=new MethodAssign();
		m1.method();
		System.out.println("I am display method: "+MethodAssign.display);
		

	}
}
