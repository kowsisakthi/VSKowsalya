package AssignmentCoreJava;
import java.util.Scanner;
public class CheckMonth {
	public static void main(String[] args) {
		CheckMonth m= new CheckMonth();
		m.month();
	}

 public  void month()
 {
	 Scanner input= new Scanner(System.in);
	 System.out.println("Enter the month ");
	 String month= input.next();
	 switch(month) {
	 case "January":
		 System.out.println("The days are:31");
		 break;
	 case "February":
		 feb();
		 System.out.println("The days are:29");
		 break;
	 case "March":
		 System.out.println("The days are:31");
		 break;
	 case "April":
		 System.out.println("The days are:30");
		 break;
	 case "May":
		 System.out.println("The days are:31");
		 break;
	 case "June":
		 System.out.println("The days are:30");
		 break;
	 case "July":
		 System.out.println("The days are:31");
		 break;
	 case "August":
		 System.out.println("The days are:31");
		 break;
	 case "September":
		 System.out.println("The days are:30");
		 break;
	 case "October":
		 System.out.println("The days are:31");
		 break;
	 case "November":
		 System.out.println("The days are:30");
		 break;
	 case "December":
		 System.out.println("The days are:31");
		 break;
	 }
	
 }
 public static void feb()
 {
	 int year;
     System.out.println("Enter an Year :: ");
     Scanner sc = new Scanner(System.in);
     year = sc.nextInt();

     if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        System.out.println("Specified year is a leap year");
     else
        System.out.println("Specified year is not a leap year");
 }
}
