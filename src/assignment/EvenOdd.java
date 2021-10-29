package assignment;

public class EvenOdd {

	public static void main(String[] args) {
		print();
		EvenOdd obj=new EvenOdd();
		//obj.print();
	}
	static void print() {
		int a=218;
		if(a%2==0) {
			System.out.println("The given number is even: "+a);
		}else {
			System.out.println("The given number is odd: "+a);
		}		
	}

}
