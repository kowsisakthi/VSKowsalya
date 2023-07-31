package AssignmentWeek1;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size....");
		int a= sc.nextInt();
		int sum=0;
		
		for(int arr=0; arr<a;arr++) {
			// arr=sc.nextInt();
			if(arr%2==0) {
				int b=arr;
				if(b%3==0) {
					sum= sum+b;
				}
			}
		}
		//System.out.println("the even number is::"+b);
		System.out.println("The sum of the even and divisable by three number is::"+sum);
	}

}
