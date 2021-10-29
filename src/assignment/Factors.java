package assignment;

public class Factors {

	public static void main(String[] args) {
		print();
	}
	static void print() {
		int a=66;
		System.out.println("Factors of number: "+a);
		for (int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}

	}

}
