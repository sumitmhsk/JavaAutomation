package doubtSesion;

class chain1 {
	// default cons
	chain1() {
		System.out.println("chain1 cons");
	}
}

class chain2 extends chain1 {
	// default cons with super ()
	chain2(int i) {
		super();
		System.out.println("chain2 cons");
	}
}

public class ConsChaining extends chain2 {
	// default cons with super ()
	ConsChaining() {
		super(20);
		System.out.println("chaining cons");
	}
	
	public static void main(String[] args) {
		ConsChaining c1=new ConsChaining();
	}
}