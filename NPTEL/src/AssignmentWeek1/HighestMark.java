package AssignmentWeek1;

import java.util.Scanner;

public class HighestMark {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the array size");
		
		int a= sc.nextInt();
		//int arr[]=new int[a];
		int sum=0;
		int max=0;
		double avr=0;
		for(int i=0; i<a;i++) {
			
			int arr=sc.nextInt();
			sum= sum+arr;
			if(arr>max) {
				max=arr;
			}
			
		}
		avr=sum/a;
		System.out.println("avarage mark is::"+avr);
		System.out.println("maximum mark is::"+max);
		System.out.println("sum of the mark is::"+sum);
	}

}
