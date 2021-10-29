package doubtSesion;
class parent {
	void Home() {
		System.out.println("parent home");
	}
}

class child101 extends parent {
	void car() {
		System.out.println("child car");
	}
}

public class NonPrimitiveCasting {

	public static void main(String[] args) {
		parent p1=new child101();//auto-casting or implicit upcasting
		//child101 c1=new child101();
		//child101 c1=new parent(); //downcasting
		
		child101 c2=(child101)p1;//explicit downcasting

	}

}
