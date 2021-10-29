package finalKeyword;

public class Final3 {
	final int Speedlimit;
	Final3() {
		Speedlimit = 80;
		System.out.println(Speedlimit);
	}
	
	public static void main(String[] args) {
		Final3 f3 = new Final3();
		System.out.println(f3.Speedlimit);
	}
}
