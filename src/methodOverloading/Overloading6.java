 package methodOverloading;

class Overloading6 {
	public void disp(char c) {
		System.out.println(c);
	}

	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}

	public static class display {
		public static void main(String[] args) {
			Overloading6 d1 = new Overloading6();
			d1.disp('d');
			d1.disp('d', 10);

		}
	}
}
