package AssignmentCoreJava;
import java.util.*;
public class Array {
	static int[]array= new int[5];
	public static void main (String[]args)
	{
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the 5 interger value");
		for(int i=0;i<5;i++)
		{
			
			array[i]=input.nextInt();
		}
		
		
		System.out.println("choose the text:(Display or Sum or Average or Maximum or Minimum or Sorting or Search)");
		String name= input.next();
		switch(name)
		{
		case "Display" :
			Display();
			break;
			
		case "Sum":	
			 Sum();
			 break;
			 
		case "Average":	
			Average();
			break;
			
		case "Maximum":	
			Maximum();
			break;
			
		case "Minimum":
			Minimum();
			break;
		case "Sorting":	
			Sorting();
			break;
		case "Search":
			Search();
			break;
			
		}
	}
	
	static void Display()
	{
		for(int i=0; i<array.length;i++)
		{
			System.out.println("Display the value:"+array[i]);
		}
	}
	static void Sum()
	{
		int sum=0;
		for(int i=0; i< array.length;i++)
		{
			sum= sum+array[i];
		}
		System.out.println("The sum of the Array is :"+ sum);
	}
	static void Average()
	{
		int sum=0;
		int avrge=0;
		for(int i=0; i<array.length;i++)
		{
			sum=sum+array[i];
			avrge= sum/5;
		}
		System.out.println("The Avarge is the:"+avrge);
	}
	static void Maximum()
	{
		int max=array[0];
		for(int i=0; i< array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("The maximum value is:"+max);
		
	}
	static void Minimum()
	{
		int min=array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("The mininum number is :"+min);
	}
	static void Sorting()
	{
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0;j<array.length;j++)
			{
				int temp=0;
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
		}
		Display();
	
		
	}
	static void Search() 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter the check number:");
		int search= input.nextInt();
		for(int i=0;i< array.length; i++ )
		{
			if(array[i]==search)
			{
				System.out.println("the value is there:"+array[i]);
			}
			else
			{
				System.out.println("The value is not found");
			}
		}
		
	}
	
}
	
	
	
	
	


	
