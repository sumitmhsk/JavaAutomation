package variables;

public class AreaOfCircle {

	static double pi=3.14;
	double radius=25;
	
	public double areaofcircle() {
	double area = pi*radius*radius;
	return area;
	//System.out.println("areaofcircle" +area);
	}			
	static public void radius() {
	AreaOfCircle m2=new AreaOfCircle();
	System.out.println("radius"+m2.radius);
	return;
	}
public static void main(String[] args) {

	AreaOfCircle circle=new AreaOfCircle();
//double res;
//res=circle.areaofcircle();
//System.out.println("areaofcircle " +res);
               //or
circle.areaofcircle();
System.out.println("areaofcircle " +circle.areaofcircle());
AreaOfCircle.radius();
}
		
}
