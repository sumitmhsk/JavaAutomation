package ifelse;

public class IfElseLadder {

	public static void main(String[] args) {
		int marks = 76;
		if (marks < 50) {
			System.out.println("Fail");
		} else if (marks > 50 && marks < 60) {
			System.out.println("D Grade");
		} else if (marks > 60 && marks < 70) {
			System.out.println("C Grade");
		} else if (marks > 70 && marks < 75) {
			System.out.println("B Grade");
		} else if (marks > 75 && marks < 100) {
			System.out.println("A Grade");
		} else {
			System.out.println("Invalid");
		}

	}

}
