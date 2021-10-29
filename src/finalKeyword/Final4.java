package finalKeyword;

public class Final4 {

	int cube(int num) {
		System.out.println(num);
		num = num + 3;
		return num * num * num;
	}

	public static void main(String[] args) {
		Final4 f4 = new Final4();
		System.out.println(f4.cube(5));
	}

}
