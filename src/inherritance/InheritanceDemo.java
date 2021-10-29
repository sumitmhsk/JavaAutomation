package inherritance;

class A11  {
	void addition(int a, int b , double c)
	{
	double Sum = (double)(a+b)+c;
	System.out.println("I am addition");
	}
}
class B11 extends A11 {
	void sub() {
	int x = 30;
	int y = 40;
	double z = 53.45;
	double Sub = (double)(x-y)-z;
	System.out.println("I am Substraction");
	System.out.println("sub = "+sub);
	
	}
}
class C11 extends B11 {
	void mult() {
	int p = 5;
	int q = 2;
	double r = 6.5;
	double mult = (double)(p*q)*r;
	System.out.println("I am Multiplication ");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		C11 c=new C11();
		c.sub();
		c.mult();
		c.addition(10, 25, 15);

	}
}
