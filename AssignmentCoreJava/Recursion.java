package AssignmentCoreJava;
import java.util.*;
public class Recursion {
	Scanner input = new Scanner(System.in);
	public void Factorial()
	{
		int fact=1;
		
		System.out.println("Enter the factorinala number:");
	    int number= input.nextInt();
	    for(int i=1; i<=number;i++)
	    {
	    	fact=fact*i;
	    }
		System.out.println("The factorial number is:"+fact);
		 Factorial();
	}
	
	public void  FibonacciSeries()
	{
		int number1=0;
		int number2=1;
		int number3;
		System.out.println("Enter the count number:");
		int n= input.nextInt();
		int i=1;
		while(i<n)
		{
		number3= number1+number2;
		number1= number2;
		number2=number3;
		
		System.out.println("The fibonaccis number is:"+number3);
		i++;
		}
		FibonacciSeries();
	}
	
	public void   SumofDigits()
	{
		int digit;
		int sum=0;
		System.out.println("Enter the sum of digit number");
		int number= input.nextInt();
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("The sum of the Digit is:"+sum);
		SumofDigits();
	}
	
	public void Palindrome()
	{
		String rev="";
		String same="";
		System.out.println("Enter the String value:");
		String name= input.next();
		int length=name.length();
		for(int i=length-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);  
		      if (name.equals(rev))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");   
		   }  
		 Palindrome();
		}
		
	
	public static void main(String[]args)
	{
		Recursion requr= new Recursion();
		
		//requr.Factorial();
	//	requr.FibonacciSeries();
	//	requr.SumofDigits();
	//	requr.Palindrome();
		Scanner name= new Scanner(System.in);
		System.out.println("Enter the value: Factorial or FibonacciSeries or SumofDigits or Palindrome ");
		String value= name.next();
		switch(value)
		{
		case "Factorial" :
			requr.Factorial();
			break;
			
		case "FibonacciSeries":
		requr.FibonacciSeries();
			break;
			
		case "SumofDigits":
			requr.SumofDigits();
				break;
				
		case "Palindrome":
			requr.Palindrome();
				break;
				
		 default:
			System.out.println("Pleace check the value ");
		
		}
		
	}
}
