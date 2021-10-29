package assignment;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2019;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("THE GIVEN YEAR IS LEAP YEAR");
		} else {
			System.out.println("THE GIVEN YEAR IS ORDINARY YEAR");
		}
	}
}
