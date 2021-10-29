package constructor;

public class Print2 {

	    static int b=10;
		static int h=5;
		static double triangle(int x, int y) {
			double res= 0.5*x*y;
			System.out.println("area of triangle is "+ res);
			return res;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      //Print2 obj = new Print2();
	       //obj.triangle(10, 5);
	       //obj.triangle(15,25);
	       //obj.triangle(20,35);
	       //obj.triangle(30,25);
	       //obj.triangle(40,15);
	      System.out.println(Print2.triangle(20,30));
		}

	}
