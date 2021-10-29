package assignment;

class Vowel {

	public static void main(String[] args) {
		System.out.println("Find the given charactor is vowel or consonant");
		//print('u');
		main('i');
	}

	static void main(char c) {
		if (c == 'a') {
			System.out.println("The given charactor is vowel: " + c);
		} else if (c == 'e') {
			System.out.println("The given charactor is vowel: " + c);
		} else if (c == 'i') {
			System.out.println("The given charactor is vowel: " + c);

		} else if (c == 'o') {
			System.out.println("The given charactor is vowel: " + c);
		} else if (c == 'u') {
			System.out.println("The given charactor is vowel: " + c);
		} else {
			System.out.println("The given charactor is consonant: " + c);
		}
	}

	public static void print(char c) {

		char ch = 'k';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("Charactor is vowel: " + c);
		else
			System.out.println("Charactor is consonant: " + c);

	}
}