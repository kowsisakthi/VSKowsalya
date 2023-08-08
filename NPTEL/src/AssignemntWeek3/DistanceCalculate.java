package AssignemntWeek3;

import java.util.Scanner;

public class DistanceCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four number...");
		Point p1= new Point();
		p1.x=sc.nextDouble();
		p1.y=sc.nextDouble();
		Point p2= new Point();
		p2.x=sc.nextDouble();
		p2.y=sc.nextDouble();
		System.out.println(Point.distance(p1, p2));
	}

}
class Point{
	double x;
	double y;
	public static  double distance(Point p1,Point p2) {
		double result=Math.sqrt((Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2)));
		return result;
	}
}