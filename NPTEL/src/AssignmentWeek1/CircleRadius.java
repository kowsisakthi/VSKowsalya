package AssignmentWeek1;

import java.util.Scanner;

public class CircleRadius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius size of the circle");
		int a= sc.nextInt();
		if(a<0) {
			System.out.println("pleace enter the greter 0..");
		}
		
		else {
			double perimeter=2*Math.PI*a;
			double Area=Math.PI*a*a;
			System.out.println("the perimeter of the circle is::"+(int)perimeter);
			System.out.println("the Area of the circle is::"+(int)Area);
		}
	}

}
