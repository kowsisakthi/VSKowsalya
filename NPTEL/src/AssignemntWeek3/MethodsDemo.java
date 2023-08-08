package AssignemntWeek3;

import java.util.Scanner;

public class MethodsDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values caculate the volume of shape");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		Shape t= new Test1(l, h);
		Shape t1= new Test1(l, b, h);
		System.out.println("Area of the shape::"+t1.sum());
		System.out.println("Volume of the shape::"+t.sum());
	
	}

}
class Shape{
	double length, breath;
	
	public Shape(double l,double b) {
		length =l;
		breath=b;
		
	}
	public Shape(double len) {
		length=breath=len;
		//length=len;
		//breath=bre;
	}
	public double sum() {
		return length*breath;
	}
}
class Test1 extends Shape{
  double height;
	public Test1(double len,double h) {
		super(len);
		height=h;
	}
	public Test1(double l,double b,double h) {
		super(l,b);
		height=h;
	}
	public double sum() {
		//System.out.println(length+" "+breath+" "+height);
		return length*breath*height;
	}
	
	
}