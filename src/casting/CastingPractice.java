package casting;

class Parent1 {
	void myHome() {
		System.out.println("I am Parent Home");
	}
}

class Child1 extends Parent1 {
	void myBike() {
		System.out.println("I am Child's Bike");
	}
}

public class CastingPractice {

	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.myHome();
		obj.myBike();
		
		//Parent1 obj1=new Child1();//implicit up casting
		//obj.myHome();
		
		Child1 obj2=new Child1();
		Parent1 p=(Parent1)obj2;//explicit up casting
		obj.myHome();
		obj.myBike();
		
		Parent1 obj3=new Child1();//implicit up casting
		Child1 c=(Child1)obj3;//explicit down casting
	}
}
