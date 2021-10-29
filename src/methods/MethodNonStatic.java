package methods;

public class MethodNonStatic {

	double x = 35, y = 10, z = 45;

	public static void main(String[] args) {
		MethodNonStatic m5 = new MethodNonStatic();
		System.out.println("Input first number: " + m5.x);
		System.out.println("Input Second number: " + m5.y);
		System.out.println("Input Third number: " + m5.z);

		m5.average(20, 80, 64);
	}

	public void average(double p, double q, double r) {
		double res = (p + q + r) / 3;
		System.out.println("The average value is: " + res);
	}
}