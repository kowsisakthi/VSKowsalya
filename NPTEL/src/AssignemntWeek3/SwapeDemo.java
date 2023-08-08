package AssignemntWeek3;

import java.util.Scanner;

public class SwapeDemo {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Questions qus= new Questions();
	
		swape(qus);
		 System.out.println("After swape ::"+qus.a+"  "+qus.b);
	}
  public static void swape(Questions q) {
	  int temp=q.a;
	  q.a=q.b;
	  q.b=temp;
  }
}
class Questions{
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	int b= sc.nextInt();
	
		
}