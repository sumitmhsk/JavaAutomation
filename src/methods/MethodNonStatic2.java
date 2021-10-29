package methods;

public class MethodNonStatic2 {

	int age = 35;

	void display() {
		System.out.println("I am display() MethodNonStatic and age value is: " + age);
	}

	void display(int a) {
		age = a;
		System.out.println("I am display(int) MethodNonStatic and age value is: " + age);
	}

	public static void main(String[] args) {

		//MethodNonStatic m1; // no object creation, it is just a reference variable.
		//new MethodNonStatic(); // yes, object got created, but we don't know where this object created
		//m1 = new MethodNonStatic(); // yes, object got created with help of m1 reference we can access its members
		MethodNonStatic2 m2 = new MethodNonStatic2(); // final type of object creation
		System.out.println("age: "+m2.age); // variable access; default value=0
		m2.display(); //default value=0
		m2.display(25); //new value =25

	}

}
