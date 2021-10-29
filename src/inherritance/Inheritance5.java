package inherritance;

class A1{
	static int a=20;
	int b=32;
	double c=12.56;
}

class B1 extends A1 {
	static int x=12;
	int y=36;
	double z=43.56;
}

class C1 extends B1 {
	static int p=15;
	int q=42;
	double r=23.34;
}
public class Inheritance5 {

	public static void main(String[] args) {
		/****************** Access static member class A members *********************/
		System.out.println("Class A1 static variable: "+A1.a);
		/****************** Access static member class B members *********************/
		System.out.println("Class B1 static variable: "+B1.x);
		/****************** Access static member class C members *********************/
		System.out.println("Class C1 static variable: "+C1.p);
		/****************** Access non-static member class A members *********************/
		/******************Access non-static member class A1,B1 & C1 members*********************/
		
		System.out.println("*******************************************");
		C1 c1=new C1();
		System.out.println("With Class C refer: "+c1.b);
		System.out.println("With Class C refer: "+c1.c);
		System.out.println("With Class C refer: "+c1.q);
		System.out.println("With Class C refer: "+c1.r);
		System.out.println("With Class C refer: "+c1.y);
		System.out.println("With Class C refer: "+c1.z);
		System.out.println("*******************************************");
		B1 b1=new B1();
		System.out.println("With Class B refer: "+b1.b);
		System.out.println("With Class B refer: "+b1.c);
		System.out.println("With Class B refer: "+b1.y);
		System.out.println("With Class B refer: "+b1.z);

	}

}
