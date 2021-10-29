package ifelse;

public class IfElsePostiveNum {

	// Function to check positive and negative integer
	public static void main(String[] args) {
		int num=56;
		if(num>0) {
			System.out.println("The given number is positive integer");
		} else if(num<0){
			System.out.println("The given number is negative integer");
		}else {
			System.out.println("The given number is zero");
		}
	}
}