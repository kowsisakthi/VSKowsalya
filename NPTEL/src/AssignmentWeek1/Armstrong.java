package AssignmentWeek1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number check amstrong");
		int a= sc.nextInt();
		int arm=a;
		int sum=0;
		while(a>0) {
			int r=a%10;
			sum+=(int)Math.pow(r, 3);
			a=a/10;
		}
		if(sum==arm)
		{
			System.out.println("The given number is Armstrong");
		}
		else {
			System.out.println("The given number is not Armstrong");
		}
	}
	
	
}
