package forloop;

public class WhileLoop1 {

	public static void main(String[] args) {
		int i = 4;
		System.out.println("Printing number 4 to 0");
		while (i >= 0) {
			System.out.println("Hello " + i);
			i--;
		}

		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + " ");
			ch++;
		}

		System.out.println("***********Reverse*********");
		char ch1 = 'z';
		while (ch1 >= 'a') {
			System.out.println(ch1 + " ");
			ch1--;
		}
		
		System.out.println("***********Reverse*********");
		int num = 10;
		while (num >= 0) {
			System.out.println(num + " ");
			num--;
		}

	}

}
