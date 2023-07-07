package Close_Program;
import java.util.*;
public class PrimeNumber {
	public static void main (String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= input.nextInt();
		if(number==0 || number==1)
		{
			System.out.println("This is not Prime number:"+number);
			return;
			
		}
		 boolean flag = false;
		    for (int i = 2; i <= number / 2; ++i) {
		      if (number % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(number + " is a prime number.");
		    else
		      System.out.println(number + " is not a prime number.");
		  }
	}


