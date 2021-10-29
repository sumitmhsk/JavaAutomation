package arrayList;

import java.util.ArrayList;

public class SampleArrayList {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("Pune");
		a1.add("Mumbai");
		a1.add("Chandigarh");
		a1.add("Banglore");
		System.out.println("ArrayList element count: " + a1.size());
		System.out.println("ArrayList elements are: " + a1);
		a1.add(1, "Bhusawal");
		System.out.println("ArrayList element count: " + a1.size());
		System.out.println("ArrayList elements are: " + a1);
	}
}
