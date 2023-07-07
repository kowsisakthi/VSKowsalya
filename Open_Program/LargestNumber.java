package Open_Program;
import java.util.*;
public class LargestNumber {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the first number");
	int first= input.nextInt();
	System.out.println("Enter the Second number");
	int second= input.nextInt();
	System.out.println("Enter the Third number");
	int thired= input.nextInt();
	
	if(first<second)
	{
		if(second<thired) 
		
		{
			if(thired<first)
			{
			System.out.println("The Largest number is:"+first);
			}
			else
			{
				
				System.out.println("The Largest number is:"+thired);
			}
		}
		else
		{
			if(second<thired)
			{
				System.out.println("The Largest number is:"+thired);
			}
			else
			{
				if(second<first)
				{
					System.out.println("The Largest number is:"+first);
				}
				else
				{
					System.out.println("The Largest number is:"+second);
				}
				
			}
		}
		
		
	}
	else
	{
		if(first<thired)
		{
			if(thired<second) 
			{
				
				System.out.println("The Largest number is:"+second);
			}
			else
			{
				System.out.println("The Largest number is:"+thired);
			}
		}
		else 
		{
			System.out.println("The Largest number is:"+first);
		}
		
	}
	
}
}

