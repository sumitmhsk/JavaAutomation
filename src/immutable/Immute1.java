package immutable;

final class TestImmutableClass{
	final String name;
	final int salary;
	TestImmutableClass(String s1,int num1){
		name=s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}	
}
public class Immute1 {

	public static void main(String[] args) {
		TestImmutableClass t1=new TestImmutableClass("Nitin",25000);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
		
		TestImmutableClass t2=new TestImmutableClass("Nitin1",250003);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
		
		TestImmutableClass t3=new TestImmutableClass("Nitin222",50000);
		System.out.println(t3.getName());
		System.out.println(t3.getSalary());

	}

}
