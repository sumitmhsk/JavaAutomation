package forloop;

public class Loops4 {

	public static void main(String[] args) {
		Loops4 m1=new Loops4();
		m1.main();
		main1();
	}

	public void main() {
		System.out.println("Print the alphabet upper case");
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.println(a);
		}
	}

	public static void main1() {
		System.out.println("Print the alphabet lower case");
		for (char b = 'a'; b <= 'z'; b++) {
			System.out.println(b);
		}
	}
}
