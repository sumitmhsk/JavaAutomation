package switchCase;

public class Switch3 {

	public static void main(String[] args) {
		int month = 7;
		switch (month) {
		case 1:
			System.out.println("Month is January");
			break;
			
		case 4:
			System.out.println("Month is April");
			break;
			
		case 7:
			System.out.println("Month is July");
			break;
			
		default:
			System.out.println("Sorry month not found");
			break;
		}
	}

}
