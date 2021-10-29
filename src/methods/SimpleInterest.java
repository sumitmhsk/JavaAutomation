package methods;

public class SimpleInterest {

	public static void main(String[] args) {
		float principal = 3000, rof = 6, time = 6, interest;

		System.out.println("Enter the principal: " + principal);
		
		System.out.println("Enter Rate Of Interest: " + rof);
		
		System.out.println("Enter No. Of Years: " + time);

		interest = principal * rof * time / 100;
		System.out.println("Simple Interest: " + interest);

	}

}
