package doubtSesion;

public class SampleArray {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		
		int[] num=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		int[] num1= {10,20,30};
		
		System.out.println(num1.length);
		System.out.println(num[1]);
		for(int i=0;i<num1.length;i++) {
			System.out.println(num[i]);
		}

	}

}
