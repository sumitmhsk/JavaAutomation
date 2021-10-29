package thisKeyword;

class ThisKey4 {
	void m() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisKey4 t3=new ThisKey4();
		t3.m();
		System.out.println(t3);

	}

}
