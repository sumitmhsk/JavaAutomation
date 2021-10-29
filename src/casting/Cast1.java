package casting;

class GrandParent{
	void myHome() {
		System.out.println("GrandParent home");
	}
}
class Parent extends GrandParent{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class Cast1 {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.myHome();
		c1.show();
		c1.callme();
		c1.readme();
		
		Parent p1=new Parent();
		p1.myHome();
		p1.show();
		p1.callme();
		
		Parent p2=new Child();//implicit up casting
		p2.myHome();
		p2.show();
		p2.callme();
		
		Child c2=new Child();
		c2.callme();
		c2.myHome();
		c2.show();
		c2.readme();
		Parent p3=(Parent)c2;//explicit up casting
		p3.callme();
		p3.myHome();
		p3.show();
		System.out.println("----------------");
		Parent p=new Child();//implicit up casting
		Child c=(Child)p;//explicit downcasting
		System.out.println("I am downcasting");
	}
}
