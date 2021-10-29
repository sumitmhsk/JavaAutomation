package ifelse;

public class IfElseDonateBlood {
// Nested if condition
	public static void main(String[] args) {
		int age = 23;
		int weight = 65;
		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("Eligible to donate blood");
			} else {
				System.out.println("Not eligible for blood donation");
			}
		}
	}
}
