package constructor;

public class ConsOver {

	public ConsOver() {
		System.out.println("This is a zero-para constructor");
	}
	
	public ConsOver(char c) {
		System.out.println("This is a single-para constructor");
	}

	public ConsOver(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}

	public static void main(String[] args) {
		ConsOver c1 = new ConsOver();
		ConsOver c2 = new ConsOver(10, 20);
		ConsOver c3 = new ConsOver('d');
	}
}
