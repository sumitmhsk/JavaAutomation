package singletonClass;

class Singleton {
	
	private static Singleton single_instance = new Singleton();
	
	public String s;
	
	private Singleton() {
		s = "Hello, I am Singlton class";
	}
	
	public static Singleton getInstanceSingleton() {
		return single_instance;
	}
}

public class Single2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
