package polymorphism;

class shapes {
	public void area() {
		System.out.println("Find the area: ");
	}
	
	public void area(int r) {
		System.out.println("Area of Circle: "+3.14*r*r);
	}
	
	public void area(double b, double h) {
		System.out.println("Area of Triangle: "+0.5*b*h);
	}
	
	public void area(int l, int b) {
		System.out.println("Area of Rectangle: "+l*b);
	}
	
}

public class Poly4 {
//method overloading
	public static void main(String[] args) {
		shapes s1=new shapes();
		s1.area();
		s1.area(5);
		s1.area(10.0, 15.0);
		s1.area(12, 16);

	}

}
